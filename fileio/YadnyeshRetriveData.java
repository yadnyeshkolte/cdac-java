package fileio;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.EOFException;
public class YadnyeshRetriveData {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
		FileInputStream fi = new FileInputStream("data.txt");
		ObjectInputStream oi = new ObjectInputStream(fi);
		YadnyeshObject ui;
		
		try {
			while((ui=(YadnyeshObject) oi.readObject())!=null) {
				System.out.println("========");
				ui.displayObject();
				System.out.println("--------");
				isHeEligible(ui);
				System.out.println("========");
			}
		}catch(EOFException e) {
			//TO Ignore runtime exception error
			//System.out.println("===================");
		}
		


	}
	static void isHeEligible(YadnyeshObject y) {
		if(y.years<=1) {
			System.out.println("He is not Eligible");
		}
		else if(y.years>1 && y.years<=3) {
			System.out.println("He may be Eligible");
		}
		else {
			System.out.println("He is Eligible");
		}
	}
	
}
