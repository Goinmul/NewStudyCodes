package com.TCPSerevrExample;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public void server(int port) {
		final int SERVER_PORT = port;

		ServerSocket serverSocket = null;
		try {
			// 1. create server socket object
			serverSocket = new ServerSocket();

			// 2. bind socket to host port
			String localHostAddress = InetAddress.getLocalHost().getHostAddress(); // get host address
			serverSocket.bind(new InetSocketAddress(localHostAddress, SERVER_PORT)); // bind
			System.out.println("[server]binding.\naddress : "+localHostAddress+", port : "+SERVER_PORT);

			while(true) {
				// 3. wait until client access request
				Socket socket = serverSocket.accept();
				
				// 4. when requesting, print message
				InetSocketAddress remoteSocketAddress = (InetSocketAddress)socket.getRemoteSocketAddress();
				String remoteHostName = remoteSocketAddress.getAddress().getHostAddress(); // get remote socket address
				
				int remoteHostPort = remoteSocketAddress.getPort();
				System.out.println("[server] connected! \nconnected socket address:" + remoteHostName
						+ ", port:" + remoteHostPort);
				// 5. when request comes, create a new thread
				
				//new ProcessThread(socket).start(); // You should create this class, where actual execution occurs.
			}


		} catch(IOException e) {
			System.out.println(e);
		} finally {
			try{
				if( serverSocket != null && !serverSocket.isClosed() ){
					serverSocket.close();
				}
			}
			catch(IOException e){
				System.out.println(e);
			}
		}
	}



}
