package kr.hs.dgsw.network.teacherCode.d0523.server;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;

public class ChattingServerMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket ss = null;
		try {
			ss = new ServerSocket(5000);  	// ?λ²? ??(?΄?Ό?΄?Έ?Έ ? ? ??κΈ?)

			System.out.println("?λ²κ? ?????΅??€.");
			
			while(true) {
				Socket sc = ss.accept();
				System.out.println(sc.getInetAddress() +": ? ?????΅??€.");
				
				try {
					// ?°?΄?° μ£Όκ³  λ°λ κ°μ²΄ ??±
					ClientAccept ca = new ClientAccept(sc);
					
					Thread ct = new ClientThread(sc.getInetAddress().toString(), ca);
					ct.start();
				} catch(Exception e) {
					System.out.println("?°κ²? μ’λ£");
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