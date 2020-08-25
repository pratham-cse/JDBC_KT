package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class BookAppointment
 */
@WebServlet("/BookAppointment")
public class BookAppointment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookAppointment() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		String Dname,Pname;
		HttpSession session=request.getSession();
		Pname=(String)session.getAttribute(Pname);
		Dname=request.getParameter("Dname");
		
	
		boolean flag = BookAppointment(Dname,Pname);
	
			  if(flag==True) 
				{
				  	  
				//  request.getRequestDispatcher("DoctorDetails").forward(request,response);
				  response.getWriter().append("Appointment Booked");
				  response.sendRedirect("Patient.jsp");
					 					
			    }
			else
				{
				response.getWriter().append("Appointment not Booked");
				response.sendRedirect("Patient.jsp");
					  
			    }

	}

}
