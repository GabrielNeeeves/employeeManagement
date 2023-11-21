package funcionarios;

import java.util.ArrayList;
import java.util.List;

public class Company {
	
	public List<Employee> employeeList;
	
	//class constructor
	public Company() {
		this.employeeList = new ArrayList<>();
	}
	
	//add new Employee to List
	public void addEmp(Employee newEmployee) {
		employeeList.add(newEmployee);
	}
	
	public double totalSalary() {
		double salaries = 0.0;
		
		for (Employee i : employeeList) {
			salaries += (i.getSalary() * i.getCommission()) / 100 + i.getSalary();
		}
		
		return salaries;
	}
	
	public double commission() {
		double commission = 0.0;
		
		for(Employee i : employeeList) {
			commission = ((i.getSalary() * i.getCommission()) /100) + i.getSalary();
		}
		
		return commission;
	}
	
	public void employeeInfo() {
		for (Employee i : employeeList) {
			System.out.println("Employee ID: " + i.getId());
	        System.out.println("Name: " + i.getName());
	        System.out.println("Salary: " + i.getSalary());
	        System.out.println();
		}
	}
	
}
