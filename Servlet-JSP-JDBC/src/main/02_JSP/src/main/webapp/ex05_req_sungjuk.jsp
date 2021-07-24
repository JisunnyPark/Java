<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>성적 처리</title>
</head>
<body>
	<h2> 성적 처리(요청) </h2>
	<form action="ex05_resp.jsp">
		<p> 이름 : <input type="text" name="name" value="홍길동"> </p>
		<p> 국어 : <input type="number" name="kor" value="100"> </p>
		<p> 영어 : <input type="number" name="eng" value="90"> </p>
		<p> 수학 : <input type="number" name="math" value="81"> </p>
		<input type="submit" value="결과 보기">
		<input type="reset" value="초기화">
	</form>
	
	<h3> 성적 처리 결과 </h3>
	<table border>
		<tr>
			<th> 이름 </th>
			<td> 홍길동 </td>
		</tr>
		<tr>
			<th> 국어 </th>
			<td> 100 </td>
		</tr>
		<tr>
			<th> 영어 </th>
			<td> 90 </td>
		</tr>
		<tr>
			<th> 수학 </th>
			<td> 81 </td>
		</tr>
		<tr>
			<th> 총점 </th>
			<td> 271 </td>
		</tr>
		<tr>
			<th> 평균 </th>
			<td> 90.33 </td>
		</tr>
	</table>
</body>
</html>