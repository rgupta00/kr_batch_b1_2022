
public class C_Demo2DArray {

	public static void main(String[] args) {

//		int a[]= {3,5,7,8,9,11};

//		int a[][]= new int[4][3];

		int a[][] = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
		// check for identity matrix: dry run
		// proof by contradition:

		
		print2DArray(a);

		boolean isIdentity = checkForIdentityMatrix(a);
		System.out.println(isIdentity? "it is identity matrix": "not ...");	

	}

	static boolean checkForIdentityMatrix(int[][] a) {
		 boolean isIdentity=true;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (i == j) {
					if (a[i][j] != 1) {
						isIdentity = false;
						break;
					}
				} else {
					if (a[i][j] != 0) {
						isIdentity = false;
						break;
					}
				}
			}	
		}
		return isIdentity;
	}

	static void print2DArray(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}

}
