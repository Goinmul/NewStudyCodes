package com.TCPSerevrExample;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class TCPClient {
	
	Socket socket = null;
	
	public void client(int port, String server_ip) {

		final String SERVER_IP = server_ip;
		final int SERVER_PORT = port;
		
		try {
			// 1. create socket
			socket = new Socket();
			
			// 2. connect the socket to the server
			socket.connect(new InetSocketAddress(SERVER_IP,SERVER_PORT));
			
		} catch(IOException e) {
			System.out.println(e);
		} finally {
			try {
				if(socket != null && !socket.isClosed()) {
					socket.close();
				}
			} catch (IOException e) {
				System.out.println(e);
			}
		}
		
	}

}
