<%@page import="com.mystudy.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%-- 전달받은 데이터(파라미터)를 VO에 저장하고 화면 출력
	1. MemberVO 타입의 객체(memberVO)를 생성
	2. 전달 받은 파라미터 값을 memberVO 객체(인스턴스)에 저장
	3. memberVO 값을 화면에 출력 
 --%>
 <%--
 	MemberVO memberVO = new MemberVO();
 	memberVO.setId(request.getParameter("id"));
 	memberVO.setPwd(request.getParameter("id"));
 	
 	System.out.println("memberVO : " + memberVO);
 --%>
 
	<jsp:useBean id="memberVO" class="com.mystudy.MemberVO" /> <%-- VO 변수 생성 기능 --%>
	<jsp:setProperty property="*" name="memberVO"/>	

 	
<%
	System.out.println("memberVO : " + memberVO);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 정보</title>
</head>
<body>
	<h1> 회원가입 정보 </h1>
	<ul>
		<li> 아이디 : <%=memberVO.getId() %> </li>
		<li> 비밀번호 : <%=memberVO.getPwd() %> </li>
		<li> 이름 : <%=memberVO.getName() %> </li>
		<li> 성별 : <%=memberVO.getGender() %> </li>
		<li> 취미 : <%=memberVO.getHobby() %> </li>
		<li> 취미(배열 값 처리) :
		
		for (String str : memberVO.getHobby()) {
			out.println(str + " ");
			}
		
	</ul>
</body>
</html>