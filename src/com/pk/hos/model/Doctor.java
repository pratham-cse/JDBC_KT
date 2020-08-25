package com.pk.hos.model;

public class Doctor {
	private int Did;
	private String Dname;
	private int Fee;
	private String description;
	private	String Dpassword;
	private int numberOfPatientToday;
	
	
	
	@Override
	public String toString() {
		return "Doctor [Did=" + Did + ", Dname=" + Dname + ", Fee=" + Fee + ", description=" + description
				+ ", Dpassword=" + Dpassword + ", numberOfPatientToday=" + numberOfPatientToday + "]";
	}

	public Doctor(int did, String dname, int fee, String description, String dpassword, int numberOfPatientToday) {
		super();
		Did = did;
		Dname = dname;
		Fee = fee;
		this.description = description;
		Dpassword = dpassword;
		this.numberOfPatientToday = numberOfPatientToday;
	}
	
	public Doctor() {
		super();
	}

	

	public int getDid() {
		return Did;
	}

	public void setDid(int did) {
		Did = did;
	}

	public String getDname() {
		return Dname;
	}

	public void setDname(String dname) {
		Dname = dname;
	}

	public int getFee() {
		return Fee;
	}

	public void setFee(int fee) {
		Fee = fee;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDpassword() {
		return Dpassword;
	}

	public void setDpassword(String dpassword) {
		Dpassword = dpassword;
	}

	public int getNumberOfPatientToday() {
		return numberOfPatientToday;
	}

	public void setNumberOfPatientToday(int numberOfPatientToday) {
		this.numberOfPatientToday = numberOfPatientToday;
	}
	
	
	
	
	

}
