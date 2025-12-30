package com.salman.dao;

import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.salman.entity.employee;

public class employeeDaoImpl implements employeeDao {
	
	private static final String INSERT_QUERY= "INSERT INTO EMPLOYEE (ID,NAME,GENDER,SALARY) VALUES(%d,'%s','%s',%d)";
	private static final String UPDATE_QUERY= "UPDATE EMPLOYEE SET NAME='%s', GENDER='%s', SALARY=%d WHERE ID=%d";
	private static final String DELETE_QUERY= "DELETE FROM EMPLOYEE WHERE ID=%d";
	private static final String GETEMPID = "SELECT * FROM EMPLOYEE WHERE ID=%d";
	private static final String GETEMPNAME = "SELECT * FROM EMPLOYEE WHERE NAME='%s'";
	private static final String GETALLEMP = "SELECT * FROM EMPLOYEE ";
	

	static Connection connection = null;
	
	static {
		try {
			
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","7599");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	

	@Override
	public void saveEmp(employee e) {
		try(Statement statement= connection.createStatement()) {
			/* 2nd way */
			statement.executeUpdate(String.format(INSERT_QUERY, e.getID(), e.getName(),e.getGender(),e.getSalary()));
			System.out.println(String.format(INSERT_QUERY, e.getID(), e.getName(),e.getGender(),e.getSalary()));

			
			/* 1st way for implement with seorate comma 
			statement.executeUpdate("insert into employee(ID,Name,gender,salary) values("+e.getID()+",'"+e.getName()+"','"+e.getGender()+"','"+e.getSalary()+"')");
			 System.out.println("insert into employee(ID,Name,gender,salary) values("+e.getID()+",'"+e.getName()+"','"+e.getGender()+"','"+e.getSalary()+"')");
			 */
		
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
	}

	@Override
	public void updateEmp(employee e) {
			try(Statement statement= connection.createStatement()) {
				statement.executeUpdate(String.format(UPDATE_QUERY, e.getName(),e.getGender(),e.getSalary(),e.getID()));
				System.out.println(statement.executeUpdate(String.format(UPDATE_QUERY, e.getName(),e.getGender(),e.getSalary(),e.getID())));
			} catch (SQLException e1) {
				
				e1.printStackTrace();
			}
		} 

	@Override
	public void deleteEmpById(int ID) {
		try(Statement statement= connection.createStatement()) {
			statement.executeUpdate(String.format(DELETE_QUERY,ID));
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}
		
	}

	
	@Override
	public employee getEmpById(int ID) throws SQLException {
		Statement statement= connection.createStatement();
	     ResultSet rs = statement.executeQuery(String.format(GETEMPID, ID));
			if (rs.next())
			{
			rs.getInt("id");
			rs.getString("name");
			rs.getInt("salary");
			System.out.println(rs.getInt("id")+"\t"+rs.getString("name")+"\t"+ rs.getString("gender")+"\t"+rs.getInt("salary"));

			}
		return null;
		
	}

	@Override
	public employee getEmpByName(String Name) throws SQLException {
		Statement statement= connection.createStatement();
	     ResultSet rs = statement.executeQuery(String.format(GETEMPNAME, Name));
			if (rs.next())
			{
			rs.getInt("id");
			rs.getString("name");
			rs.getInt("salary");
			System.out.println(rs.getInt("id")+"\t"+rs.getString("name")+"\t"+ rs.getString("gender")+"\t"+rs.getInt("salary"));

			}
		return null;
	}

	@Override
	public List getAllEmp() throws SQLException {
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery(GETALLEMP);
		
//		list lst = new list(4,null);
		
		return null;
	}

	@Override
	public void printAllEmp() throws SQLException {
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery("Select * from employee");
		while(rs.next()) {
			rs.getInt("id");
			rs.getString("name");
			rs.getInt("salary");
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+ rs.getString(3)+"\t"+rs.getInt(4));
		}
		
	}


}
