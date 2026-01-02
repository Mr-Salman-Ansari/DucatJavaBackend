package com.salman.dao;
import java.awt.List;
import java.sql.SQLException;

import com.salman.entity.employee;

public interface employeeDao {
	
	public void saveEmpPs(employee e);
	
	public void updateEmpPs(employee e) throws SQLException;
	
	public void deleteEmpByIdPs(int ID);
	
	public employee getEmpByIdPs(int ID) throws SQLException;
	
	public employee getEmpByNamePs(String Name) throws SQLException;
	
	public List getAllEmpPs() throws SQLException;
	
	public void printAllEmpPs() throws SQLException;

}
