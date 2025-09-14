package testing;

import java.util.Random;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int number = rand.nextInt(100,200);
		
		int[] array = new int[20];
		int[] arr = new int[20];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = 100;
		}

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(200);
		}

		System.out.println("");

		System.out.println(Arrays.toString(arr));

		System.out.println(Arrays.toString(array));
	}
}