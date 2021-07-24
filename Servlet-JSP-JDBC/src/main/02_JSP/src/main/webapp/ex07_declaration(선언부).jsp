<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>선언부 메서드</title>
</head>
<body>
	<h2> 덧셈 </h2>
	<h3> 100 + 200 = 300 </h3>
<%
	int a = 200;
	int b = 200;
	int sum = a + b; // 이 곳은 위치에 따라 실행 여부 결정
%>
	<h3> <%=a %> + <%=b %> = <%=sum %></h3>
	<hr>
	
	<h2> 선언부의 메서드 사용 </h2>
	<h3> sum(a, b) : <%=a %> + <%=b %> = <%=sum(a, b) %> </h3>
	<h3> tot 출력 : <%=tot %> </h3>
<%!
	// 선언부에 작성된 코드는 필드 영역에 작성되는 코드
	private int sum(int a, int b) { // 메서드 선언(메서드는 위에 있든 아래에 있든 언제나 호출, 실행 가능)
		return a + b; 
	}
%>
<%!
	int tot = 0; // 필드 변수는 어디에 선언해도 상관없음 --> 하지만 아무데나 놔두면 헷갈리니까 위쪽에 선언하자
%>

</body>
</html>
















