package assignment4.printing;

import java.util.Arrays;

public class Printer {
	void print(String message){
		System.out.println("This is String: "+message);
	}
	void print(int number){
		System.out.println("This is Integer: "+number);
	}
	void print(double value){
		System.out.println("This is Double: "+value);
	}
	void print(String[] items){
		System.out.println("This is String Array: "+Arrays.toString(items));
	}
	void print(Object obj){
		System.out.println("This is Object: "+"( "+obj.name+", "+obj.age+", "+obj.hobby+", "+obj.phoneno+" )");
	}
}
