package com.pk.hos.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pk.hos.model.Doctor;
import com.pk.hos.model.Record;


public class RecordDaoImplDB implements RecordDao{
	
	Connection connection = DBConnection.getConnection();
	
	private Record getRecordFromRS(ResultSet rs){
		    
		    try {
		        int Rid = rs.getInt("Rid");
		        int Pid = rs.getInt("Pid");
		        int Did = rs.getInt("Did");
		        Date AppointmentDate = rs.getDate("AppointmentDate");
		        
		        Record r = new Record(Rid,Pid,Did,AppointmentDate);
		        return r;
		    } catch (SQLException e) {
		    e.printStackTrace(); }
		    return null;
		}

	@Override
	public Record find(Record r) {
		PreparedStatement pst;
	    try{
	        connection = DBConnection.getConnection();
	        pst = connection.prepareStatement("select * from record where Rid = ?");
	        pst.setInt(1, r.getRid());
	        ResultSet rs = pst.executeQuery();

	        if(rs.next()){
	            return getRecordFromRS(rs);
	        }
	        return null;
	    } catch (SQLException e){
	        e.printStackTrace();
	    }
	    return null;
	}

	@Override
	public List<Record> findAll() {
		PreparedStatement pst;
	    try{
	        connection = DBConnection.getConnection();
	        pst = connection.prepareStatement("select * from record");
	        ResultSet rs = pst.executeQuery();
	        List<Record> records = new ArrayList<>();

	        while(rs.next()){
	            records.add(getRecordFromRS(rs));
	        }
	        return records;
	    } catch(SQLException e){
	    e.printStackTrace();
	    }
	    return null;
	}

	@Override
	public boolean add(Record r) {
		PreparedStatement pst;
		boolean check1 = false;
		
		connection = DBConnection.getConnection();
        try {
			pst = connection.prepareStatement("insert into record(Pid,Did,AppointmentDate) values(?,?,?)");
			
			pst.setInt(2, r.getPid());
			pst.setInt(1, r.getDid());
			pst.setDate(3,r.getAppointmentDate());
			
			check1=pst.execute();
			
			
		} catch (SQLException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        if(check1==true)
		{
		return true;}
		else {
			return false;
		}
		
	}

	

}
