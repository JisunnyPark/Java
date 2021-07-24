<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 설명</title>
</head>
<body>
	<!-- HTML 주석 : 소스 보기 클릭하면 보이는 HTML 주석문 -->
	<%-- JSP 주석 : 소스 보기에서 볼 수 없는 JSP 주석(자바 주석) --%>
	<%-- JSP 구성 요소 : 디렉티브(지시어), 선언부, 스크립트릿, 표현식 
	1. 디렉티브(<%@ %>) : JSP 페이지에 대한 설정 정보 지정
		- page : JSP 페이지에 대한 설정 정보 지정
		- include : 특정 영역에 다른 문서를 포함할 때 사용
		- taglib : 사용할 태그 라이브러리 지정(JSTL 사용)
	
	2. 스크립트릿(<% %>) : 자바 코드를 작성하는 영역(service 메서드 로컬 영역)
		- service() 메서드 영역에 추가되는 자바 코드(로컬 영역)
	
	3. 표현식(<%= %>) : 값을 출력(변수 값 또는 메서드 리턴 값 등 표시할 때)
		- out 객체 사용 출력
	
	4. 선언부(<%! %>) : 필드 영역에 작성되는 코드(변수, 메서드 선언)
	--%>
	<h1> Hello~ JSP!!! </h1>
	<hr>
	<h3> 만나서 반갑습니다 </h3>
</body>
</html>











