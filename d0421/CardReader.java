package kr.hs.dgsw.java.dept23.d0421;

public class CardReader {
	
	protected int income;
	
	public CardReader() {
		this.income = 0;
	}
	
	public void contact(Card card) {
		
		String type = card.getType();
		int fee = 0;

		if ("����".equals(type)) {
			fee = 1500;
		} else if ("�л�".equals(type)) {
			fee = 800;
		} else if ("���".equals(type)){
			fee = 0;
		} else {
			throw new RuntimeException("�߸��� ī���Դϴ�.");
		}
		
		boolean enough = card.canPaiable(fee);
		
		if (enough) {
			card.payment(fee);
			income += fee;
			System.out.println(card.getType() + "�Դϴ�");
		} else {
			System.out.println("�ܾ��� �����մϴ�. ���� ��������.");
		}
	}
	
	public int getIncome() {
		return this.income;
	}
	
	public static void main(String[] args) {
		CardReader reader = new CardReader();
		StudentCard student = new StudentCard(1000);
		ElderCard elder = new ElderCard(0);
		AdultCard adult = new AdultCard(2000);
		
		reader.contact(student);
		student.payment(student.fee);
		reader.contact(elder);
		elder.payment(elder.fee);
		reader.contact(adult);
		adult.payment(adult.fee);
		
		
		System.out.println("������ ������ " + reader.getIncome() + "�� �Դϴ�.");
	}
	
}
