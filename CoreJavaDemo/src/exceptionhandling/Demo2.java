package exceptionhandling;

public class Demo2 {

	public static void main(String[] args) {
		
		int option = 2;
		int num1 = 5;
		int num2 = 0;
		int result = 0;
		int[] marks = new int[5];
		
		try {
			if(option == 1) {
				result = num1/num2;
			}else if(option == 2) {
				System.out.println(marks[10]);
			}
		}catch(ArithmeticException ae) {
			// log the exception to a log file
		}catch (ArrayIndexOutOfBoundsException aiob) {
			System.out.println(aiob.getMessage());
		}catch(Exception e) {
			
		}
		

		System.out.println("Over....");
	}

}
