package kr.hs.dgsw.java.dept23.d0526;

public class Run100mThread implements Runnable {

	private final String name;
	
	private final double second;
	
	private double distance = 0;
	
	public Run100mThread(String name, double second) {
		this.name = name;
		this.second = second;
	}
	
	@Override
	public void run() {
		
		while (distance < 100){
			System.out.printf("%s�� %.2fm��ŭ �޷Ƚ��ϴ�.\n", name, distance);
			distance += 100 / second;
			
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {}
			
		}
//		if (distance > 100) {
//			System.out.printf("%s�� 100m ���ֿ� �����߽��ϴ�.\n", name);
//		}
		System.out.printf("%s�� 100m ���ֿ� �����߽��ϴ�.\n", name);
		// ������ �����Ǹ� ��¥�� while���� ���� ���̱� ������ �ٷ� ���
	}
	
	public static void main(String[] args) {
		
		Run100mThread UB = new Run100mThread("Bolt", 9.58);				// ����� ��Ʈ
		Run100mThread KimGukYeong = new Run100mThread("KGY", 10.07);	// �豹��
		Run100mThread ParkJiGeon = new Run100mThread("PJG", 12.56);		// ������
		Run100mThread CommonPeople = new Run100mThread("CP", 14.02);	// ŷ����
		
		new Thread(UB).start();
		new Thread(KimGukYeong).start();
		new Thread(ParkJiGeon).start();
		new Thread(CommonPeople).start();
		
		
	}
	
}
