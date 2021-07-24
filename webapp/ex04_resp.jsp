<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 전달 받은 데이터(파라미터)를 화면에 출력 / JSP 페이지(응답) --%>
<% 
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>(응답) 전달 받은 값 출력</title>
</head>
<body>
	<h1> (응답) 당신이 입력한 값 맞나요? </h1>
	<h2> 아이디 : <%=id %> </h2>
	<h2> 비밀번호 : <%=pw %> </h2>
</body>
</html>