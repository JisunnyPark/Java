<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 한글 처리를 위한 설정(post는 반드시 설정 / get은 선택 사항)
	request.setCharacterEncoding("UTF-8");

	// 파라미터 값 추출
	String name = request.getParameter("name");
	String age = request.getParameter("age");
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>두번째 페이지</title>
</head>
<body>
	<h1> [ ex02_second.jsp ] </h1>
	최종 전달 받은 파라미터 값 <br>
	<h2> 이름 : <%=name %> </h2>
	<h2> 나이 : <%=age %>  </h2>
	<hr>

</body>
</html>