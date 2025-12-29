package com.salman.dao;
import java.awt.List;
import java.sql.SQLException;

import com.salman.entity.employee;

public interface employeeDao {
	
	public void saveEmp(employee e);
	
	public void updateEmp(employee e);
	
	public void deleteEmpById(int ID);
	
	public employee getEmpById(int ID) throws SQLException;
	
	public employee getEmpByName(String Name) throws SQLException;
	
	public List getAllEmp() throws SQLException;
	
	public void printAllEmp() throws SQLException;

}
