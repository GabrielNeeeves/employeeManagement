package funcionarios;

import java.util.Scanner;

public class Employee {

	private int id;
	private String name;
	private double salary;
	private double commission;
	
	public Employee(int id, String name, double salary, double commission) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.commission = commission;
	}
	
	//GET name
	public String getName() {
		return this.name;
	}
	
	//SET name
	public void setName(String name) {
		this.name = name;
	}
	
	
	//GET salary
	public double getSalary() {
		return this.salary;
	}
	
	//SET salary
	public void setSalary(double salary) {	
		this.salary = salary;
	}
	
	
	//GET id
	public int getId() {
		return this.id;
	}
	
	//SET id
	public void setId(int id) {
		this.id = id;
	}
	
	
	//GET commission
	public double getCommission() {
		return this.commission;
	}

	// Método estático para criar um novo Employee a partir da entrada do usuário
    public static Employee createEmployee(Scanner scanner) {
        System.out.println("Insert employee ID: ");
        int empId = scanner.nextInt();

        System.out.println("Type the employee name: ");
        String empName = scanner.next();

        System.out.println("Define employee salary: R$");
        double empSalary = scanner.nextDouble();

        System.out.println("Employee commission -> % ");
        double empCommission = scanner.nextDouble();

        return new Employee(empId, empName, empSalary, empCommission);
    }

}
