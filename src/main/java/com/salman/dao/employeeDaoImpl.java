package com.salman.dao;

import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.salman.entity.employee;

public class employeeDaoImpl implements employeeDao {
	
	static Connection connection = null;
	
	static {
		try {
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","7599");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void saveEmpPs(employee e) {
		 PreparedStatement ps;
		 try {
			ps = connection.prepareStatement("INSERT INTO EMPLOYEE VALUES(?, ?, ?, ?) ");
			ps.setInt(1, e.getID());
			ps.setString(2, e.getName());
			ps.setString(3, e.getGender());
			ps.setInt(4, e.getSalary());
			
			ps.executeUpdate();
		 } catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		 }
	}

	@Override
	public void updateEmpPs(employee e) throws SQLException {
      PreparedStatement ps = connection.prepareStatement("UPDATE EMPLOYEE SET NAME=?, GENDER=?, SALARY=? WHERE ID=?");
		
		ps.setString(1, e.getName());
		ps.setString(2, e.getGender());
		ps.setInt(3, e.getSalary());
		ps.setInt(4, e.getID());
		
		ps.executeUpdate();
		
	}

	@Override
	public void deleteEmpByIdPs(int ID) {
		try {
			PreparedStatement ps = connection.prepareStatement("DELETE FROM EMPLOYEE WHERE ID=?");
			ps.setInt(1, ID);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public employee getEmpByIdPs(int ID) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public employee getEmpByNamePs(String Name) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getAllEmpPs() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void printAllEmpPs() throws SQLException {
		// TODO Auto-generated method stub
		
	}
	
}
