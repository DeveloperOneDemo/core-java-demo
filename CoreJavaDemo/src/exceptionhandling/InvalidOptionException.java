package exceptionhandling;

public class InvalidOptionException extends RuntimeException{

	int menuOption;
	
	public InvalidOptionException(int menuOption) {
		this.menuOption = menuOption;
	}
	
	@Override
	public String getMessage() {
		return menuOption + " is not a valid option. Please enter a valid Option!";
	}
	
	

}
