package kr.hs.dgsw.java.dept23.d0526;

public class WorkPlace {

	public void doWorking(Job job, int hours) {
		for (int i=0; i<hours; i++) {
			job.work();
		}
		
		int salary = hours * job.getPrice();
		System.out.printf("�޷Ḧ %d�� �޾ҽ��ϴ�.\n", salary);
	}
	
	public static void main(String[] args) {
		
		Job developer = new Developer();
		Job son = new Sonheungmin();
		Job student = new Student();
		
		WorkPlace workPlace = new WorkPlace();
		
		workPlace.doWorking(developer, 8);
		workPlace.doWorking(student, 16);
		workPlace.doWorking(son, 6);
		
	}
	
}
