package serializationdemo;

import java.io.Serializable;

public class Account implements Serializable {

	private int accNumber;
	private String accName;
	transient private int atmPin;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(int accNumber, String accName, int atmPin) {
		super();
		this.accNumber = accNumber;
		this.accName = accName;
		this.atmPin = atmPin;
	}

	public int getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public int getAtmPin() {
		return atmPin;
	}

	public void setAtmPin(int atmPin) {
		this.atmPin = atmPin;
	}

	@Override
	public String toString() {
		return "Account [accNumber=" + accNumber + ", accName=" + accName + ", atmPin=" + atmPin + "]";
	}
	
	
	
}
