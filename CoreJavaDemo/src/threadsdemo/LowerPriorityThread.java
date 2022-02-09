package threadsdemo;

public class LowerPriorityThread implements Runnable{

	int counter;
	Thread myThread;
	
	public LowerPriorityThread() {
		myThread = new Thread(this);
	}

	@Override
	public void run() {
		while(true) {
			counter++;
		}

	}

}
