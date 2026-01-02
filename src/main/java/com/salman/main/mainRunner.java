package com.salman.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;
import com.salman.dao.employeeDao;
import com.salman.dao.employeeDaoImpl;
import com.salman.entity.employee;

public class mainRunner {

	public static void main(String[] args) throws SQLException {
		
		employeeDao eDau = new employeeDaoImpl();
		employee emp = new employee(11,"Rani","female", 75000);
		//eDau.saveEmp(emp);
		//eDau.updateEmp(emp);
		//eDau.deleteEmpById(11);
		
		//eDau.getEmpById(3);
		//eDau.getEmpByName("Salman");
		eDau.getEmpByName("Salman");

		System.out.println("..................................");
		eDau.printEmpByName("Salman 'or' 1=1");
		
		
		/* 2nd way
		  Properties ps = new Properties();
		 
		ps.put("User", "root");
		ps.put("Password", "7599"); 
		*/
		
		
		//DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb",ps).createStatement().executeUpdate("insert into employee(ID,Name,gender,salary) values("+emp.getID()+",'"+emp.getName()+"','"+emp.getGender()+"','"+emp.getSalary()+"')");
		
	/*  3rd way 
	 	Driver driver = new Driver();
		Connection connection = driver.connect("jdbc:mysql://localhost:3306/mydb",ps);
	    Statement statement =connection.createStatement();
	    statement.executeUpdate("insert into employee(ID,Name,gender,salary) values("+emp.getID()+",'"+emp.getName()+"','"+emp.getGender()+"','"+emp.getSalary()+"')");
	*/	
		
	/*	Connection conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","7599");
	    Statement statement = conection.createStatement();
	    statement.executeUpdate("insert into employee(ID,Name,gender,salary) values("+emp.getID()+",'"+emp.getName()+"','"+emp.getGender()+"','"+emp.getSalary()+"')");
	    */
	  //  statement.executeUpdate("insert into employee(ID,Name,gender,salary) values(8,'Sanam','female','87000')");
	    System.out.println("Query Executed...............");
	    //System.out.println(""+emp.getID()+",'"+emp.getName()+"','"+emp.getGender()+"','"+emp.getSalary()+"')");

	}

}
