package com.app;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Servelet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("pdf");
		PrintWriter out = resp.getWriter();

		String user = req.getParameter("user");
		String pass = req.getParameter("pass");

		if (user.equals("admin") && pass.equals("admin123")) {
			req.getRequestDispatcher("index.html").include(req, resp);
			HttpSession session = req.getSession();

			session.setAttribute("user", user);
			session.setAttribute("pass", pass);
			out.write("Login SucessFull!!!!! \n");
		} else {
			req.getRequestDispatcher("login.html").include(req, resp);
			out.write("Invalid UserName or Passward!!!");
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
