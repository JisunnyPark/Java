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
<title>첫 페이지</title>
</head>
<body>
	<h1> [ ex02_first.jsp ] </h1>
	전달 받은 파라미터 값 <br>
	<h2> 이름 : <%=name %> </h2>
	<h2> 나이 : <%=age %>  </h2>
	<hr>
	
	<%-- ==== 액션 태그 forward ==== --%>
	<h2> 파라미터 전달 forward(액션 태그) </h2>
	<jsp:forward page="ex02_second.jsp">
		<jsp:param value='<%=name + "-forward" %>' name="name"/>
		<jsp:param value="<%=age + \"-forward\" %>" name="age"/>
	</jsp:forward>
	
	<%-- --> 결론적으로 여기 페이지 출력 안됨. 주소는 first 임에도 불구하고 바로 second으로 forward 했기 때문에
		 	 여기 페이지 점프하고 second 페이지로 넘어가서 출력되는 과정을 확인할 수 있음!! --%>
</body>
</html>













