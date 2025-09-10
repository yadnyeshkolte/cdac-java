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
				ui.displayObject();
			}
		}catch(EOFException e) {
			//TO Ignore runtime exception error
			System.out.println("Code Completed");
		}
		
		System.out.println("Program Completed");

	}
}
