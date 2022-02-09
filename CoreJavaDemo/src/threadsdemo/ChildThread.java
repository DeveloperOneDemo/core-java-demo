package threadsdemo;

public class ChildThread extends Thread{

	
	public ChildThread(String name) {
		setName(name);
	}
	
	@Override
	public void run() {
		for(int j=1; j<=5; j++) {
			System.out.println(getName() + " : " + j);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
}
