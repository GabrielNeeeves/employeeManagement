package funcionarios;

import java.util.ArrayList;
import java.util.List;

public class Company {
	
	public List<Employee> employeeList;
	
	//CLASS CONSTRUCTOR
	public Company() {
		this.employeeList = new ArrayList<>();
	}
	
	//ADD NEW EMPLOYEE TO LIST
	public void addEmp(Employee newEmployee) {
		employeeList.add(newEmployee);
	}
	
	//DISPLAY TOTAL SALARY PAID
	public double totalSalary() {
		double salaries = 0.0;

		for (Employee i : employeeList) {
			salaries += (i.getSalary() * i.getCommission()) / 100 + i.getSalary();
		}
		
		return salaries;
	}

	//DISPLAY EMPLOYEE INFORMATIONS
	public void employeeInfo() {
		for (Employee i : employeeList) {
			System.out.println("Employee ID: " + i.getId());
	        System.out.println("Name: " + i.getName());
	        System.out.println("Salary: " + i.getSalary());
			System.out.println("Commission: "+i.getCommission());
	        System.out.println();
		}
	}
	
}
