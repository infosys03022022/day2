package infosys.com.day2.membervariables;



public class EmployeeMain {

	public static void main(String[] args) {
	   Employee emp=new Employee();  // object creation is mandatory to access the member of a class
	                                 // to access code,basic and grade which are member of class Employee
	                                 // we first need to create an object of Employee class
	                                 // Employee is a user defined class
	                                 // writing new Employee() is basically creating a new object
	                                 // and at the same time initialising the member of the class
	                                // by invoking constructor
	                                // after creation of the object in RHS , we are assigning
	                                 // the reference of the newly created object in the 
	                                 // reference variable emp which is of type Employee.
	   System.out.println(emp.code);
	   System.out.println(emp.basic);
	   System.out.println(emp.grade);

	}

}
