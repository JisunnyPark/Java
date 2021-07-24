<%@page import="java.net.URLEncoder"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 전달 받은 사번으로 DB에서 조회해서 가져온 데이터 화면 표시 --%>
<%
	// 1. 전달 받은 값 추출
	int idx = Integer.parseInt(request.getParameter("idx"));	// 파라미터 넘길 때 사번 대신 idx로 했으니까 idx 사용

	// 2. DB 데이터 조회 
	final String DRIVER = "oracle.jdbc.OracleDriver"; 
	final String URL = "jdbc:oracle:thin:@localhost:1521:xe"; 
	final String USER = "mystudy";
	final String PASSWORD = "mystudypw";
	
	Connection conn = null;	// 오류 뜨는 이유 : 지금 사용할 수 없기 때문 --> 쓸 수 있는 위치가 아님 --> import 처리 필요
	PreparedStatement pstmt = null;	
	ResultSet rs = null;
	
	// DB 데이터 저장용 변수 선언
	int sabun = 0; // try 구문 밖에서 선언해야 사용 가능!!
	String name = "";
	Date nalja = null;
	int pay = 0;
	
	try 
	{
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
		
		// 3. Statement문 실행(SQL문 실행)	
		// 3-1. Connection 객체로 부터 PreparedStatement 객체 생성
		// 사용할 SQL 쿼리 작성
		String sql = ""
			+ "SELECT SABUN, NAME, NALJA, PAY "
			+ "		FROM GUEST "
			+ " WHERE SABUN = ? ";	
		pstmt = conn.prepareStatement(sql);	// preparedstatement 사용			
		pstmt.setInt(1, idx);
	
		//4. 쿼리 실행
		rs = pstmt.executeQuery();
		if (rs.next()) {
			sabun = rs.getInt("SABUN");
			name = rs.getString("NAME");
			nalja = rs.getDate("NALJA");
			pay = rs.getInt("PAY");
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
<title>상세 페이지</title>
</head>
<body>
	<h1> 상세 정보 </h1>
		<table border>
		<tr>
			<th> 사번 </th>
			<td> <%=sabun %> </td>
		<tr>
			<th> 성명 </th>
			<td> <%=name %> </td>
		</tr>
		<tr>
			<th> 날짜 </th>
			<td> <%=nalja %> </td>
		</tr>
		<tr>
			<th> 금액 </th>
			<td> <%=pay %> </td>
		</tr>
	</table>
	<a href="editForm.jsp?idx=<%=sabun %>&name=<%=URLEncoder.encode(name, "UTF-8")%>&pay=<%=pay %>"> 수정 </a> <%-- 중간 중간 "", 공백 들어가면 안됨 
	+ name 값에 한글 들어가면 자바 내부 브라우저에서 깨지기 때문에 encoding 사용이 필요 --%>
	<a href="delete.jsp?idx=<%=sabun %>"> 삭제 </a> <%-- 끝 " 앞에 공백 안 들어가게 조심!! --%>
</body>
</html>













