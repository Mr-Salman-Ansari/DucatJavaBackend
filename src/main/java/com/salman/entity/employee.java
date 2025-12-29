package com.salman.entity;

public class employee {
 private int ID;
 private String Name,gender;
 private int salary;
 
 
 public employee() {
	super();
 }
 
 
 public employee(int iD, String name, String gender, int salary) {
	super();
	ID = iD;
	Name = name;
	this.gender = gender;
	this.salary = salary;
 }


 public int getID() {
	return ID;
 }


 public void setID(int iD) {
	ID = iD;
 }


 public String getName() {
	return Name;
 }


 public void setName(String name) {
	Name = name;
 }


 public String getGender() {
	return gender;
 }


 public void setGender(String gender) {
	this.gender = gender;
 }


 public int getSalary() {
	return salary;
 }


 public void setSalary(int salary) {
	this.salary = salary;
 }


 @Override
 public String toString() {
	return "employee [ID=" + ID + ", Name=" + Name + ", gender=" + gender + ", salary=" + salary + "]";
 } 
 
 
 
 
 
 
}
