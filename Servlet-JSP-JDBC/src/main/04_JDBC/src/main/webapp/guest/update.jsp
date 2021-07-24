<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%-- 전달받은 파라미터 값을 사용해서 DB데이터 수정 
	수정할 데이터 : 성명, 금액, 날짜(SYSDATE)
	정상 처리 후 : list.jsp 이동
	예외 발생 시 : 현재 페이지 보여주기
--%>

<%
	// 전달받은 파라미터 값 확인(추출)
	int sabun = Integer.parseInt(request.getParameter("sabun"));
	String name = request.getParameter("name");
	int pay = Integer.parseInt(request.getParameter("pay"));
	
	// DB 데이터 수정
	// 2. DB 입력 작업
	final String DRIVER = "oracle.jdbc.OracleDriver"; 
	final String URL = "jdbc:oracle:thin:@localhost:1521:xe"; 
	final String USER = "mystudy";
	final String PASSWORD = "mystudypw";
	
	Connection conn = null;	// 오류 뜨는 이유 : 지금 사용할 수 없기 때문 --> 쓸 수 있는 위치가 아님 --> import 처리 필요
	PreparedStatement pstmt = null;	
	ResultSet rs = null;
	
	// 사용할 SQL 쿼리 작성
	int result = 0;
	
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
		String sql = ""
			+ "UPDATE GUEST "
			+ "	 SET NAME = ?, PAY = ?, NALJA = SYSDATE"
			+ " WHERE SABUN = ?";
		
		pstmt = conn.prepareStatement(sql);	// preparedstatement 사용	
		
		//3-2. 바인드 변수에 값 설정
		pstmt.setString(1, name);
		pstmt.setInt(2, pay);
		pstmt.setInt(3, sabun);

		//4. 쿼리 실행 (데이터 갯수 만큼 출력)
		result = pstmt.executeUpdate();
		} //end while
		catch (Exception e) {
			e.printStackTrace();
		} finally {
			//5. 클로징 처리에 의한 자원 반납
			try {	
				if(pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	// 3. 페이지 이동처리
	if (result > 0) { // 입력 처리 됨
		response.sendRedirect("list.jsp");
		// response.sendRedirect("detail.jsp?idx=" + sabun);
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>예외 발생</title>
</head>
<body>
	<h1> 사원 정보 수정 실패 </h1>
	<p> 수정 처리를 하지 못했습니다. <br>
	[상세 페이지로 이동] 클릭해서 다시 작업하세요.
	담당자(8282)에게 연락하세요. </p>
	<a href="detail.jsp?idx=<%=sabun %>"> 상세 페이지로 이동 </a>
	<a href="list.jsp"> 전체 목록 보기 </a>
</body>
</html>