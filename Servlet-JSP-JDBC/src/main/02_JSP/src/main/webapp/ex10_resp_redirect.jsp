<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%-- 일반적 응답 페이지 : 그동안 우리가 resp 페이지 만들면 여기서 실행되게 했음
   		   redirect : 요청한 웹 사이트로 이동 처리 --%>

<%
	// 요청한 웹 사이트로 이동 처리
	String site = request.getParameter("site");
	System.out.println("ex_10_resp_redirect.jsp site >> " + site); // 콘솔창에 naver 출력
	
	switch(site) {
	case "naver" : // 네이버 웹 페이지로 이동 처리	
		response.sendRedirect("http://www.naver.com");
		break;
		
	case "daum" : 	
		response.sendRedirect("http://www.daum.net");
		break;
		
	case "google" : 	
		response.sendRedirect("http://www.googloe.com");
		break;
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>응답</title>
</head>
<body>
	<h1> 응답 페이지(ex_10_resp_redirect.jsp) </h1> 
	
</body>
</html>