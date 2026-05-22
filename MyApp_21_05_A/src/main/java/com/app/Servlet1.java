package com.app;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Servlet implementation class Servelet1
 */
//@WebServlet("/serv1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ServletConfig sc ;
	private String drivername; 
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }
   

	@Override
	public void init() throws ServletException {
		
		sc = getServletConfig();
		drivername = sc.getInitParameter("driver");
		System.out.println("Driver : "+drivername);
		
	}


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		System.out.println("In post Method!!!!");
		Enumeration<String> e = sc.getInitParameterNames();
		System.out.println("all through s1");
		while(e.hasMoreElements()) {
			String str = e.nextElement();
			resp.getWriter().write(str+"  "+sc.getInitParameter(str)+"<br>");
			System.out.println(str+"  "+sc.getInitParameter(str));
			
			
			}
		req.getRequestDispatcher("serv2").include(req, resp);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
