<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	request.
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>응답</title>
</head>
<body>
	<h2>[ ex11_resp_forward.jsp ]</h2>
	<h3> ID : <%=id %> </h3>
	<h3> PW : <%=pwd  %> </h3>
</body>
</html>
<%
	// 포워딩 처리(위임, 전가)
	RequestDispatcher rd = request.getRequestDispatcher("ex11_resp_forward-2.jsp"); // 응답 받을 곳 다른데로 보내버리기
	rd.forward(request, response); // 내장 객체라서 선언 안 하고 바로 사용 가능
	// 아직 응답 안 했기 때문에 전달 가능(--> 이 페이제에서 응답된 것 없음!!)
%>











