package com.simplilearn.constructor;

public class Employee {
	
	int empId;
	String empName;
	String department;
	float salary;
	
	//default constructor
	public Employee() {
		empId=1;
		empName="Nikunj Soni";
		department="Finance";
		salary=50000;
	}
	
	//parametrized constructor
	public Employee(int empId,String empName,String department,float salary) {
		this.empId=empId;
		this.empName=empName;
		this.department=department;
		this.salary=salary;
	}
	
	public void display() {
		System.out.println("Id: "+empId);
		System.out.println("Name: "+empName);
		System.out.println("Department: "+department);
		System.out.println("Salary: "+salary);
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Employee e= new Employee();
		e.display();
		
		Employee e1= new Employee(12, "Alex", "Banking", 35000);
		e1.display();
		
		
	}

}
