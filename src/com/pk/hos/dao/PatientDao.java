package com.pk.hos.dao;

import java.util.List;

import com.pk.hos.model.Patient;



public interface PatientDao {
	Patient find(String p);
	List<Patient> findAll();
	
	
	
}
