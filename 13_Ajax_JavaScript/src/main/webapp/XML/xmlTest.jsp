<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ajax XML</title>
</head>
<body>
	<h1> Ajax XML 데이터 요청 처리 </h1>
	
<script>
	// JavaScript에서 Ajax를 사용할 때 XMLHttpRequest 객체 사용
	// 1. XMLHttpRequest 객체 생성
	var request = new XMLHttpRequest();
	
	request.onreadystatechange = function(){
		if (request.readyState == 4 && request.status == 200) { // 응답 완료 & 정상 실행
			// 받은 데이터 확인
			alert("리턴 값 : \n" + request.responseXML);
			console.log(request.responseXML);
			
			// XML 데이터 추출
			var xml = request.responseXML;
			var names = xml.getElementsByTagName("name");
			var prices = xml.getElementsByTagName("price");
			
			// 데이터 사용
			let output = "";
			for (let i=0; i<names.length; i++) {
				console.log(names[i]); // 태그가 저장되어 <name> 우유 </name> 이렇게 출력됨
				let name = names[i].childNodes[0].nodeValue; // 내용만 출력됨
				// console.log(name); 
				let price = prices[i].childNodes[0].nodeValue;
				
				output += "<h2>" + name + " : " + price + "</h2>";
			}
			document.body.innerHTML += output;
		}
	};
	
	// 2. open("전송방식", "요청정보", "비동기여부")
	request.open("GET", "data.xml", true);
	
	// 3. send() 실행
	request.send();
	
</script>
</body>
</html>