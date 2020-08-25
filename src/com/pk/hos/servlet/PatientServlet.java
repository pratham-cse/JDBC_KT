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
 * Servlet implementation class PatientServlet
 */
@WebServlet("/PatientServlet")
public class PatientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PatientServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HospitalServices hs=new HospitalServices();
		PrintWriter out=response.getWriter();
		String Pname,Ppassword;

		Pname=request.getParameter("Pname");
		Ppassword=request.getParameter("Ppassword");
		boolean flag = hs.PatientLogin(Pname,Ppassword);
	
			  if(flag==true) 
				{
				  
				  HttpSession session=request.getSession();
				  session.setAttribute("Pname", Pname);
				  request.getRequestDispatcher("PatientDetails").forward(request,response);
				 					
			    }
			else
				{
				response.sendRedirect("index.jsp");
					  
			    }

	}

}

	


