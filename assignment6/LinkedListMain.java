package assignment6;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListMain {
	public static void main() {
		Scanner scan = new Scanner(System.in);
		int input;
		LinkedList<Integer> tasks = new LinkedList<>();
		System.out.print("Enter 5 Tasks values :");
		for(int i=0;i<5;i++) {
			int t = scan.nextInt();
			tasks.add(t);
		}
		System.out.println("================");
		System.out.println(tasks);
		System.out.println("================");
		
		tasks.addFirst(89);
		tasks.addLast(78);
		System.out.println("================");
		System.out.println(tasks);
		System.out.println("================");
		
		
		System.out.println("================");
		System.out.println(tasks.remove((tasks.size()/2)));
		System.out.println("================");
		
		System.out.println("================");
		System.out.println(tasks.getFirst());
		System.out.println(tasks.getLast());
		System.out.println("================");

		
		System.out.println("================");
		System.out.print("Enter the Task :");
		input = scan.nextInt();
		System.out.println(tasks.contains(input));
		System.out.println("================");
	}
}
