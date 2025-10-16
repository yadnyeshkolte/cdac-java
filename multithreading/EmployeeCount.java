package multithreading;

public class EmployeeCount extends Thread {
	@Override
	public void run() {
		System.out.println("This thread is running");
		for(int i =0;i<10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		System.out.println("The Thread is Ended");
	}
}
