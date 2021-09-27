package com.hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	public void init() throws ServletException {
		System.out.println("실행하자마자 제일 먼저 호출되는 함수 - init()");
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("클라이언트 요청이 있을 때 마다 실행된다 - service()");
		
		response.setContentType("text/html"); // 이제부터 들어오는 문자들을 html로 인식하라는 명령어?
		
		PrintWriter out = response.getWriter();// 웹으로 보내주는 IO
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("Hello Servlet!!");
		out.println("</body>");
		out.println("</html>");
		
	}
       
	@Override
	public void destroy() {
		System.out.println("서블릿 종료될 때 호출된다 - destroy()");
	}
}
