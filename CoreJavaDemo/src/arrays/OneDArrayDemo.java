package arrays;

public class OneDArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mark1; // decalared an int variable
		mark1 = 20;
		
		//int[] myMarks; // declared an int array variable
		//myMarks = new int[5];
		
		// combining into a single line
		int[] myMarks = new int[5];
		
		myMarks[0] = 20;
		myMarks[1] = 30;
		myMarks[2] = 40;
		myMarks[3] = 50;
		myMarks[4] = 60;
		
		for(int i=0; i<myMarks.length; i++) {
			System.out.println(myMarks[i]);
		}
		
		// initialize a 1D Array
		int[] scores = {50, 30, 40, 70};
		
	}

}
