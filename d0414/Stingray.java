package kr.hs.dgsw.java.dept23.d0414;

public class Stingray extends Animal {
	
	public Stingray() {
		super("������");
	}
	
	@Override
	public void makeSound() {
		System.out.println("������������������������������������");
	}
	
	public static void main(String[] args) {
		Animal stingray = new Stingray();
		
		stingray.move();
		stingray.eat("����");
		stingray.makeSound();
		
	}
	
}
