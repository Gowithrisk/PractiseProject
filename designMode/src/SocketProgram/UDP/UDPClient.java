package SocketProgram.UDP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class UDPClient
{

	public static void main(String[] args)
	{
		try
		{
			DatagramSocket dSocket = new DatagramSocket(667);
			String input = "hello";

			byte[] buf = null;

			while (!"exit".equals(input))
			{
				BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
				input = bReader.readLine();
				buf = input.getBytes();
				InetSocketAddress address = new InetSocketAddress("127.0.0.1", 666);
				System.out.println("clinet send:" + input);
				DatagramPacket dPacket = new DatagramPacket(buf, buf.length, address);
				dSocket.send(dPacket);
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}

}
