package com.pk.hos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.pk.hos.model.Patient;

public class PatientDaoImplDB implements PatientDao {
	
	Connection connection = DBConnection.getConnection();
	
	private Patient getPatientFromRS(ResultSet rs){
		    
		    try {
		        int Pid = rs.getInt("Pid");
		        String name = rs.getString("Pname");
		        int Checked = rs.getInt("Checked");
		        String Ppassword = rs.getString("Ppassword");
		        
		        Patient p = new Patient(Pid,name,Checked,Ppassword);
		        return p;
		    } catch (SQLException e) {
		    e.printStackTrace(); }
		    return null;
		}
		

	@Override
	public Patient find(String p) {
		PreparedStatement pst;
	    try{
	        connection = DBConnection.getConnection();
	        pst = connection.prepareStatement("select * from Patient where Pname = ?");
	        pst.setString(1, p);
	        ResultSet rs = pst.executeQuery();

	        if(rs.next()){
	            return getPatientFromRS(rs);
	        }
	        return null;
	    } catch (SQLException e){
	        e.printStackTrace();
	    }
	    return null;
	}

	@Override
	public List<Patient> findAll() {
		PreparedStatement pst;
	    try{
	        connection = DBConnection.getConnection();
	        pst = connection.prepareStatement("select * from patient");
	        ResultSet rs = pst.executeQuery();
	        List<Patient> patients = new ArrayList<>();

	        while(rs.next()){
	        	patients.add(getPatientFromRS(rs));
	        }
	        return patients;
	    } catch(SQLException e){
	    e.printStackTrace();
	    }
	    return null;
	}

	
	

}
