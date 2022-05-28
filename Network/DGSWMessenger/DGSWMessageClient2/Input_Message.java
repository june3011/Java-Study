package kr.hs.dgsw.network.teacherCode.d0523.client;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Input_Message extends Thread {
	private Socket sc = null;

	
	public Input_Message(Socket sc) {
		this.sc = sc;
	}
	
	public void run() {
		try {
			InputStream is = sc.getInputStream();		// ?��?��?��?��?�� 메시�? ?��?�� 받음
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			boolean loginboolean=true;
			while(loginboolean) {
				String brmsg = br.readLine();
				
				String msgType = "";	
				String msgFromNick = "";
				String msgBeforeNick = "";
				String msgAfterNick = "";
				String msgJoinCount = "";
				String msgMessage = "";
				if(brmsg.equals("[Start]")) {
					brmsg = br.readLine();
					String[] brmsgarr = brmsg.split("::");
					if(brmsgarr[0].equals("Type")) {
						msgType = brmsgarr[1];
					} else {
						System.out.println("?��?�� 메시�?�? ?��?��?��?��?��.");
						continue;
					}
					
					while(!(brmsg = br.readLine()).equals("[End]")) {
						brmsgarr = brmsg.split("::");
						switch(brmsgarr[0]) {
						case "FromNick":
							msgFromNick = brmsgarr[1]; break;
						case "BeforeNick":
							msgBeforeNick = brmsgarr[1]; break;
						case "AfterNick":
							msgAfterNick = brmsgarr[1]; break;
						case "JoinCount":
							msgJoinCount = brmsgarr[1]; break;
						
						case "Message":
							msgMessage = "";
							while(!(brmsg = br.readLine()).equals("::Message")) {
								msgMessage += brmsg + "\r\n";
							}
							msgMessage = msgMessage.substring(0,msgMessage.length()-2);
							break;
						default:
							break;
						}
					}
					
					switch(msgType) {
						case "LogIn":
							System.out.println("[" + msgFromNick + "] ?��?��?��???��?��?��.");
							break;
						case "LogOutOK":
							System.out.println("로그?��?��?��???��?��?��.");
							loginboolean = false;
							break;
						case "LogOut":
							System.out.println("[" + msgFromNick + "] ?��?��?���? 로그?��?��?��???��?��?��.");
							break;
						case "NickNameOK":
							System.out.println("?��?��?��?�� [" + msgAfterNick + "]�? �?경하???��?��?��.");
							break;
						case "NickNameOverlap":
							System.out.println("?��?��?��?�� [" + msgAfterNick + "]?�� ?���? ?��?��중입?��?��.");
							break;
						case "NickNameInform":
							System.out.println("[" + msgBeforeNick + "] ?��?��?���? ?��?��?��?�� [" + msgAfterNick + "]�? �?경하???��?��?��.");
							break;
						case "Whisper":
							System.out.println("[귓속�?] " + msgFromNick + ": " + msgMessage);
							break;
						case "WhisperOK":
							System.out.println("[귓속�?] ?��?�� ?���?");
							break;
						case "WhisperWhithout":
							System.out.println("[귓속�?] ?��?�� ?��?�� / ?��?��?��?�� ?��?��?��?��.");
							break;
						case "AllMessage":
							System.out.println(msgFromNick + ": " + msgMessage);
							break;
						case "NickList":
							System.out.println("?��?��?��?��: "+ msgJoinCount);
							System.out.println("[?��?��?��리스?��]");
							System.out.println(msgMessage);
							System.out.println("[?��?��?��리스?��?��]");
							break;
						default:
							break;
					}
				}
			}
		} catch(Exception e) {
			System.out.println("?���? 종료");
			e.printStackTrace();
		}
	}
}