package threadsdemo;

public class HigherPriorityThread implements Runnable{

	int counter;
	Thread myThread;
	
	public HigherPriorityThread() {
		myThread = new Thread(this);
	}

	@Override
	public void run() {
		
		while(true) {
			counter++;
		}
		
	}
	

}
