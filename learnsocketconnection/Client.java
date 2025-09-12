package learnsocketconnection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Scanner scan = new Scanner(System.in);
		Socket s = new Socket("192.168.2.84",888);
		
		
		System.out.println("Enter the name: ");
		String str = scan.next();
		
		OutputStream os = s.getOutputStream();
		PrintStream pr = new PrintStream(os);
		//Very Important 
		//ln after should be given
		pr.println(str);
		
		
		InputStreamReader ir = new InputStreamReader(s.getInputStream());
		BufferedReader br = new BufferedReader(ir);
		
		String age = br.readLine();
		
		int ageInt;
		
		ageInt = Integer.parseInt(age);
		
		System.out.print(ageInt+100);
		
	}
}
