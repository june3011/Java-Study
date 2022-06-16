package kr.hs.dgsw.java.dept23.d0317;

public class DataTypeStudy {
	/*
	 *  �ڹ��� ������ Ÿ�Կ��� �⺻ ������ Ÿ�԰� ���� ������ Ÿ���� �ֵ�.
	 *  ������ ������ Ÿ�԰� �Ǽ��� ������ Ÿ���� ���� �ִ�.
	 *  int byte short long char float double boolean
	 *  ����Ÿ�� int, long, short, byte, char
	 *  �Ǽ�Ÿ�� float, double
	 *  ��Ÿ�� boolean
	 */	
	public void studyInteger() {
		byte byteValue = 127;
		short shortValue = 32767;
		int intValue = 2100000000;
		long longValue = 3000000001L;
		// 21�ﺸ�� ū ���� �Է��ϰ� �Ǹ� �ڹٰ� �𸣴� ���ڿ��� ������ �߻���
		// ���� 21�ﺸ�� ū ���� �Է��� ���� �ڿ� L�� ���̱� 
	}
	
	public void studyReal() {
		double doubleValue = 1234567890.1234567890;
		float floatValue = 3.1415926F;
		// double�� float���� ���е��� �� ����
		// �߿��� ����̶�� ������ ��ȯ�ϰ� ����ϰ�
		// �ٽ� double��
		System.out.println(doubleValue);
		System.out.println(floatValue);
	}
	
	public void studyBoolean() {
		boolean bool1 = (3>2);
		boolean bool2= ((1241 * 24) > (2452 * 16));
		
		if (true) {
			// TODO
		}
	}
	
	public void studyChar() {
		char ch = 'A';
		char ch2 = 65;	// ASCII CODE 'A'
		char ch3 = 97;	// ASCII CODE 'a'
		char ch4 = 48;	// ASCII CODE '0'
		
		for (char i=0; i<256; i++) {
			// System.out.printf("%d - %c \n", (int)i, i);
			System.out.printf("%04x  %d - %c \n", (int)i, (int)i, i);
		}
		
		int h1 = '��';
		// ���� ����ǥ�� ���� ������ ó���ȴ�.
		System.out.println(h1);
		
		int hanja1 = '��';
		int hanja2 = '��';
		int hanja3 = '��';
		int hanja4 = '��';
		
		System.out.println(hanja1+" "+hanja2+" "+hanja3+" "+hanja4);
		
//		int count = '�R' - '��' + 1;
//		System.out.println(count);
		
//		for (int i ='��'; i<'��'; i++) {
//			System.out.printf("%d - %c\n", i, (char)i);
//		}
//		
	}
	
	public static void main(String[] args) {
		DataTypeStudy study = new DataTypeStudy();
		study.studyReal();
		study.studyChar();
	}
}
