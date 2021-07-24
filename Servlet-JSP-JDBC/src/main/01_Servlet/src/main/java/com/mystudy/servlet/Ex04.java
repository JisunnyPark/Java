package com.mystudy.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/signup") // ex04_signup -> action값이랑 연결
public class Ex04 extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		// request 객체(인스턴스)로 부터 파라미터 값 추출
		// 1. getParameter(파라미터명) : 하나의 파라미터 값 추출
		// 2. getParameterValues(파라미터명) : 배열 형태 값 추출(ex. 취미 : 여러개 값 들어올 때 / checkbox 사용할 때)
		// 3. getParameterMap(파라미터명) : 파라미터 값을 Map 형태로 추출(자주 쓰이진 않음!!) --> 이름을 잘 모를 때? 사용
		// 기타 getParameterNames() : 파라미터명 확인시 사용
		
		// 전달 받은 회원가입 정보를 추출해서 회원가입 정보를 작성 후 응답 처리
		// 요청 정보 추출
		String name = request.getParameter("name");
		System.out.println("name : -" + name + "-");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String email = request.getParameter("email");
		
		// 취미(hobby) 값 추출
		String[] hobby = request.getParameterValues("hobby");
		
		// 서버 콘솔에 값 출력
		System.out.println("----------------------");
		System.out.println("name : " + name);
		System.out.println("id : " + id);
		System.out.println("pwd : " + pwd);
		System.out.println("email : " + email);

		System.out.println("hobby : " + hobby);
		System.out.println("hobby 배열 값 : " + Arrays.toString(hobby));
		// System.out.println("hobby 첫번째 : " + hobby[0]); // nullPoint 익셉션 오류 뜸 체크 안 하면
		
		// ===============================================
		
		// 클라이언트(브라우저) 쪽으로 응답 처리
		response.setContentType("text/html;charset=utf-8"); // 문자셋 지정(한글 처리) / 항상 위에!! 안그러면 한글 깨짐
		PrintWriter out = response.getWriter();
		out.println("<h2> 회원가입 정보 </h2>");
		out.println("<ul>");
		out.println("<li> 이름 : " + name + "</li>");
		out.println("<li> 아이디 : " + id + "</li>");
		out.println("<li> 비밀번호 : " + pwd + "</li>");
		out.println("<li> 이메일 : " + email + "</li>");
		out.println("</ul>");

		
		// 선택된 취미 정보
		out.println("<li> 취미 : ");
		if(hobby == null) {
			out.write("선택 사항 없음");
		} else {
			for (String str : hobby) {
				out.write(str + "&nbsp;&nbsp;"); // &nbsp; : 띄어쓰기
			}
		}
		
		out.println("</li>");
		out.println("</ul>");
	}

}














