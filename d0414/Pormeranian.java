package kr.hs.dgsw.java.dept23.d0414;

import java.nio.file.ProviderMismatchException;

public class Pormeranian extends Dog {
	
	public Pormeranian() {
		super("���޶�Ͼ�");
	}
	
	public static void main(String[] args) {
		Animal pormeranian = new Pormeranian();
		Dog ppp = new Pormeranian();
		
		ppp.move();
		
		pormeranian.move();
		pormeranian.eat("����");
		pormeranian.makeSound();
		
		pormeranian.toString();
		
		Object object = new Object();
		String a = new String();
		Integer b = new Integer(0);
		
		
	}
	
}
