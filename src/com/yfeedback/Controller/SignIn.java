package com.yfeedback.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yfeedback.DAO.LoginDAO;
import com.yfeedback.DAO.LoginDAOImpl;


/**
 * Servlet implementation class SignIn
 */
@WebServlet("/SignIn")
public class SignIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private LoginDAO loginDao;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignIn() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		loginDao = new LoginDAOImpl();
		super.init(config);
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");  
		PrintWriter pw = response.getWriter();
		String email = request.getParameter("email");//will return value
		String password = request.getParameter("password");
		
		if (email == null || email.length()==0
				|| password == null || password.length() == 0) {
			RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
	        rd.include(request, response);
	        pw.print("Please enter your email and password to sign in!");
		} else if(loginDao.authenticate(email, password)) {
			RequestDispatcher rd = request.getRequestDispatcher("/home.jsp");
			rd.forward(request, response);
		}
		else {
			RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
	        rd.include(request, response);
	        pw.print("Wrong email or password!");
		}
	}

}
