package com.bc.ajax.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getIdName")
public class GetIdNameController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setCharacterEncoding("text/html; charset=UTF-8");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		System.out.println(">> id : " + id + ", pwd" + pwd);
		
		// (생략) DB 연동해서 회원 여부 확인 후 필요 데이터 가져오기
		String name = "홍길동";
		
		PrintWriter out = response.getWriter();
		// {"id":"hong", "name":"홍길동"}
		// {"id":"hong", "name":"홍길동", "age" : 27}
		String result = "{\"id\":\"" + id + "\", \"name\":\"" + name + "\"}";
		out.print(result);
		
				
	}
}














