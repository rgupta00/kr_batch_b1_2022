package backup;

public class Employee  {
	private int id;
	private String name;
	private double salary;
	private static String companyName;
	
	
	//static init block: used for static data and just called once before class was loaded by class loaded ( jvm)
	

	
	//init block.... DRY Don't repeat yourself prin....
	
	//always before the ctr was called
	{
		System.out.println("it is a common code B2");
	}
	{
		System.out.println("it is a common code B1");
	}
	
	
	static{
		companyName="kronos";
		System.out.println("it is my static init block");
	}
	
	static{
		
		System.out.println("it is my sec static init block");
	}
	
	
	public Employee() {
		//this(3,"foo",5888);
	}
	
	public Employee(int id, String name, double salary) {
		
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public void print() {
		System.out.println("id: "+ id);
		System.out.println("name: "+ this.name);
		System.out.println("salary: "+ this.salary);
	}
	
}
