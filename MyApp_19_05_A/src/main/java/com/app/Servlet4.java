package com.app;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Servlet4
 */
@WebServlet("/serv4")
public class Servlet4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Servlet4() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());

		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();

		String data = req.getParameter("data");
		String eng = req.getParameter("engine");

		try {
			if (data.trim().length() == 0) {
				throw new Exception();
			}
			if (eng == null) {
				throw new Exception();
			}
			 String url = "";

		        if (eng.equals("google")) {
		            url = "https://www.google.com/search?q=" + data;
		        } 
		        else if (eng.equals("bing")) {
		            url = "https://www.bing.com/search?q=" + data;
		        } 
		        else if (eng.equals("brave")) {
		            url = "https://search.brave.com/search?q=" + data;
		        } 
		        else if (eng.equals("yahoo")) {
		            url = "https://in.search.yahoo.com/search?p=" + data;
		        } 
		        else {
		            throw new Exception();
		        }
			resp.sendRedirect(url);

		} catch (Exception e) {
			resp.sendRedirect("error.html");

		}
		pw.close();
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
