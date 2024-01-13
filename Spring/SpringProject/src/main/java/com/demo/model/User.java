package com.demo.model;

public class User {
	private int uid;
	private String uname;
	public User() {
		super();
		System.out.println("default constructor");
	}
	public User(int uid, String uname) {
		super();
		System.out.println("Parametarized constructor");

		this.uid = uid;
		this.uname = uname;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + "]";
	}
	
}
