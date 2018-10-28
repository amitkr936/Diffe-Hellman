package diff;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ClientSocket 
{
//Server
	public ClientSocket() throws IOException
	{
		Socket ss = null;
		int number = 0;
		try {
			ServerSocket s1=new ServerSocket(1342);
			ss=s1.accept();
			Scanner sc=new Scanner(ss.getInputStream());
			number=sc.nextInt();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int temp=number*2;//modify the ip using dh
		PrintStream p=new PrintStream(ss.getOutputStream());
		p.println(temp);
		
	}
}
