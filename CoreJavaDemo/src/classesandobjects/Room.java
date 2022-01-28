package classesandobjects;

public class Room {
	int length;
	int breadth;
	int height;
	
	int calculateFloorArea() {
		int floorArea = length * breadth;
		return floorArea;
	}
	
	int calculatePaintingCost(int paintRate) {
		int wallArea = 2 * ((length * height) + (breadth * height));
		return wallArea * paintRate;
	}
}



