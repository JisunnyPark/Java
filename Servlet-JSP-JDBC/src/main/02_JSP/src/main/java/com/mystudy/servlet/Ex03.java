package com.mystudy.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test03")
public class Ex03 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// url에 값이 전달됨 <--> doPost : url에 값이 뜨지 않고 body 영역에 표시
	// --> 개인 정보(id, password) 사용시 doPost를 사용하는 것이 안전!!
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("> doGet() 실행~~");
		
		// 한글 깨짐 방지를 위한 문자 타입 처리(UTF-8)
		response.setContentType("text/html;charset=UTF-8");
		
		// 클라이언트가 전달한 데이터를 받아서 HTML 문서를 만들어서 되돌려주는 작업!!
		// 파라미터 값 : 요청시 서버쪽으로 전달한 값
		// 파라미터 형식 : ?키=값&키=값
		// 작성 예) test03?name=지지&age=29
		// -----------------------------
		// 응답 처리 형식
		// 이름 : 지지
		// 나이 : 29
		// -----------------------------
		
		// request 객체(인스턴스)로 부터 파라미터 값 추출
		// 1. getParameter(파라미터명) : 하나의 파라미터 값 추출
		// 2. getParameterValues(파라미터명) : 배열 형태 값 추출(ex. 취미 : 여러개 값 들어올 때 / checkbox 사용할 때)
		// 3. getParameterMap(파라미터명) : 파라미터 값을 Map 형태로 추출(자주 쓰이진 않음!!) --> 이름을 잘 모를 때? 사용
		// 기타 getParameterNames() : 파라미터명 확인시 사용
		
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		System.out.println("name : " + name + ", age : " + age);
		// --> 값 입력 후 서버 전송 버튼 누르고 서버 실행하면 콘솔창에 정보 출력됨
		
		// 응답 처리
		PrintWriter out = response.getWriter();
		out.println("<h1> 전달 받은 데이터(이름, 나이) </h2>");
		out.println("<h2> 이름 : " + name + "</h2>");
		out.println("<h2> 나이 : " + age + "</h2>");
		// --> 브라우저 화면에 정보 출력됨(나중에 회원 정보 받아서 DB에 데이터 저장할 수 있음!!)
	}


	@Override			// 변수 이름 아무렇게 변경해도 문제 없음!!
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("> doPost() 실행~~");
		
		// doPost는 한글 값 입력하면 깨짐.. 이유는 인코딩이 doPost(url)에 안되어있기 때문 ==> 요청, 응답 모두 UTF-8 처리 해줘야함!!
		request.setCharacterEncoding("UTF-8"); // 전달 받은 데이터 한글 처리
		
		doGet(request, response);
	}
}












