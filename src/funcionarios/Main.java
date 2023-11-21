package funcionarios;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Company company = new Company();
		
		System.out.println("# Type your action: ");

		boolean exit = false;
		while(!exit == true) {
			System.out.println("1. Register Employee");
			System.out.println("2. Show total salary");
			System.out.println("3. Display employee informations");
			System.out.println("4. Exit");
			int option = scanner.nextInt();

			switch(option) {
				case 1:
					Employee emp1 = Employee.createEmployee(scanner);
					company.addEmp(emp1);
					break;
				case 2:
					double empSalaries = company.totalSalary();
					System.out.println("Your employees are consting you: "+empSalaries);
					break;
				case 3:
					company.employeeInfo();
					break;
				case 4:
					System.out.println("Program Closed");
					exit = true;
					break;
				default:
					System.out.println("[ERROR]");
			}
		}
		scanner.close();
	}

}
