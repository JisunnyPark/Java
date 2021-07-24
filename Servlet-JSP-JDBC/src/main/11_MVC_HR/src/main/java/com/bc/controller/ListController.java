package com.bc.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bc.model.DAO;
import com.bc.model.vo.EmployeeVO;

@WebServlet("/list")
public class ListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// index(시작) -> listController(데이터 요청) -> DAO(전달) -> list(실행) 응답 과정
		// list.jsp - form에 post 멘션 안되어있으면 무조건 get 방식!!
		// 1. DB 연결하고 데이터 가져오기
		List<EmployeeVO> list = DAO.getList();
		
		// 2. 응답 페이지(list.jsp)에 전달(request 객체에 속성 값으로 전달)
		request.setAttribute("list", list);
		
		// 3. 응답 페이지 전환(list.jsp 에게)
		request.getRequestDispatcher("list.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8"); // 한글 깨짐 방지 무조건 처리
		doGet(request, response);
	}

}
