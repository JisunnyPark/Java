<%@page import="java.io.File"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%-- 파일 업로드 처리하고 파일 정보 화면 표시 --%>

<%
	// 한글 처리 위한 UTF-8 설정
	request.setCharacterEncoding("UTF-8");

	// (주의) form 태그에 enctype="multipart/form-data" 설정하면
	// request 객체를 통한 파라미터 값 조회 안됨 --> MultipartRequest 사용해야 함!!
	String name = request.getParameter("name");
	System.out.println("> name : " + name);
	
	// 파일을 저장할 위치
	// String path = "c:/MyStudy/temp";
	String path = this.getServletContext().getRealPath("/upload"); // 현재 객체의 콘텍스트에서 패스를 가져올 수 있음
	System.out.println("path : " + path); // 폴더 위치 콘솔창에 출력
	
	MultipartRequest mr = new MultipartRequest( // 파일 복사 일으키는 객체(?)
			request, // 요청 객체
			path, // 실제 파일을 저장할 경로
			10 * 1024 * 1024, // 업로드 파일의 최대 크기 지정(byte 단위)
			"UTF-8", // 인코딩 형식
			new DefaultFileRenamePolicy()); // 파일명이 같다면 저장될 때 파일 덮어쓰기되므로 그것을 방지하기 위한 1, 2, 3.. 붙여서 이름 변경을 해줌 
%>
	<h1> 파일 업로드 결과 보기 </h1>
	<h2> 올린 사람(name) : <%=mr.getParameter("name") %> </h2>
	<h2> 제목(subject) : <%=mr.getParameter("title") %> </h2>
	<h2> 파일(f_name) : <%=mr.getParameter("f_name") %> </h2> <%-- getParameter 대신 original~~ 메서드를 사용하자 --%>
	<h2> 원본 파일명 : <%=mr.getOriginalFileName("f_name") %> </h2>	<%-- 사용자가 사용하는(업로드한) 파일 --%> 
	<h2> 저장 파일명 : <%=mr.getFilesystemName("f_name") %> </h2>	<%-- 물리적으로 저장되는 파일(우리가 사용할 파일) --%> 
	<h2> 파일 타입 : <%=mr.getContentType("f_name") %> </h2>
	<hr>
	
<%
	File file = mr.getFile("f_name");
	out.println("<h2> 파일 이름 : " + file.getName() + "</h2>");
	out.println("<h2> 파일 크기 : " + file.length() + "</h2>"); // KB 출력
%>
	<h2> 파일 다운로드 </h2>
	<a href="download.jsp?path=upload&name=<%=mr.getFilesystemName("f_name") %>"> 다운로드 할 파일(<%=mr.getOriginalFileName("f_name") %>) </a>
	
	
	
	
	
	
	
	
	
	
	
	
	