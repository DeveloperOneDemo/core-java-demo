package exceptionhandling;

public class CustomExceptionDemo {

	public static void main(String[] args) {
	
		int menuOption = 1;
		
		try {
			if(menuOption<1 || menuOption>5) {
				throw new InvalidOptionException(menuOption);
				// System.out.println("after throw");
			}else {
				System.out.println("Valid menu option....");
			}
		}catch(InvalidOptionException ioe) {
			System.out.println(ioe.getMessage());
		}
		

	}

}
