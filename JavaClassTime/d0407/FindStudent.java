package kr.hs.dgsw.java.dept23.d0407;
import java.util.Scanner;

public class FindStudent {
	
	public String[] friendTable = {"������","������","����","����","��μ�",
								"������","�ں���","�ڼ���","������","������",
								"�տ�","����","����","������","������",
								"�̽¹�", "����ȣ","�ֹ���","�ѻ��"};
	
	private Scanner scanner;
	
	public void prepareScanner() {
		this.scanner = new Scanner(System.in);
	}
	
	public void closeScanner() {
		this.scanner.close();
	}
	
	public Scanner getScanner() {
		return this.scanner;
	}
	
	public void yourName() {
		prepareScanner();
		getScanner();
		String[] friends = friendTable;
		
		System.out.print("��ȣ�� �Է��ϼ��� : ");
		int friendNum = scanner.nextInt();
		if(friendNum > friendTable.length-1) {
			System.out.println("���� ��ȣ�Դϴ�");
		}
		else {
			System.out.println(friends[friendNum-1]);
		}
	}
	
	public void yourNum() {
		
		int friendNum = 0;
		System.out.printf("�̸��� �Է��ϼ��� : ");
		String friendName = scanner.next();
		
		
		
		for (int i=0; i<friendTable.length; i++) {
			if (friendTable[i].equals(friendName)) {
				friendNum = i+1;
			}
		}
		System.out.println(friendNum + "�� �Դϴ�");
	}
	
	public static void main(String[] args) {
		
		FindStudent findStudent = new FindStudent();
		
		findStudent.yourName();
		findStudent.yourNum();
		
		findStudent.closeScanner();
	}
	
	
}
