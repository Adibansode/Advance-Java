package com.demo.Models;

public class Cars {
	private int carid;
	private String cartype;
	private String carname;
	public Cars() {
		super();
	}
	public Cars(int carid, String cartype, String carname) {
		super();
		this.carid = carid;
		this.cartype = cartype;
		this.carname = carname;
	}
	public int getCarid() {
		return carid;
	}
	public void setCarid(int carid) {
		this.carid = carid;
	}
	public String getCartype() {
		return cartype;
	}
	public void setCartype(String cartype) {
		this.cartype = cartype;
	}
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	@Override
	public String toString() {
		return "Cars [carid=" + carid + ", cartype=" + cartype + ", carname=" + carname + "]";
	}
	
}
