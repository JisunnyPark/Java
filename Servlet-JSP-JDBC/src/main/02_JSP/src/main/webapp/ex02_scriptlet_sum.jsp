<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>합계 구하기</title>
</head>
<body>
	<h1> ex02_scriptlet_sum.jsp </h1>
	<h1> 1부터 10까지 합계 구하기 </h1>
	<h3> 출력 형태 : 1+2+3+...+9+10=55 </h3>
	<%
	int sum = 0;
	for (int i = 1; i <= 10; i++) {
		sum += i;
	}
	%>
	<h3> 1+2+3+...+9+10 = <% out.println(sum); %> </h3> <%-- 계속 작성하는 것이 번거로움 --%>
	<h3> 표현식 : 1+2+3+...+9+10 = <%=sum %> </h3> <%-- > 표현식 사용하면 훨씬 간단, 편리!! --%>
	
</body>
</html>














