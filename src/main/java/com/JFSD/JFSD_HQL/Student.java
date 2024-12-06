package com.JFSD.JFSD_HQL;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="stud")

public class Student {
	@Id
	int Sid;
	
	String Sname;
	
	
	String Sgen;
	
	
	String Sdept;
	
	
	String Sprogram;
	
	String Sdob;
	
	String  Sph;
	
	String Sgraduation;
	
	int SCGPA; 
	
	int Sbacklogs;

	
	public int getSid() {
		return Sid;
	}


	public void setSid(int sid) {
		Sid = sid;
	}


	public String getSname() {
		return Sname;
	}


	public void setSname(String sname) {
		Sname = sname;
	}


	public String getSgen() {
		return Sgen;
	}


	public void setSgen(String sgen) {
		Sgen = sgen;
	}


	public String getSdept() {
		return Sdept;
	}


	public void setSdept(String sdept) {
		Sdept = sdept;
	}


	public String getSprogram() {
		return Sprogram;
	}


	public void setSprogram(String sprogram) {
		Sprogram = sprogram;
	}


	public String getSdob() {
		return Sdob;
	}


	public void setSdob(String sdob) {
		Sdob = sdob;
	}


	public String getSph() {
		return Sph;
	}


	public void setSph(String sph) {
		Sph = sph;
	}


	public String getSgraduation() {
		return Sgraduation;
	}


	public void setSgraduation(String sgraduation) {
		Sgraduation = sgraduation;
	}


	public int getSCGPA() {
		return SCGPA;
	}


	public void setSCGPA(int sCGPA) {
		SCGPA = sCGPA;
	}


	public int getSbacklogs() {
		return Sbacklogs;
	}


	public void setSbacklogs(int sbacklogs) {
		Sbacklogs = sbacklogs;
	}


	@Override
	public String toString() {
		return "Student [Sid=" + Sid + ", Sname=" + Sname + ",Sgen =" + Sgen + ", Sdept=" + Sdept + ",Sprogram=" +Sprogram+ ", Sdob=" + Sdob + ",Sph =" + Sph + ", Sgraduation=" + Sgraduation + ",SCGPA=" +SCGPA+  ",Sbacklogs =" + Sbacklogs +  "]";
	}
	
	

}
