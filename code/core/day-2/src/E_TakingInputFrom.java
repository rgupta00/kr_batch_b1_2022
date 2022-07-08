import java.util.Scanner;

public class E_TakingInputFrom {

	public static void main(String[] args) {

		//Decorator design pattern
		Scanner scanner=new Scanner(System.in);
//		int val;
//		System.out.println("PE a no");
//		val=scanner.nextInt();
//		System.out.println(val);
		
		String name;
		System.out.println("PE a name");
		name=scanner.nextLine();
		
		System.out.println(name);
		
	}

}
