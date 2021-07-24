<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%-- JSP주석 : 소스보기에서 볼 수 없는 JSP주석(자바주석) --%>
	
	<%-- JSP 구성요소 : 디렉티브(지시어), 선언부, 스크립트릿, 표현식
	1. 디렉티브(<%@  %>) : JSP 페이지에 대한 설정정보 지정
		- page : JSP 페이지에 대한 설정정보 지정
		- include : 특정영역에 다른 문서를 포함할 때 사용
		- taglib : 사용할 태그 라이브러리 지정(JSTL 사용)
	2. 스크립트릿(<%  %>) : 자바코드를 작성하는 영역(service 메소드 로컬영역)
		- service() 메소드 영역에 추가되는 자바 코드(로컬영역)
	3. 표현식(<%=  %>) : 값을 출력(변수값 또는 메소드 리턴값 등 표시할 때)
		- out 객체 사용 출력
	4. 선언부(<%!  %>) : 필드영역에 작성되는 코드(변수, 메소드 선언)
	--%>

<%-- 리다이렉트(redirect), 포워딩(forward) 
1. 리다이렉트(redirect) : response.sendRedirect("이동위치")
	단순한 페이지 전환(새로운 페이지 다시 요청하도록)
	-> request, response 객체가 다시 생성됨
	-> 최초 요청시 요청 파라미터 값을 전달 할 수 없음
	-> 요청 URL 변경됨
	
2. 포워딩(forward) : 전달(또는 위임)의 개념
	1) RequestDispatcher rd = request.getRequestDispatcher("이동위치");
		rd.forward(request, response);
	2) request.getRequestDispatcher("이동위치").forward(request, response);
	-> 최초요청 request, response 객체를 전달 할 수 있음
	-> 최초 요청시 전달된 파라미터 값 전달 가능(위임받은 곳에서 사용 가능)
	-> 요청 URL 변경 없음(최초 요청 주소 그대로 표시됨)
--%>