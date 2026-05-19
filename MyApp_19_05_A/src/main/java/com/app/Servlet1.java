package com.app;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/serv1")
public class Servlet1 extends GenericServlet implements Servlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public Servlet1() {
        super();
        System.out.println("Servelet Instintation !!!!!");
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		super.init();
		System.out.println("In Init !!!");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		super.destroy();
		System.out.println("In destroy !!!");
	}

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		System.out.println("In service !!!!");
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		
		String Nm = req.getParameter("txtNm");
		int age = Integer.parseInt(req.getParameter("txtA"));
		
		if(age > 18) {
			pw.write("Eligible for Voting "+Nm+"\n");
		}else {
			resp.getWriter().write("You cannot Vote!!!!!!!!!!");
		}
		
		resp.getWriter().print(Nm+"  "+age);
		
	}

}
