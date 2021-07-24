<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>선언부 선언 변수</title>
</head>
<body>
<%! // <%! --> 필드 영역이라는 뜻
	// 선언부(declaration)는 필드 영역에 작성되는 코드
	// 선언부에 선언된 필드 변수는 값이 하나(공유해서 사용)
	int globalNum = 0;
%>
<%
	// 스크립트릿 - service() 메서드 영역(로컬 영역, 서비스 요청시 호출 실행)
	// <% --> 서비스 메서드라는 뜻!!
	int localNum = 0; // 지역 변수
	globalNum++;
	localNum++;
	System.out.println("globalNum : " + globalNum);
	System.out.println("localNum : " + localNum);
%>
	<h1> 선언부 선언 변수(전역 변수, 필드 변수) </h1>
	<h2> globalNum : <%= globalNum %></h2> 	<%-- 실행할 때 마다 값이 증가 --%>
	<h2> localNum : <%= localNum %></h2>	<%-- 실행 계속해도 값 유지 / 1 출력 --%>
</body>
</html>











