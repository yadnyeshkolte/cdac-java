package zalgorithms;

import java.util.ArrayList;

public class MergeSortArrayList {
	public static void main(String[] args) {
		ArrayList<String> students = new ArrayList<>();
		students.add("Yadnyesh");
		students.add("Rushikesh");
		students.add("Deepak");
		students.add("Satyam");
		students.add("Aaman");
		students.add("Hardik");
		students.add("Avdut");
		students.add("Amita");
		mergeSort(students);
		System.out.println(students);
	}
	static void mergeSort(ArrayList<String> array) {
		if(array.size()<2) {
			return;
		}
		int mid = array.size()/2;
		int length = array.size();
		ArrayList<String> leftHand = new ArrayList<>();
		ArrayList<String> rightHand = new ArrayList<>();	
		for(int i=0;i<mid;i++) {
			leftHand.add(i, array.get(i));
		}

		for(int j=0;j<length-mid;j++) {
			rightHand.add(j, array.get(mid+j));
		}
		
		
		mergeSort(leftHand);
		mergeSort(rightHand);
	    
		merge(array, leftHand, rightHand);
	}
	static void merge(ArrayList<String> array, ArrayList<String> leftHand, ArrayList<String> rightHand){
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i<leftHand.size() && j<rightHand.size()) {
			if(leftHand.get(i).compareTo(rightHand.get(j))<=0) {
				array.set(k, leftHand.get(i));
				i++;
			}
			else {
				array.set(k, rightHand.get(j));
				j++;
			}
			k++;
		}
		while(i<leftHand.size()) {
			array.set(k, leftHand.get(i));
			i++;
			k++;
		}
		while(j<rightHand.size()) {
			array.set(k, rightHand.get(j));
			j++;
			k++;
		}
	}
}
