package kr.hs.dgsw.java.dept23.d0421;

public class Square extends Rectangle{
		
	public Square(int side) {
		super(side, side);
	}
	
	@Override
	public String getType() {
		return "���簢��";
	}
	
	public static void main(String[] args) {
		Square square = new Square(5);
		square.print();
	}
	
}
