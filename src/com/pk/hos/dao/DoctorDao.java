package com.pk.hos.dao;

import java.util.List;

import com.pk.hos.model.Doctor;


public interface DoctorDao {
	Doctor find(String d);
	List<Doctor> findAll();
	boolean update(Doctor d);

}
