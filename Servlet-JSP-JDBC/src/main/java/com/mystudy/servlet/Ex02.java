package com.mystudy.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/today") // 아래 클래스와 연결하는 매개체
public class Ex02 extends HttpServlet{

	@Override			
	protected void doGet(HttpServletRequest request, HttpServletResponse response) // 변수명 아무렇게 가능!!
			throws ServletException, IOException {
		System.out.println(">> Ex02.doGet() 메서드 실행");
		// 한글 깨짐 방지를 위한 문자 타입 처리(UTF-8)
		response.setContentType("text/html;charset=UTF-8");
		
		// 오늘 날짜를 표시(년월일)
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1; // 달은 0부터 시작이라 +1 해줘야함
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset='UTF-8'>");
		out.println("<title>today</title>");
		out.println("<body>");
		out.println("<h1> 오늘 날짜는? </h1>");
		out.println("<h3> 오늘 날짜는 " + year + "년 " + month + "월 " + day + "일 입니다. </h3>"); 
		//2021 04 27 출력 지금 5월임
		
		out.println("</body>");
		out.println("</head>");
		out.println("</html>");
	
	}
}










