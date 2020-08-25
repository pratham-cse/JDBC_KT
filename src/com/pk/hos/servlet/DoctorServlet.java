package com.pk.hos.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pk.hos.services.HospitalServices;

/**
 * Servlet implementation class DoctorServlet
 */
@WebServlet("/DoctorServlet")
public class DoctorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoctorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HospitalServices hs=new HospitalServices();
		PrintWriter out=response.getWriter();
		String Dname,Dpassword;

		Dname=request.getParameter("Dname");
		Dpassword=request.getParameter("Dpassword");
		boolean flag = hs.DoctorLogin(Dname,Dpassword);
	
			  if(flag==true) 
				{
				  
				  HttpSession session=request.getSession();
				  session.setAttribute("Dname", Dname);
				  request.getRequestDispatcher("DoctorDetails").forward(request,response);
				 					
			    }
			else
				{
				response.sendRedirect("index.jsp");
					  
			    }

	}

}
