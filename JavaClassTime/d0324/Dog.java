package kr.hs.dgsw.java.dept23.d0324;

import java.util.Scanner;

import kr.hs.dgsw.java.dept23.d0317.ScannerStudy;

public class Dog {
	
	private final String name;
	// final �� �����ϸ� ���� �ٲ��� ����
	// final �� �����ϸ� ó���� �ʱ�ȭ ����� ��
	
	
	private int age;
	
	/*
	// Method �̸��� Ŭ���� �̸����� �ص� ������ �߻���
	public Dog(String name) {// ������ �̸��� Ŭ���� �̸��� ���ƾ� ��
		System.out.println("������ ȣ��");
		this.name = name;
	}
	*/
	
	
	public Dog() {	// �ڱ� �ڽ��� ȣ���Ϸ��� ���� ���� ȣ���ؾ���
		this("����");
//		System.out.println("aaa");
	}
	
	public Dog(String name) {
		System.out.println("������ ȣ���");
		this.name = name;
	}
	
	public void sayHello() {
		System.out.println("Hello " + this.name);
	}
	
	
	
	public static void main(String[] args) {
		
		ScannerStudy scannerStudy = new ScannerStudy();
		scannerStudy.prepareScanner();
		Scanner scanner = scannerStudy.getScanner();
		
		String input = null;
		while(true) {
			System.out.println("������ �̸��� �Է��ϼ��� : ");
			input = scanner.next();
			
//			if(input.equals("quit")) {	// �̶��� input�� null �̶�� ���� �߻�
			if("quit".equals(input)) {	// input�� null �� ���͵� ������ ���� ����
				break;
			}
			
			
			Dog dog = new Dog(input);
			dog.sayHello();
		}
		
		
//		for(int i=0; i<args.length; i++) {
//			Dog dog = new Dog(args[i]);
//			dog.sayHello();
//		}
		
		
//		Dog puppy = new Dog();
//		Dog happy = new Dog("����");
//		Dog poppy = new Dog("�ǻ�");
		
	}
}
