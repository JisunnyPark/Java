<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>작업 선택(시작 페이지)</title>
<script>
	function all_search(frm) {
		// 항상 index.jsp 여기서 실행 시작 해야해야 데이터 가져옴
		// frm.action = "list.jsp"; // 예전 방식 JSP 직접 호출
		frm.action = "list"; // list 작업 요청 --> controller(서블릿==교통 정리 역할)에 요청
		frm.submit();
	}
	
	function fullname_search(frm) {
		frm.action = "fullname";
		frm.submit();
	}
</script>
</head>
<body>
	<h1> 작업 선택 </h1>
	<form>
		<input type="button" value="전체 보기" onclick="all_search(this.form)">
		<input type="button" value="성명 검색(성, 이름 포함)" onclick="fullname_search(this.form)">
	</form>
</body>
</html>