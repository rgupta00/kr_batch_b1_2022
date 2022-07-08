
public class Employee {
	private int id;
	private String name;
	private double salary;
	private static String companyName = "Kronos";

	// getter vs setter

	// setter are mutator ie change the instance variable state:
	public void setSalary(double changedSalary) {
		this.salary = changedSalary;
	}

	// getter: used to get the value

	public Employee() {
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public static String getCompanyName() {
		return companyName;
	}

	public double getSalary() {
		return salary;
	}

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void print() {
		System.out.println("id: " + id);
		System.out.println("name: " + this.name);
		System.out.println("salary: " + this.salary);
	}

}
