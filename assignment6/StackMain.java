package assignment6;
import java.util.Stack;
import java.util.Scanner;
public class StackMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stack<Integer> temperature = new Stack<>();
		System.out.println("Enter 5 Temperature values ");
		for(int i=0;i<5;i++) {
			int temp = scan.nextInt();
			temperature.push(temp);
		}
		System.out.println("================");
		System.out.println(temperature);
		System.out.println("================");
		
		for(int i=0;i<2;i++) {
			temperature.pop();
		}
		System.out.println("================");
		System.out.println(temperature);
		System.out.println("================");
		
		
		System.out.println("================");
		System.out.println(temperature.peek());
		System.out.println("================");
		
		System.out.println("================");
		System.out.println(temperature.isEmpty());
		System.out.println("================");
	}

}
