package assignment4.area;
import java.util.Scanner;

public class ShapeCalculatorMain {
	public static void main() {
		Scanner scan = new Scanner(System.in);
		ShapeCalculator s = new ShapeCalculator();
		String input;
		while(true) {
			
			System.out.print("Want to experience method overloading yes/no ");
			if(scan.next().toLowerCase().equals("no")){
				break;
			}
			
			System.out.print("Enter square, rectangle, circle or triangle ");
			switch(scan.next().toLowerCase()) {
			case "square" : System.out.print("Enter the side ");
			int side = scan.nextInt();
			System.out.println("Area of the Square is: "+s.area(side));
			break;
			
			case "rectangle" : System.out.print("Enter the Length ");
			int length = scan.nextInt();
			System.out.print("Enter the Breadth ");
			int breadth = scan.nextInt();
			System.out.println("Area of the Rectangle is: "+s.area(length,breadth));
			break;
			
			case "circle" : System.out.print("Enter the radius ");
			double radius = scan.nextDouble();
			System.out.println("Area of the Square is: "+s.area(radius));
			break;
			
			case "triangle" : System.out.print("Enter the Base ");
			double base = scan.nextDouble();
			System.out.print("Enter the Height ");
			double height = scan.nextDouble();
			boolean isTriangle = true;
			System.out.println("Area of the Triangle is: "+s.area(base,height,isTriangle));
			break;
			
			default: System.out.println("Invalid Output");
			}
			
		}
		
		/*
		while (true) {
			System.out.print("Want to experience method overloading yes/no ");
			if (scan.next().equals("no")) {
				break;
			}
			System.out.print("Enter String, Integer, Double, Array or Object ");
			switch (scan.next().toLowerCase()) {
			case "integer":
				p.print(5);
				break;
			case "string":
				p.print("Yadnyesh");
				break;
			case "double":
				p.print(8.6);
				break;
			case "array":
				p.print(s);
				break;
			case "object":
				p.print(b);
				break;
			default: System.out.println("Invalid Output");
			}
		}*/
		
	}
}

