<%@page import="com.bc.mybatis.DBService"%>
<%@page import="org.apache.ibatis.session.SqlSession"%>
<%@page import="com.bc.mybatis.GuestbookVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%-- 전달 받은 데이터(암호)와 DB 저장 암호 일치 여부 확인 후 처리 
	 비교 값 : 전달 받은 pwd와 session의 pwd 값 비교
	 - 일치하면 : DB 데이터 삭제 후 목록 페이지로 이동
	 - 불일치 : 이전 페이지로 이동
--%>

<%
	// 0. 한글 처리를 위한 encoding 설정
	request.setCharacterEncoding("UTF-8");

	String pwd = request.getParameter("pwd");
	
	GuestbookVO vo = (GuestbookVO) session.getAttribute("guestbookVO");
	System.out.println("param pwd : " + pwd + ", vo pwd : " + vo.getPwd());
	
	if (!pwd.equals(vo.getPwd())) { // 불일치
%>
	<script>
		alert("암호 불일치, 암호를 확인하세요");
		history.back();
	</script>
<% 		
	} else { // 암호 일치 - DB 데이터 삭제 후 목록 페이지로 이동
		SqlSession ss = DBService.getFactory().openSession(true);
		
	try {
			ss.delete("guestbook.delete", vo.getIdx());
			
%>	
			<script>
				alert("정상 삭제 되었습니다. 목록 페이지로 이동");
				location.href = "list.jsp";
			</script>
<%
		} catch (Exception e) {
%>			
			<script>
				alert("[예외 발생] 삭제 실패!!! 목록 페이지로 이동");
				location.href = "list.jsp";
			</script>
<% 		} finally {
			ss.close();
		}
	}
%>















