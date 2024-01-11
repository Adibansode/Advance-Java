package com.demo.Model2;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Course11")
public class Course {
	@Id
	private int cid;
	private String cname;
	@OneToOne
	private faculty f;	
	public Course() {
		super();
	}
	public Course(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}
	public Course(int cid, String cname, faculty f) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.f = f;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public faculty getF() {
		return f;
	}
	public void setF(faculty f) {
		this.f = f;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", f=" + f + "]";
	}
	
	
}
