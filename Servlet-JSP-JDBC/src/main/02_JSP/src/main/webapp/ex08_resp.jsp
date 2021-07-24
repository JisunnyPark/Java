<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 주문한 내역에 따라 계산하고 결과를 표시 --%>
<%
	// (실습)
	// 1. 파라미터 값 추출
	String coffee = request.getParameter("coffee");
	int su = Integer.parseInt(request.getParameter("su"));
	int money = Integer.parseInt(request.getParameter("money"));
	
	String menu = "메뉴 선택 사항 없음"; 
	int price = 0;
	if (coffee.equals("1")) {
		menu = "아메리카노";
		price = 3000;
	} else if(coffee.equals("2")) {
		menu = "카페모카";
		price = 3500;	
	} else if(coffee.equals("3")) {
		menu = "에스프레소";
		price = 2500;
	} else if(coffee.equals("4")) {
		menu = "카페라떼";
		price = 4000;
	}
	
	// 2. 계산 처리
	int total = su * price;
	int change = money - total;
	
	// 3. 계산 결과 화면에 출력
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주문 결과</title>
</head>
<body>
	<h2> 주문 계산 결과(응답) </h2>
	<ul>
		<li> 커피 종류 : <%=menu %></li>
		<li> 단가 : <%=price %>원 </li>
		<li> 구입 금액 : <%=total %>원 </li>
		<hr>
		<li> 입금액 : <%=money %>원 </li>
		<li> 잔액 : <%=change %>원 </li>
	</ul>
	
<%--
	커피 종류 : 아메리카노
	단가 : 3000원
	수량 : 3
	구입 금액 : 9000원 (단가 * 수량)
	-----------------------------
	입금액 : 10000원
	잔액 : 1000원 (입금액 - 구입 금액)
 --%>
 
</body>
</html>