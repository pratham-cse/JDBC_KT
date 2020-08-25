package com.pk.hos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pk.hos.model.Doctor;

import com.pk.hos.dao.DBConnection;

public class DoctorDaoImplDB implements DoctorDao{
	Connection connection = DBConnection.getConnection();
	
private Doctor getDoctorFromRS(ResultSet rs){
	    
	    try {
	        int Did = rs.getInt("Did");
	        String name = rs.getString("Dname");
	        int Fee = rs.getInt("Fee");
	        String description = rs.getString("description");
	        String Dpassword = rs.getString("Dpassword");
	        int NumberOfPatient=rs.getInt("numberofPatientToday");
	        Doctor d = new Doctor(Did,name,Fee,description,Dpassword,NumberOfPatient);
	        return d;
	    } catch (SQLException e) {
	    e.printStackTrace(); }
	    return null;
	}
	

	@Override
	public Doctor find(String d) {
		PreparedStatement pst;
	    try{
	        connection = DBConnection.getConnection();
	        pst = connection.prepareStatement("select * from doctor where Dname = ?");
	        pst.setString(1, d);
	        ResultSet rs = pst.executeQuery();

	        if(rs.next()){
	            return getDoctorFromRS(rs);
	        }
	        return null;
	    } catch (SQLException e){
	        e.printStackTrace();
	    }
	    return null;
	}

	@Override
	public List<Doctor> findAll() {
		PreparedStatement pst;
	    try{
	        connection = DBConnection.getConnection();
	        pst = connection.prepareStatement("select * from doctor");
	        ResultSet rs = pst.executeQuery();
	        List<Doctor> doctors = new ArrayList<>();

	        while(rs.next()){
	            doctors.add(getDoctorFromRS(rs));
	        }
	        return doctors;
	    } catch(SQLException e){
	    e.printStackTrace();
	    }
	    return null;
	}

	@Override
	public boolean update(Doctor d) {
		try {
            PreparedStatement pst = connection.prepareStatement("update doctor set numberofPatientToday=? where Dname=?");

            pst.setString(2, d.getDname());
            pst.setInt(1, d.getNumberOfPatientToday());
            

            pst.executeUpdate();

        } catch (Exception e) {
            System.out.println("EXCEPTION: " + e);
            return false;
        }
        return true;
	}

}
