package kr.hs.dgsw.java.dept23.d0324;
import java.util.Scanner;


// ���ڿ� ���� ��
// str == "quit" ����
// str.equals("quit") �ϱ�

public class HiDog {
	
	String name;
	private Scanner sc;
	
	public Scanner getScanner() {
		sc = new Scanner(System.in);
		return sc;
	}
	
	public void closeScanner() {
		sc.close();
	}
	
	public HiDog() {
		this.name="����";
	}
	
	public void sayHello() {
		System.out.println("Hi, " + name);
	}
	
	
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("������ �̸��� �Է��ϼ��� : ");
			HiDog KT = new HiDog();
			Scanner sc = KT.getScanner();
			KT.name = sc.nextLine();
			if(KT.name.equals("quit")) {
				KT.closeScanner();
				break;
			}
			KT.sayHello();
		}
	}
}




