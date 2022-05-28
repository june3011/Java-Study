package kr.hs.dgsw.network.teacherCode.d0523.server;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;

public class ChattingServerMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket ss = null;
		try {
			ss = new ServerSocket(5000);  	// ?���? ?��?��(?��?��?��?��?�� ?��?�� ??�?)

			System.out.println("?��버�? ?��?��?��?��?��?��?��.");
			
			while(true) {
				Socket sc = ss.accept();
				System.out.println(sc.getInetAddress() +": ?��?��?��???��?��?��.");
				
				try {
					// ?��?��?�� 주고 받는 객체 ?��?��
					ClientAccept ca = new ClientAccept(sc);
					
					Thread ct = new ClientThread(sc.getInetAddress().toString(), ca);
					ct.start();
				} catch(Exception e) {
					System.out.println("?���? 종료");
				}
			}
		} catch(Exception e) {
		} finally {
			try {
				ss.close();
			} catch(IOException e) {}
		}
	}
}