package com.mystudy.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/sungjuk")
public class Ex05 extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, 
		HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		
		// 전달 받은 데이터를 연산 처리 후 결과를 응답
		String name = request.getParameter("name");
		
		// 2번 연산 처리를 위해 미리 숫자로 형변환 하는 것이 훨씬 효율적!!
		int kor = Integer.parseInt(request.getParameter("kor"));
		int eng = Integer.parseInt(request.getParameter("eng"));
		int math = Integer.parseInt(request.getParameter("math"));
		
		// 1. 전달 받은 파라미터 값 추출
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		
		// 2. 연산 처리(총점, 평균 구하기)
		int sum = kor + eng + math;
		double avg = sum * 100 / 3 / 100.0; // 90.3333 -> 9033 -> 90.33
		// 나는 왜 Math가 안되지??
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
		// 3. 응답 처리(브라우저 쪽으로)
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		// --> 이렇게 작성을 일일이 하는 것이 번거로움 --> JSP 사용 이유!!
		out.println("<h2> 성적 처리 결과 </h2>");
		out.println("<table border>");
		out.println("<tr>");
		out.println("<th> 이름 </th>");
		out.println("<td>" + name  + "</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th> 국어 </th>");
		out.println("<td>" + kor + "</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th> 영어 </th>");
		out.println("<td>" + eng + "</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th> 수학 </th>");
		out.println("<td>" + math + "</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th> 총점 </th>");
		out.println("<td>" + sum + "</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th> 평균 </th>");
		out.println("<td>" + avg + "</td>");
		out.println("</tr>");
		out.println("</table>");
	}
	}

