package com.demo.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="Employe12")
public class Employee {
	@Id
	private int eid;
	private String Ename;
	@ManyToMany
	@JoinTable(name="emp_proj11",joinColumns= {@JoinColumn(name="eid")},
	inverseJoinColumns= {@JoinColumn(name="pid")})	Set<Project> pset;
	public Employee() {
		super();
	}
	public Employee(int eid, String ename, Set<Project> pset) {
		super();
		this.eid = eid;
		Ename = ename;
		this.pset = pset;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public Set<Project> getPset() {
		return pset;
	}
	public void setPset(Set<Project> pset) {
		this.pset = pset;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", Ename=" + Ename + ", pset=" + pset + "]";
	}
	
	
	

}
