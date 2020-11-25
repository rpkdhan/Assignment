package Assignment;

public class question37_addtionofmatrix {

	public static void main(String[] args) {
		int [][] matrixA = {{1,2,3},{4,5,6},{7,8,9}};
		int [][] matrixB = {{4,5,6}, {2,7,8},{3,1,9}};

	int [][] result = new int [3][3];
	System.out.println(" the result matrix is: ");
	for (int i=0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			result [i][j]= matrixA[i][j]+ matrixB[i][j];
		}
		System.out.println();
	}
			for (int i = 0; i< result.length; i++) {
				for (int j = 0; j < result.length; j++) {
					System.out.print(result[i][j]+" ");
					
				}
				System.out.println();
			}
	}

}
