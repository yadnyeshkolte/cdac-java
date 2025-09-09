package assignment6;

import java.util.PriorityQueue;
import java.util.Scanner;

public class QueueMain {
	public static void main() {
		Scanner scan = new Scanner(System.in);
		PriorityQueue<Integer> tokens = new PriorityQueue<>();
		System.out.print("Enter Tokens ");
		for(int i=0;i<5;i++) {
			int token = scan.nextInt();
			tokens.add(token);
		}
		
		System.out.println("================");
		System.out.println(tokens);
		System.out.println("================");
		
		for(int i=0;i<2;i++) {
			tokens.remove();
		}
		
		System.out.println("================");
		System.out.println(tokens);
		System.out.println("================");
		
		System.out.println("================");
		int position = 0;
		for (Integer token : tokens) {
		    position++;
	        //System.out.println(position+" "+token);
		    if (position == 2) {	
		        System.out.println("Second element: " + token);
		        break;
		    }

		}
		System.out.println("================");
	
		
		System.out.println("================");
		System.out.println(tokens.peek());
		System.out.println("================");
		
		System.out.println("================");
		System.out.println(tokens.isEmpty());
		System.out.println("================");
		
	}
}
