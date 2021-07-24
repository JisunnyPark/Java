<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 전달 받은 데이터를 사용해서 계산 처리 후 결과를 테이블 형태로 작성 
	 서블릿 보다 훨씬 편리하고 시간 단축 되는 것을 확인O!! --%>
<%
	// 1. 전달 받은 파라미터 값 추출
	String name = request.getParameter("name");
	int kor = Integer.parseInt(request.getParameter("kor"));
	int eng = Integer.parseInt(request.getParameter("eng"));
	int math = Integer.parseInt(request.getParameter("math"));
		
	// 2. 계산 처리
	int sum = kor + eng + math;
	double avg = sum * 100 / 3 /100.0; // 90.3333 -> 9033 -> 90.33
		
	// 3. 화면 출력
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>성적 처리 결과 </title>
</head>
<body>
	<h2> 성적 처리 결과 </h2>
	<table border>
		<thead>
		</thead>
		<tbody>
			<tr>
				<th colspan="2"> 성적 처리 결과 </th>
			</tr>
		</tbody>
			<tr>
				<th> 이름 </th>
				<td> <%=name %> </td>
			</tr>
			<tr>
				<th> 국어 </th>
				<td> <%=kor %> </td>
			</tr>
			<tr>
				<th> 영어 </th>
				<td> <%=eng %> </td>
			</tr>
			<tr>
				<th> 수학 </th>
				<td> <%=math %> </td>
			</tr>
			<tr>
				<th> 총점 </th>
				<td> <%=sum %> </td>
			</tr>
			<tr>
				<th> 평균 </th>
				<td> <%=avg %> </td>
			</tr>
	</table>
</body>
</html>