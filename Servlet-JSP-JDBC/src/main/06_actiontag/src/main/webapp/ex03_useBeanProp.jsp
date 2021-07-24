<%@page import="com.mystudy.PersonVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파라미터 값 표시</title>
</head>
<body>
<%
	// 한글 처리를 위한 설정(post는 반드시 설정 / get은 선택 사항)
	request.setCharacterEncoding("UTF-8");

	// 파라미터 값 추출
	String name = request.getParameter("name");
	String age = request.getParameter("age");
	
%>
	<h2> 일반적인 파라미터 처리 방식 </h2>
	<h2> 이름 : <%=name %>(local variable) </h2>
	<h2> 나이 : <%=age %>(local variable)  </h2>
	<hr><hr>
	
	<h2> 속성(attribute)를 이용(request scope) </h2>
<%
	request.setAttribute("attr_name", name + "(attr)");
	request.setAttribute("attr_age", age + "(attr)");
%>
	<h2> 이름 : <%=request.getAttribute("attr_name") %> </h2>
	<h2> 나이 : <%=request.getAttribute("attr_age") %>  </h2>
	<hr><hr>
	
	<%-- ===== useBean 액션 태그 ===== --%>
	<%-- 자바빈(Bean)을 이용해서 파라미터 값 저장 사용 / --> setAttribute 값에 자동으로 저장됨  --%>
	
	<%-- 
	// (참고) EL 동작 원리
	// 아래의 useBean 태그가 구현된 방식
	PersonVO person = (PersonVO) request.getAttribute("person");
	if (person == null) { 
		person = new PersonVO();
		request.setAttribute("person", person); // 지역 변수를 저장하여 밖에서 쓸 수있게 설정
	}
	--%>

	<jsp:useBean id="person" class="com.mystudy.PersonVO" scope="request"/> <%-- VO 변수 생성 기능 --%>
	<jsp:setProperty property="*" name="person"/> <%-- setter명 일치하면 모든 동일 값 출력됨 --%>
	
	<%-- 콘솔창에 이름 셋팅되어 출력되는 것 확인 가능!! 일일이 이렇게 불러와도 되지만 위의 문장 사용이 편리함 
		 이름이 서로 다를 경우 param 설정해도 가능 아님 따로 따로 출력하거나 --> 하지만 이름 통일해서 이렇게 한번에 호출하는 것이 나음 --%>
	<%-- <jsp:setProperty property="name" name="person"/> 
		 <jsp:setProperty property="age" name="person"/> --%>
		 
<%
	System.out.println("person : " + person);
	System.out.println("request person : " + request.getAttribute("person"));
%>
	<h2> 빈(Bean) 저장 값 표시 </h2>
	<h2> 이름(표현식) : <%=person.getName() %></h2>
	<h2> 나이(표현식) : <%=person.getAge() %></h2>
	<hr>
	
	<%-- 사용 빈도 매우 낮음 / 이런 개념이 있다는거 알고 넘어가도 됨!! 
		 --> 왜냐하면, 이것 보다 훨씬 쉽고 편한 개념이 있으니까!! --> 그것은 바로 EL --%>
	<h2> 데이터 읽기 : getProperty 액션 태그 </h2> 
	<h2> 이름(액션 태그) : <jsp:getProperty property="name" name="person"/> </h2>
	<h2> 나이(액션 태그) : <jsp:getProperty property="age" name="person"/> </h2>
	<hr>
	
	<h2> EL 사용 getter(request scope 값 사용) </h2> 
	<h2> 이름(EL) : ${person.name } </h2>
	<h2> 나이(EL) : ${person.age } </h2>
	<p>-------------</p>
	<h2> 이름(EL) : ${person.getName } </h2>
	<h2> 나이(EL) : ${person.getAge } </h2>
	
</body>
</html>



















