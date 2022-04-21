package kr.hs.dgsw.java.dept23.d0421;

public class Circle extends Square {
	
	public Circle(int radius) {
		super(radius);
	}
	
	@Override
	public double getArea() {
		return super.getArea() * Math.PI;
	}
	
	@Override
	public String getType() {
		return "��";
	}
	
	
	public static void main(String[] args) {
		Circle circle = new Circle(6);
		circle.print();
	}	
}
