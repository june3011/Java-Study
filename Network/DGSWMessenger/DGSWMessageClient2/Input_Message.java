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
			InputStream is = sc.getInputStream();		// ?ด?ผ?ด?ธ?ธ ๋ฉ์์ง? ?? ฅ ๋ฐ์
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
						System.out.println("??  ๋ฉ์์ง?๊ฐ? ?ด??ฉ??ค.");
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
							System.out.println("[" + msgFromNick + "] ? ?????ต??ค.");
							break;
						case "LogOutOK":
							System.out.println("๋ก๊ทธ??????ต??ค.");
							loginboolean = false;
							break;
						case "LogOut":
							System.out.println("[" + msgFromNick + "] ?ฌ?ฉ?๊ฐ? ๋ก๊ทธ??????ต??ค.");
							break;
						case "NickNameOK":
							System.out.println("??ค?? [" + msgAfterNick + "]๋ก? ๋ณ?๊ฒฝํ???ต??ค.");
							break;
						case "NickNameOverlap":
							System.out.println("??ค?? [" + msgAfterNick + "]? ?ด๋ฏ? ?ฌ?ฉ์ค์??ค.");
							break;
						case "NickNameInform":
							System.out.println("[" + msgBeforeNick + "] ?ฌ?ฉ?๊ฐ? ??ค?? [" + msgAfterNick + "]๋ก? ๋ณ?๊ฒฝํ???ต??ค.");
							break;
						case "Whisper":
							System.out.println("[๊ท์๋ง?] " + msgFromNick + ": " + msgMessage);
							break;
						case "WhisperOK":
							System.out.println("[๊ท์๋ง?] ? ?ก ?ฑ๊ณ?");
							break;
						case "WhisperWhithout":
							System.out.println("[๊ท์๋ง?] ? ?ก ?ค?จ / ??ค??ด ??ต??ค.");
							break;
						case "AllMessage":
							System.out.println(msgFromNick + ": " + msgMessage);
							break;
						case "NickList":
							System.out.println("? ???: "+ msgJoinCount);
							System.out.println("[? ??๋ฆฌ์ค?ธ]");
							System.out.println(msgMessage);
							System.out.println("[? ??๋ฆฌ์ค?ธ?]");
							break;
						default:
							break;
					}
				}
			}
		} catch(Exception e) {
			System.out.println("?ฐ๊ฒ? ์ข๋ฃ");
			e.printStackTrace();
		}
	}
}