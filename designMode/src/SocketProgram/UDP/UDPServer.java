package SocketProgram.UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer
{
	public static void main(String[] args)
	{
		byte[] buf = new byte[1024];
		DatagramPacket dPacket = new DatagramPacket(buf, buf.length);
		try
		{
			DatagramSocket dSocket = new DatagramSocket(666);
			while (true)
			{
				dSocket.receive(dPacket);
				System.out.println("server receive" + new String(buf, 0, buf.length));
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}
}
