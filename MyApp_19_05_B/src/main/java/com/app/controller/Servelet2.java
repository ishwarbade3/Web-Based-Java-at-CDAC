package com.app.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.app.dao.EmployeeDAO;
import com.app.model.Employee;

/**
 * Servlet implementation class Servelet2
 */
public class Servelet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servelet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("pdf");
		PrintWriter pw = resp.getWriter();
		
		String user = req.getParameter("user");
		String pass = req.getParameter("pass");
		
		Employee e = new Employee();
		e.setEmail(user);
		e.setPass(pass);
		
		try {
			boolean status = EmployeeDAO.validateEmployee(e);
			if(status) {
				pw.write("Login SucessFull!!!!!!");
				resp.sendRedirect("login.html");
			}
			else {
				pw.write("Invalid Username Or Password !!!!!");
				resp.sendRedirect("Registration.html");
			}
			
		} catch (Exception e2) {
			e2.printStackTrace();
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
