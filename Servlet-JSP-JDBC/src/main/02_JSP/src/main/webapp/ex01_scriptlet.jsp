<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 스크립트릿(scriptlet)</title>
</head>
<body>
	<h1> 스크립트릿(scriptlet) </h1>
	<h3> 자바 코드를 작성하는 용도로 사용 </h3>
	<%
	int a = 100;
	int b = 55;
	System.out.println(">> 콘솔창에 출력"); 
	System.out.println("a + b : " + (a + b)); 
	// --> 콘솔에만 출력 --> 화면에 출력 안됨
	%>
	
	<%
	// out : JSP에서 제공하는 내장 객체라서 바로 사용 가능
	// 서블릿(자바) 할 땐 이 문장 선언 안하고 쓰면 오류 났었지만 여기선 정상 인식, 출력 
	// 서블릿 작성시 PrintWriter out = response.getWriter();
	// 형태로 사용했던 out 객체라고 생각하면 된다!!
	out.println("<hr>"); 
	out.println("<p> JSP에서 제공하는 out 객체를 통한 출력 </p>");
	out.println("<h2> a + b : " + (a + b) + "</h2>"); 
	// --> 화면에만 출력
	%>
</body>
</html>
























