package diff;

import java.util.*;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class Server_Socket
{//Client
	public static void Main(String args[]) throws UnknownHostException, IOException
	{
		Scanner sc=new Scanner(System.in);
		Socket s=new Socket("127.0.0.1",1342);//Specify the IP address and Port number
		//accept from server
		Scanner sc1=new Scanner(s.getInputStream());
		System.out.println("Enter any Number");
		int number=sc.nextInt();
		PrintStream p =new PrintStream(s.getOutputStream());
		p.println(number);
	    int temp=sc1.nextInt();
		System.out.println(temp);
	}
}
