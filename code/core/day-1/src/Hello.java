//play with code
public class Hello {

	public static void main(String[] args) {
		System.out.println("we are thinker not typist :)");
		
		int total =0;
		//to pass the command line args
	
		//traditional way
//		for(int i=0;i<args.length; i++) {
//			System.out.println(args[i]);
//		}
		
		
		//enhance for loop
		for(String arg: args) {
			total +=Integer.parseInt(arg);	//extract out int from string
		}
		System.out.println(total);
	}
}
