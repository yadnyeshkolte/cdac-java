package testing;

import java.util.ArrayList;

public class Test {
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
		ArrayList<String> leftHand = new ArrayList<>();
		ArrayList<String> rightHand = new ArrayList<>();	
		for(int i=0;i<mid;i++) {
			leftHand.add(i, array.get(i));
		}

		for(int i=0;i<array.size()-mid;i++) {
			rightHand.add(i, array.get(rightHand.size()+i));
		}
		mergeSort(leftHand);
		mergeSort(rightHand);
	    
		merge(array, leftHand, rightHand);
	}
	static void merge(ArrayList<String> array, ArrayList<String> leftHand, ArrayList<String> rightHand){
		int i = 0;
		int j = 0;
		
		while(i<leftHand.size() && j<rightHand.size()) {
			if(leftHand.get(i).compareTo(rightHand.get(i))<=0) {
				array.add(leftHand.get(i));
				i++;
			}
			else {
				array.add(rightHand.get(i));
				j++;
			}
		}
		
		while(i<leftHand.size()) {
			array.add(leftHand.get(i));
			i++;
		}
		
		while(j<rightHand.size()) {
			array.add(rightHand.get(j));
			j++;
		}	
	}
}
