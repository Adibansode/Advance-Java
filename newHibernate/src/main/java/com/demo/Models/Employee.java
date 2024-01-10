package com.demo.Models;

public class Employee {
private int eid;
private String ename;
private String ejob;
private int salary;
public Employee() {
	super();
}
public Employee(int eid, String ename, String ejob, int salary) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.ejob = ejob;
	this.salary = salary;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getEjob() {
	return ejob;
}
public void setEjob(String ejob) {
	this.ejob = ejob;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", ejob=" + ejob + ", salary=" + salary + "]";
}

}
