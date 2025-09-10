package fileio;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
public class YadnyeshWrite {
	public static void main(String[] args) throws IOException {
		FileOutputStream fs = new FileOutputStream("data.txt");
		ObjectOutputStream os = new ObjectOutputStream(fs);
		ArrayList<YadnyeshObject> yad = DataInput.getDetails();
		for(YadnyeshObject y: yad) {
			os.writeObject(y);
		}
		System.out.println("Written in file");
	}
	
}
