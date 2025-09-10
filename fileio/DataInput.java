package fileio;
import java.util.ArrayList;
public class DataInput {
	static ArrayList<YadnyeshObject> getDetails(){
		ArrayList<YadnyeshObject> ya = new ArrayList<>();
		ya.add(new YadnyeshObject(1, "kolte",(byte) 1,(short) 32));
		ya.add(new YadnyeshObject(2, "kolte1",(byte) 3,(short) 12));
		ya.add(new YadnyeshObject(3, "kolte2",(byte) 5,(short) 56));
		ya.add(new YadnyeshObject(4, "kolte3",(byte) 1,(short) 89));
		ya.add(new YadnyeshObject(5, "kolte4",(byte) 9,(short) 70));
		
		return ya;
	}
}
