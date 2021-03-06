package kr.hs.dgsw.java.dept23.d0317;

public class DataTypeStudy {
	/*
	 *  자바의 데이터 타입에는 기본 데이터 타입과 참조 데이터 타입이 있따.
	 *  정수형 데이터 타입과 실수형 데이터 타입이 따로 있다.
	 *  int byte short long char float double boolean
	 *  정수타입 int, long, short, byte, char
	 *  실수타입 float, double
	 *  논리타입 boolean
	 */	
	public void studyInteger() {
		byte byteValue = 127;
		short shortValue = 32767;
		int intValue = 2100000000;
		long longValue = 3000000001L;
		// 21억보다 큰 수를 입력하게 되면 자바가 모르는 숫자여서 에러가 발생함
		// 따라서 21억보다 큰 수를 입력할 때는 뒤에 L을 붙이기 
	}
	
	public void studyReal() {
		double doubleValue = 1234567890.1234567890;
		float floatValue = 3.1415926F;
		// double이 float보다 정밀도가 더 높음
		// 중요한 계산이라면 정수로 변환하고 계산하고
		// 다시 double로
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
		
		int h1 = '가';
		// 작은 따옴표를 쓰면 정수로 처리된다.
		System.out.println(h1);
		
		int hanja1 = '一';
		int hanja2 = '鳥';
		int hanja3 = '入';
		int hanja4 = '力';
		
		System.out.println(hanja1+" "+hanja2+" "+hanja3+" "+hanja4);
		
//		int count = '힣' - '가' + 1;
//		System.out.println(count);
		
//		for (int i ='가'; i<'갸'; i++) {
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
