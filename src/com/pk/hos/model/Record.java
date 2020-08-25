package com.pk.hos.model;

import java.sql.Date;

public class Record {
	private int Rid;
	private	int Pid;
	private int Did;
	private Date AppointmentDate;
	
	
	public Record() {
		super();
	}


	@Override
	public String toString() {
		return "Record [Rid=" + Rid + ", Pid=" + Pid + ", Did=" + Did + ", AppointmentDate=" + AppointmentDate + "]";
	}


	public Record(int rid, int pid, int did, Date appointmentDate) {
		super();
		Rid = rid;
		Pid = pid;
		Did = did;
		AppointmentDate = appointmentDate;
	}


	public int getRid() {
		return Rid;
	}


	public void setRid(int rid) {
		Rid = rid;
	}


	public int getPid() {
		return Pid;
	}


	public void setPid(int pid) {
		Pid = pid;
	}


	public int getDid() {
		return Did;
	}


	public void setDid(int did) {
		Did = did;
	}


	public Date getAppointmentDate() {
		return AppointmentDate;
	}


	public void setAppointmentDate(Date appointmentDate) {
		AppointmentDate = appointmentDate;
	}
	


}
