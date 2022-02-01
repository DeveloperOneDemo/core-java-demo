package classesandobjects;

public class FordFigo {
	
	// declare a variable - instance variable
	private int modelNo;
	private String color;
	private String carType;
	private String carName;
	
	//getter for modelNo
	public int getModelNo() {
		return modelNo;
	}
	
	//setter for modelNo
	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	String unlockCar() {
		
		// declare a variable - local variables
		
		int temp = 50;
		
		return "FordFigo unlocked";
	}
	
	String lockCar() {
		return "FordFigo locked";
	}
	
	String accelerate() {
		return "FordFigo accelerated!";
	}
	
	String applyBreak() {
		mannualBrakeSystem();
		return "FordFigo applied brake!";
	}
	
	void mannualBrakeSystem() {
		System.out.println("Manual Brakes applied!");
	}
	
}
