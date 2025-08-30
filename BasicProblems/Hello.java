
package Hello.BasicProblems;
import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int unit = sc.nextInt();
		if(unit<0) {
			unit = unit*-1;
		}
		int answer = 0;
		if(unit<=100) {
			answer = unit*1;
		}
		else if(unit>=101 && unit<=200) {
			answer = 100 + (unit-100)*2;
		}
		else if(unit>=201 && unit<=300) {
			answer = 100 + 200 + (unit-200)*3;
		}
		else {
			answer = 100 + 200 + 300 + (unit-300)*4;
		}
		System.out.println(answer);
	}
}
