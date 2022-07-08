
public class A_DemoArray {
	
	public static void main(String[] args) {
		
//		int a[]=new int[5];
//		a[0]=22;
		//
		int a[]= {3,5,7,8,9,11};
		
		//how to print it
//		for(int i=0;i<a.length; i++) {
//			System.out.println(a[i]);
//		}
		System.out.println("printing with traditional loop");
		printArray(a);
		
		//enhance for loop : Java 5
		printUsingEnhanceForLoop(a);
		
		//a method can also return the array
		//we want to double every element and return the array
		
		int b[]= {3,5,7,8,9,11};
		
		int c[]=  doubleArrayAndGetIt(b);
		
		
	}
	
	
	

	private static int[] doubleArrayAndGetIt(int[] b) {
		//logic to double each element of origanl array and then return it
		///
		return null;
	}




	static void printUsingEnhanceForLoop(int[] a) {
		for(int temp: a) {
			System.out.println(temp);
		}
	}

	public static  void printArray(int a[]) {
		
		for(int i=0;i<a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
