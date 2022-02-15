package com.gur.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorldServlet
 */
@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	public void init(ServletConfig config) throws ServletException {
	 System.out.println("hi i'm in init>>> ");
	}
	 
	public void destroy() {
			System.out.println("i'm in destory>>> ");
	}

 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Hello Servlet </h1>"); 
		out.println("</body>");
		out.println("</html>");
		
		out.close(); 
	}

}
