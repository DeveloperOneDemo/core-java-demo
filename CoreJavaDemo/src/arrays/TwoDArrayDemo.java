package arrays;

public class TwoDArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrixA = new int[2][3]; // declaring an array
		
		matrixA[0][0] = 10; // assigning values to an array
		matrixA[0][1] = 20;
		matrixA[0][2] = 30;
		matrixA[1][0] = 40;
		matrixA[1][1] = 50;
		matrixA[1][2] = 60;
		
		for(int i=0; i<matrixA.length; i++) {
			for(int j=0; j<matrixA[i].length; j++) {
				System.out.print(matrixA[i][j] + "   ");
			}
			System.out.println();
		}
		
		
		//initialize an array
		int[][] matrixB = {{10,20,30} , {40,50,60}};
		
	}

}
