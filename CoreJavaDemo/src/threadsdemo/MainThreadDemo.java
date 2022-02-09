package threadsdemo;

public class MainThreadDemo {

	public static void main(String[] args) {
	
		Thread mainThread = Thread.currentThread();
		mainThread.setName("MyMainThread");
		
		System.out.println("Thread Name: " + mainThread.getName());
		System.out.println("Priority : " + mainThread.getPriority());
		System.out.println("State of the thread : " + mainThread.getState());
		System.out.println("Thread group : " + mainThread.getThreadGroup());
		System.out.println("Is the thread alive? : " + mainThread.isAlive());
		
		// here we have created a child thread at Java level, not at OS level
		ChildThread ct1 = new ChildThread("MyChildThreadOne");
		ChildThread ct2 = new ChildThread("MyChildThreadTwo");
		
		SecondChildThread sct1 = new SecondChildThread("MyChildThreadThree");
		// this is when we tell the OS that a child thread should be
			// created at OS level. Only when we call the start() method the child thread spawns
			// from the parent thread 
		// this method will also implicitly call the run method
		ct1.start();
		ct2.start();
		
		sct1.myThread.start();
		
		//ct1.run();
		
		for(int i=1; i<=5; i++) {
			System.out.println(mainThread.getName() + " : " + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
