<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1> 서브 페이지(sub) </h1>
	<a href="main.jsp"> 메인 페이지로 이동 </a>
	<h2> 서브 페이지 내용 </h2>
	<p> ............... </p>
	<p> ............... </p>
	<p> ............... </p>
	<p> ............... </p>
	
	<hr><hr>
	<%-- 디렉티브(지시어, directive) include : copy & paste 적용 방식 --%>
		<%-- 만약에 전화번호 끝자리가 9999로 바꼈는데 수 많은 페이지에서 일일이 전화번호를 바꾼다면 너무 힘들 것.. --> include 사용하자!! --%>
	<%@ include file="01_declaration.jsp" %>
	<%@ include file="02_scriptlet.jspf" %> <%-- 여기서 쓰면 컴파일 오류 나지 않음(?) --%>
	
	<%@ include file="footer.jsp" %>
	<footer> 
	비트캠프 ｜ 서울시 서초구 강남대로 459 (서초동, 백암빌딩)｜ 사업자등록번호 : 214-85-24928
	(주)비트컴퓨터 서초본원 대표이사 : 조현정 ｜ 문의 : 02-3486-9600 ｜ 팩스 : 02-6007-1245
	통신판매업 신고번호 : 제 서초-00098호 ｜ 개인정보보호관리책임자 : 최종진
	</footer>
</body>
</html>