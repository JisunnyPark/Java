package com.mystudy.servlet;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello") // 이 서블릿이 처리되어 호출하는 개념
public class Ex01_Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Ex01_Hello() { // 생성자(메서드 처럼 보이지만 리턴 속성이 없으므로!!)
    	/* 생성자 
    	WAS(Web Application Server - 웹 어플리케이션 서버) : 
    	Servlet 컨테이너, JSP 컨테이너에서 서블릿이 최초 등록 될 때(최초 요청시)
    	한 번만 실행됨 --> 한 번 로딩되면 재 실행되지 않는다
    	두번째 URL 요청 부터는 service() 메서드가 실행됨 */
    	System.out.println(">> 생성자 실행");
    	
    }

	public void init(ServletConfig config) throws ServletException {
		// 서블릿 객체가 처음 생성된 후 최초로 한 번 실행됨
		// 초기화 작업 등을 처리할 때 사용
		System.out.println(">> init() 실행");

	}

	public void destroy() { // 반납 처리할 때 호출됨(서버 중단될 때 호출됨)
		// 서블릿 객체가 내려갈 때(소멸될 때) destroy() 호출되고 삭제됨
		// 사용된 자원 반납 등의 작업 처리
		System.out.println(">> destroy() 실행");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(">> service() 실행 =================");
		
		// 요청 정보를 확인해서 get, post 여부에 따라 분기 처리
		System.out.println("request.getMethod() : " + request.getMethod()); // get 출력
		if (request.getMethod().equalsIgnoreCase("get")) { // 대소문자 구별하지 않고 처리하는 메서드로 확인
			doGet(request, response);
		} else if (request.getMethod().equalsIgnoreCase("post")) {
			doPost(request, response);
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get 방식 요청이 있을 때 호출되는 메서드
		// request : 요청 정보(클라이언트에서 보내온 정보, 데이터)
		// response : 응답 정보(요청에 따른 결과를 전달할 정보, 데이터)
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		
		// 브라우저 화면에 표시(클라이언트) / get은 모두 요청의 개념이라 생각하자!!
		response.getWriter().append("<h1>Hello</h1>"); 
		
		// 이클립스 콘솔창에 표시 / 여러번 호출해도 init은 한 번만 실행 되지만 doGet, doPost은 호출할 때마다 실행됨 --> 
		// service() 있으면 대신 service()가 실행됨!!!!! 
		System.out.println(">> doGet() 실행"); 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// post 방식 요청이 있을 때 호출되는 메서드
		System.out.println(">> doPost() 실행");
		doGet(request, response);
	}

}
