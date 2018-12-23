package com.TCPSerevrExample;

public class Main {

	public static void main(String[] args) {

		TCPServer t = new TCPServer();	
		TCPClient c = new TCPClient();
		t.server(5000); // @param : port
		c.client(5000, "121.151.51.184");
	}

}
