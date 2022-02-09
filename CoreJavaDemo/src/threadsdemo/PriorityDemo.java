package threadsdemo;

public class PriorityDemo {

	public static void main(String[] args) {

		//thread with higher priority is given more preference to use the processor
		//default priority of main is 5
		//default priority of child thread - is the same as the priority of it's 
		//										parent at the time of spawning it
		
		
		HigherPriorityThread hpt = new HigherPriorityThread();
		
		LowerPriorityThread lpt = new LowerPriorityThread();
		
		hpt.myThread.setPriority(Thread.MAX_PRIORITY);
		
		lpt.myThread.setPriority(Thread.MIN_PRIORITY);
		
		hpt.myThread.start();
		
		lpt.myThread.start();
	
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		hpt.myThread.stop();
		lpt.myThread.stop();
		
		
		System.out.println("counter of HigherPriorityThread : " + hpt.counter);
		System.out.println("counter of LowerPriorityThread : " + lpt.counter);

	}

}
