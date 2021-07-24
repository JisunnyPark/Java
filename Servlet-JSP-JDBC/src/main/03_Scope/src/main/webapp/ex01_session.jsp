<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- request, session scope에 설정된 값 추출해서 화면에 표시 --%>
<%
	// request, session에 저장된 데이터 사용
	String req_name = (String) request.getAttribute("req_name");
	String req_age = (String) request.getAttribute("req_age");
	
	String attr_name = (String) session.getAttribute("attr_name");
	String attr_age = (String) session.getAttribute("attr_age");
	if (attr_age == null) {
		attr_age = "세션에 속성 없음(attr_age)";
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션(session) 범위</title>
<script>
	function sessionSet() {
		// location.href = "ex01_sessionSet.jsp"; 
		location.href = "ex01_sessionSet.jsp?name=hong&age=30"; // 파라미터 값 전달 가능
	}
	
	function sessionRemove() {
		location.href = "ex01_sessionRemove.jsp";
	}
	
	function sessionInvalidate() {
		location.href = "ex01_sessionInvalidate.jsp";
	}
</script>
</head>
<body>
	<h1> 세션(session) 테스트</h1>
	<input type="button" value="세션 속성에 저장" onclick="sessionSet()">
	<input type="button" value="세션 속성 삭제" onclick="sessionRemove()">
	<input type="button" value="세션 속성 초기화(무효화)" onclick="sessionInvalidate()">
	<hr>
	
	<h1> 세션 스코프(session) </h1>
	<h2> 이름(session) : <%=attr_name %> </h2>
	<h2> 나이(session) : -<%=attr_age %>- </h2>
	<hr><hr>
	
	<h1> 리퀘스트 스코프(request) </h1>
	<h2> 이름(request) : <%=req_name %> </h2>
	<h2> 나이(request) : <%=req_age %></h2>
	<hr><hr>
	
	<%-- 응답 결과 : 세션은 계속 살아있는데, 리퀘스트는 소멸됨 --%>
	
</body>
</html>

















