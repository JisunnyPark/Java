<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 회원가입 </title>
<script>
	function send_go(){
		// alert("send_go() 시작");
		// alert(document.frm.name.value); // form 태그에서만 이렇게 접근 가능
		// trim() : 공백 제거 메서드
		
		if (document.frm.name.value.trim() == "") {
			alert("이름을 입력하세요");
			document.frm.name.value = "";
			document.frm.name.focus();
			return false; // 서버 전송 안함
		};
		
		let vForm = document.frm;
		
		if (vForm.id.value.trim().legnth < 1) {
			alert("아이디를 입력하세요");
			vFrom.id.focus();
			return false;
		}
		
		if (vForm.pwd.value.trim().legnth < 1) { // 암호 입력 여부 확인
			alert("암호를 입력하세요");
			document.pwd.value = "";
			vFrom.pwd.focus();
			return false;
		}
		
		if (vForm.pwd2.value.trim().legnth < 1) { // 암호 확인 값 입력 여부 확인
			alert("확인 암호를 입력하세요");
			document.pwd2.value = "";
			vFrom.pwd2.focus();
			return false;
		}
		
		// 암호 일치 여부 확인
		if (vForm.pwd.value != vForm.pwd2.value) {
			alert("암호가 다릅니다. \n 확인 후 다시 입력하세요");
			vForm.pwd.value = ""; // 다시 입력할 수 있도록 값 지워주는 기능
			vForm.pwd2.value = "";
			vForm.pwd.focus(); 	 // pwd 위치로 이동 시켜주는 기능
			return false;
		}
		
		alert(">>>> 회원 가입 요청합니다");
		vForm.action = "ex07_resp.jsp";
		vForm.submit(); // 함수 호출
	}
</script>

</head>
<body>
	<h1> 회원가입 </h1>
	<form name="frm">
		<fieldset>
		<legend> 회원가입 </legend>
		
		<p> 이름 : <input type="text" name="name" value="홍길동"> </p>
		<p> 아이디 : <input type="text" name="id"> </p>
		<p> 비밀번호 : <input type="password" name="pwd"> </p>
		<p> 비밀번호 확인 : <input type="password" name="pwd2"> </p>
		<p> 이메일 : <input type="text" name="email"> </p>
		<p> 취미 : 
			<input type="checkbox" name="hobby" value="운동"> 운동 
			<input type="checkbox" name="hobby" value="게임"> 게임 
			<input type="checkbox" name="hobby" value="영화"> 영화 
			<input type="checkbox" name="hobby" value="독서"> 독서 
		</p>
		<input type="button" value="회원가입" onclick="send_go()">
		<input type="reset" value="초기화">
		</fieldset>
	</form>
</body>
</html>