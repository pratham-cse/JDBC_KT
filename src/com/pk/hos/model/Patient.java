package com.pk.hos.model;

public class Patient {
	private int Pid;
	private String Pname;
	private int Checked;
	private String Ppassword;
	
	
	@Override
	public String toString() {
		return "Patient [Pid=" + Pid + ", Pname=" + Pname + ", Checked=" + Checked + ", Ppassword=" + Ppassword + "]";
	}

	public Patient() {
		super();
	}

	public Patient(int pid, String pname, int checked, String ppassword) {
		super();
		Pid = pid;
		Pname = pname;
		Checked = checked;
		Ppassword = ppassword;
	}

	public int getPid() {
		return Pid;
	}

	public void setPid(int pid) {
		Pid = pid;
	}

	public String getPname() {
		return Pname;
	}

	public void setPname(String pname) {
		Pname = pname;
	}

	public int getChecked() {
		return Checked;
	}

	public void setChecked(int checked) {
		Checked = checked;
	}

	public String getPpassword() {
		return Ppassword;
	}

	public void setPpassword(String ppassword) {
		Ppassword = ppassword;
	}
	
	
	
	
	

}
