package funcionarios;

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
	
	//Calculate total SALARY
	public void totalSalary(double com) {
		commission = salary*com + salary;
		System.out.println("Salary with an increase of 15%: "+commission);
	}


	
	/*Display employees information
	public void empInfo() {
		System.out.printf("Employee ID - %d, Employee name - '%C', Salary - R$%f, Commission - R$%f"
						   ,id, name, salary, commission);
	}*/

}
