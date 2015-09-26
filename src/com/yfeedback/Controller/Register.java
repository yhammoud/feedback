package com.yfeedback.Controller;

import java.io.IOException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yfeedback.DAO.UserDAO;
import com.yfeedback.DAO.UserDAOImpl;
import com.yfeedback.Model.User;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDAO userDao;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		userDao = new UserDAOImpl();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		User user = new User();
		user.setID(903099750);
		user.setFname(request.getParameter("fName"));
		user.setLname(request.getParameter("lName"));
		try {
            Date dob = (Date) new SimpleDateFormat("MM/dd/yyyy").parse(request.getParameter("dob"));
            user.setDOB(dob);
        } catch (ParseException e) {
            e.printStackTrace();
        }
		user.setEmail(request.getParameter("email"));
		user.setPassword(request.getParameter("password"));
		user.setRole(request.getParameter("role"));
		user.setGender(request.getParameter("gender"));
		System.out.println("ID: " + user.getID() 
				+ "\n first name: " + user.getFname()
				+ "\n last name: " + user.getLname()
				+ "\n email: " + user.getEmail()
				+ "\n password: " + user.getPassword()
				+ "\n role: " + user.getRole()
				+ "\n gender: "  + user.getGender());
		if (userDao.insertUser(user)) {
			System.out.println("Success!");
		} else {
			System.out.println("Failure");
		}
		
	}

}
