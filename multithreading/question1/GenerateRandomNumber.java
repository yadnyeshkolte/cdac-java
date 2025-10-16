package multithreading.question1;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class GenerateRandomNumber extends Thread{
    static LinkedBlockingQueue<Integer> sq = new LinkedBlockingQueue<>();
    // we can use LinkedBlockingQueue to end program automatic
    public void run() {
        for(int i=0;i<5;i++) {
            Random ra = new Random();
            try {
                int number = ra.nextInt(1,100);
                System.out.println(Thread.currentThread().getName()+"-ra-"+number);
                sq.put(number);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread 0 Ended");
    }
}

class SquareOdd extends Thread{
    public void run() {
        try {
            while(true) {
                Integer number =GenerateRandomNumber.sq.take();
                if(number%2==1) {
                    System.out.println(Thread.currentThread().getName() +" "+ number+"-square-"+Math.pow(number,2));
                } 
                else {
                    GenerateRandomNumber.sq.put(number);
                    Thread.sleep(10);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread 1 Ended");
    }
}

class CubeEven extends Thread{
    public void run() {
        try {
            while(true) {
                Integer number = GenerateRandomNumber.sq.take();
                if(number % 2 == 0) {
                    System.out.println(Thread.currentThread().getName()+ " "+number +"-cube-" + Math.pow(number,3));
                } else {
                    //is not even right
                	// thats why it is putting it in the queue again
                    GenerateRandomNumber.sq.put(number);
                    Thread.sleep(10);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread 2 Ended");
    }
}