package zalgorithms;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {
	public static void main(String[] args) {
		Random rand = new Random();
		int [] array = new int[20];

		for(int i=0;i<array.length;i++) {
			array[i] = rand.nextInt(200);
		}
		System.out.println("Before");
		System.out.println(Arrays.toString(array));
		
		mergeSort(array);
		System.out.println("After");
		System.out.println(Arrays.toString(array));
	}
	public static void mergeSort(int[] array) {
		int mid = array.length/2;
		if(array.length<2) {
			return;
		}
		int[] leftHand  = new int[mid];
		int[] rightHand = new int[array.length-mid];
		
		for(int i=0;i<leftHand.length;i++) {
			leftHand[i] = array[i];
		}
		for(int i=0;i<rightHand.length;i++) {
			rightHand[i] =  array[mid+i];
		}
		
		mergeSort(leftHand);
		mergeSort(rightHand);
		
		merge(array, leftHand, rightHand);
	}
	public static void merge(int[] array,int[] leftHand, int[] rightHand) {
		int i=0;
		int j =0;
		int k = 0;
		while(i<leftHand.length && j<rightHand.length) {
			if(leftHand[i]<=rightHand[j]) {
				array[k] = leftHand[i];
				i++;
			}
			else {
				array[k] = rightHand[j]; 
				j++;
			}
			k++;
		}
		while(i<leftHand.length) {
			array[k] = leftHand[i];
			k++;
			i++;
		}
		while(j<rightHand.length) {
			array[k] = rightHand[j];
			k++;
			j++;
		}
	}
}
