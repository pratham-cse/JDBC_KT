package com.pk.hos.services;

import java.util.ArrayList;
import java.util.List;

import com.pk.hos.dao.DoctorDao;
import com.pk.hos.dao.DoctorDaoImplDB;
import com.pk.hos.dao.PatientDao;
import com.pk.hos.dao.PatientDaoImplDB;
import com.pk.hos.dao.RecordDao;
import com.pk.hos.dao.RecordDaoImplDB;
import com.pk.hos.model.Doctor;
import com.pk.hos.model.Patient;
import com.pk.hos.model.Record;


public class HospitalServices {
	
	
	PatientDao pdao=new PatientDaoImplDB();
	DoctorDao ddao=new DoctorDaoImplDB();
	RecordDao rdao=new RecordDaoImplDB();
	Patient p =new Patient();
	Doctor d=new Doctor();
	Record r =new Record();
	
	
	public boolean DoctorLogin(String Dname,String Dpassword)
	{	
	
	
	d=ddao.find(Dname);
	if(d.getDname().equals(Dname) && d.getDpassword().equals(Dpassword))
		{
		return true;
		}
	else {
		return false;
		}

	}
	
	public boolean PatientLogin(String Pname,String Ppassword)
	{	
	
	
	p=pdao.find(Pname);
	if(d.getDname().equals(Pname) && d.getDpassword().equals(Ppassword))
		{
		return true;
		}
	else {
		return false;
		}

	}
	
	public List<Patient> ListOfPatient(String Dname)
	{
		List <Patient> patients=new ArrayList();
		patients=pdao.findAll();
		for(int i = 0; i < patients.size(); i++)
		{
		    p=patients.get(i);
		    
		    	patients.add(p);
		    
		}
		return patients;
		

	}
	
	
	public List<Doctor> ListOfDoctor(String Pname)
	{
		List <Doctor> doctors=new ArrayList();
		doctors=ddao.findAll();
		for(int i = 0; i < doctors.size(); i++)
		{
		    d=doctors.get(i);
		    
		    doctors.add(d);
		    
		}
		return doctors;
		

	}
	
	
	
	
	

}
