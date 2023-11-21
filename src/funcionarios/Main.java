package funcionarios;

public class Main {

	public static void main(String[] args) {

		//employees objects
		Employee Emp1 = new Employee(105, "Sacha", 4500, 15);
		Employee Emp2 = new Employee(122, "Petry", 8500, 8);
		Employee Emp3 = new Employee(89, "Cole", 1600, 0);
		Employee Emp4 = new Employee(12, "Rey", 9200, 12);
		
		//new Company object (adding employees)
		Company company = new Company();
		company.addEmp(Emp1);
		company.addEmp(Emp2);
		company.addEmp(Emp3);
		company.addEmp(Emp4);

		//a
		//b
		//c
		
		//displays the employees
		company.employeeInfo();
	}

}
