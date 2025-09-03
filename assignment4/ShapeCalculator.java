package assignment4.area;
import java.lang.Math;
public class ShapeCalculator {
	int area(int side){
		return side*side;
	}
	int area(int length, int breadth) {
		return length*breadth;
	}
	double area(double radius) {
		return Math.PI*radius*radius;
	}
	double area(double base, double height, boolean isTriangle) {
		if(isTriangle) {
			return 0.5*base*height;
		}
		else {
			return 0;
		}
		
	}
	
}
