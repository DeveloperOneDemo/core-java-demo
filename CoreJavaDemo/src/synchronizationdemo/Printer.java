package synchronizationdemo;

public class Printer {

	synchronized void print(String msg) {
		// [ msg ]
		System.out.print("[");
		System.out.print(msg);
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("]");
	}
	
}
