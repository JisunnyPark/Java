<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>액션 태그-include</title>
</head>
<body>
<%-- JSP 액션 태그 : JSP 페이지의 흐름 제어할 때 사용
	 사용 형태 : <jsp:액션명령></jsp:액션명령>
	 		  <jsp:액션명령 />
--%>
	<h1> 디렉티브/액션태그 - include </h1>
	<hr>
	<h2> 디렉티브(지시어) - include </h2>
	<%@ include file="ex01_includee1.jspf" %>
	<hr>
	<%@ include file="ex01_includee2_param.jsp" %> <%-- 결과 안 뜸 뭐 파라미터 받을게 없어서(?) --%>
	
	
	<hr><hr>
	<%-- ================================================== --%>
	<%-- 주석, 인코딩 문장까지 다 출력 됨!! --> 컴파일 되고 결과를 보는 태그이기 때문에 jspf 형식을 쓸 필요가 없다 
	 --> 액션 태그를 사용할 때는 jsp 형식을 사용하자!! --%>
	 
	<h2> 액션 태그 - jsp:include </h2>
	<jsp:include page="ex01_includee1.jspf"></jsp:include>
	<hr>
	<jsp:include page="ex01_includee.jsp"></jsp:include>
	<hr><hr>
	
	<h2> 액션 태그 - jsp:include(파라미터 전달) </h2>
	<jsp:include page="ex01_includee2_param.jsp">
		<jsp:param value="홍" name="name"/>
		<jsp:param value="27" name="age"/>
	</jsp:include>
	
</body>
</html>

















