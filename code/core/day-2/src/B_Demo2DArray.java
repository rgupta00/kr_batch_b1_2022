
public class B_Demo2DArray {
	
	public static void main(String[] args) {

//		int a[]= {3,5,7,8,9,11};
		
//		int a[][]= new int[4][3];
		
		int a[][]=  {{3,5,9},{1,0,0},{2,4,5},{7,6,7}};
		
		print2DArray(a);
		
	}




	static void print2DArray(int[][] a) {
		for(int temp[]: a) {
			for(int temp2: temp) {
				System.out.print(temp2+" " );
			}
			System.out.println();
		}
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

}
