package com.pk.hos.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pk.hos.model.Doctor;
import com.pk.hos.services.HospitalServices;

/**
 * Servlet implementation class PatientDetails
 */
@WebServlet("/PatientDetails")
public class PatientDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PatientDetails() {
        super();
        // TODO Auto-generated constructor stub
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
		
		HttpSession session=request.getSession(false);
		HospitalServices hs=new HospitalServices();
		if(session!=null && session.getAttribute("Pname")!=null)
		{
			String Pname=""+session.getAttribute("Pname");
			
			List<Doctor> dList=new ArrayList<>();
			dList=hs.ListOfDoctor(Pname);
			request.setAttribute("dList",dList);
			request.getRequestDispatcher("Patient.jsp").forward(request,response);
		}
		
	}
	}


