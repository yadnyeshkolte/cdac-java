package multithreading.question1;

public class TestMultiThreading {
	public static void main(String[] args) {
		GenerateRandomNumber ga = new GenerateRandomNumber();
		SquareOdd so = new SquareOdd();
		CubeEven ce = new CubeEven();
		System.out.println("Threads is going to be started");
		ga.start();
		so.start();
		ce.start();
		System.out.println("Main thread is Ended");
	}
}
