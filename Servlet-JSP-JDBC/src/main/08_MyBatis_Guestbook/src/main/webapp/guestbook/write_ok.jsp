<%@page import="org.apache.ibatis.session.SqlSession"%>
<%@page import="com.bc.mybatis.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 전달 받은 데이터를 DB에 저장 
	입력 성공시 : 목록 페이지로 이동(list.jsp)
	입력 실패(예외) : 메시지 표시 후 이전 화면(입력 페이지) 이동
--%>
<% 
	// 0. 한글 처리
	request.setCharacterEncoding("UTF-8");

	// 1. 파라미터 값 추출해서 VO에 저장
%>
	<jsp:useBean id="guestbookVO" class="com.bc.mybatis.GuestbookVO" />
	<jsp:setProperty property="*" name="guestbookVO" />
<%
	System.out.println("> guestbookVO : " + guestbookVO);

	// 2. SqlSession 객체 생성
	SqlSession ss = DBService.getFactory().openSession(true); // 자동 커밋 상태(실행시 자동 커밋 됨)
	
	// 3. 매퍼의 insert SQL 실행
	try{
		ss.insert("guestbook.insert", guestbookVO);
		// 4. 페이지 이동 처리(정상 처리시)
%>
	<script> 
		alert("정상 입력 되었습니다\n목록 페이지로 이동합니다");
		location.href = "list.jsp";
	</script>
<%
	} catch (Exception e) {
		// 4. 페이지 이동 처리(예외 발생)
		e.printStackTrace();
%>
		<script> 
			alert("[예외 발생] 입력 중 예외가 발생했습니다. \n"
				+ "담당자(8282)에게 연락하세요.\n"
				+ "이전 페이지로 이동합니다");
			history.back();
		</script>
<%
	} finally {
		ss.close();
	}
%>


























