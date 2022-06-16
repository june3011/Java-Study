package kr.hs.dgsw.java.dept23.d0428;

public abstract class Animal {
	
	public abstract String getName();
	
	public abstract String makeSound();
	// ���� �ϰ� �ڽĿ��� ������ ����. ������ �� �ϸ� ������ ���� �߻�
	
	public void move() {
		System.out.printf("%s ��(��) %s �Ҹ��� ���� �޷����ϴ�.", getName(), makeSound());
	}
	
	public static void main(String[] args) {
		// �߻� Ŭ�����δ� ��ü�� ���� �� ����.
		Animal animal = new Horse();
		animal.move();
	}
	
}
