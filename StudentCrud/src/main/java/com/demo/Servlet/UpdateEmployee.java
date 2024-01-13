package com.demo.Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.Service.EmployeeServiceImpl;
import com.demo.Service.IEmployeeService;
import com.demo.Models.*;

@WebServlet("/updateemp")
public class UpdateEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	IEmployeeService e2=new EmployeeServiceImpl();
	int id=Integer.parseInt(request.getParameter("empid"));
	String ename=request.getParameter("ename");
	String email=request.getParameter("email");
	int contact=Integer.parseInt(request.getParameter("con"));
	Students s1=new Students(id,ename,email,contact);
	e2.UpdateByid(s1);
	RequestDispatcher rd=request.getRequestDispatcher("DisplayEmp");
	rd.forward(request, response);
	}

}
