package SocketProgram.TCP;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class MyClient
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("the Client is on");
		Socket socket = new Socket("127.0.0.1", 666);
		OutputStream os = socket.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		dos.writeUTF("超人归来");

		dos.flush();
		dos.close();
		socket.close();
	}

}
