<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- DB 연결하고 프로그램 사용해서 사번 구하기(사번 : 가장 큰 사원 번호 + 1111 자동 생성 값으로 등록) --%>
<%
	// JDBC 프로그램 사용해서 사번 구하기(사번 : 가장 큰 사원 번호 + 1111 자동 생성 값으로 등록)
	final String DRIVER = "oracle.jdbc.OracleDriver"; 
	final String URL = "jdbc:oracle:thin:@localhost:1521:xe"; 
	final String USER = "mystudy";
	final String PASSWORD = "mystudypw";
	
	Connection conn = null;	// 오류 뜨는 이유 : 지금 사용할 수 없기 때문 --> 쓸 수 있는 위치가 아님 --> import 처리 필요
	PreparedStatement pstmt = null;	
	ResultSet rs = null;
	
	// 사용할 SQL 쿼리 작성
	String sql = "SELECT MAX(SABUN), NVL(MAX(SABUN),0) + 1111 AS SABUN FROM GUEST";
	int sabun = 0;
	
	try {
		//1. JDBC 드라이버 로딩
		Class.forName("oracle.jdbc.OracleDriver");
	} catch (Exception e) {
		e.printStackTrace();
	}
		//2. DB연결  - Connection 객체 생성 <-DriverManager			
	try { 
		conn = DriverManager.getConnection( // url 정해져있는 것임(구글링 하면 나옴)
			"jdbc:oracle:thin:@localhost:1521:xe", 
			"mystudy", "mystudypw");
		
		//3. Statement문 실행(SQL문 실행)	
		//3-1. Connection 객체로 부터 PreparedStatement 객체 생성
		pstmt = conn.prepareStatement(sql);	// preparedstatement 사용			

		//4. 쿼리 실행
		rs = pstmt.executeQuery();
		if (rs.next()) {
			sabun = rs.getInt("SABUN");
		}
		 rs.close(); //end while
	} catch (Exception e) {
			e.printStackTrace();
	} finally {
			//4. 클로징 처리에 의한 자원 반납
			try {
				if(pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사원 등록</title>
</head>
<body>
	<h1> 사원 등록 </h1>
	<form action="insert.jsp">
	<table border>
		<tr>
			<th> 사번 </th>
			<td><input type="text" name="sabun" value="<%=sabun %>" readonly></td>
		</tr>
		<tr>
			<th> 성명 </th>
			<td><input type="text" name="name"></td>
		</tr>
		<tr>
			<th> 금액 </th>
			<td><input type="text" name="pay"></td>
		</tr>
		<tr>
			<td colspan="2">
			<input type="submit" value="사원 등록">
			<input type="reset" value="초기화">
			</td>
			
		</tr>
	</table>
	</form>
</body>
</html>