package SocketProgram.TCP;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer
{

	public void start(String IP, String port)
	{
		// ServerSocket myServer = new ServerSocket();
	}

	public static void main(String[] args) throws IOException
	{
		System.out.println("the Server is on");
		ServerSocket myServer = new ServerSocket(666);

		Socket ss = myServer.accept();
		System.out.println("a client connected!");

		InputStream is = ss.getInputStream();
		DataInputStream dataInputStream = new DataInputStream(is);
		System.out.println("receive message: " + dataInputStream.readUTF());

	}

}
