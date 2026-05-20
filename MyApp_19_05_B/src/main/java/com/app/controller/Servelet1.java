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
 * Servlet implementation class Servelet1
 */
public class Servelet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servelet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("pdf");
		PrintWriter out = resp.getWriter();
		
		String Name = req.getParameter("fName");
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		String Gender = req.getParameter("gender");
		String age = req.getParameter("age");
		
		Employee e = new Employee();
		
		e.setAge(age);
		e.setFName(Name);
		e.setGender(Gender);
		e.setEmail(email);
		e.setPass(pass);
		
		try {
			
			int status = EmployeeDAO.employeeReg(e);
			if(status==1) {
				resp.sendRedirect("login.html");
			}
			
		} catch (Exception e2) {
			System.out.println("Exception !!!!!!");
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
