package learnsocketconnection;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.io.BufferedReader;

public class Server {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		ServerSocket ss = new ServerSocket(888);
		Socket s = ss.accept();
		System.out.println("Got connected");
		
		
		InputStream is = s.getInputStream();
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		String cmsg = br.readLine();
		
		System.out.println(cmsg);
		
		
		
		
		System.out.println("Give age ");
		int age = scan.nextInt();
		//InputStreamReader uir = new InputStreamReader(System.in);
		//BufferedReader rt = new BufferedReader(uir);
		//age = rt.read();
		
		OutputStream os = s.getOutputStream();
		PrintStream pr = new PrintStream(os);
		pr.println(age);
		
	}
}
