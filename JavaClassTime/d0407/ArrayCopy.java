package kr.hs.dgsw.java.dept23.d0407;

public class ArrayCopy {
	
	/**
	 * �־��� src �迭�� �����ؼ� �����Ѵ�
	 * 
	 * @param src
	 * @return
	 * 
	 */
	
	public String[] copy(String[] src) {
		String[] result = new String[src.length];
		
		for (int i=0; i<src.length; i++) {
			result[i] = src[i];
		}
		
		return result;
		
	}
	
	public int[] copy(int[] num) {
		int[] result = new int[num.length];
		
		for (int i=0; i<num.length; i++) {
			result[i] = num[i];
		}
		
		return result;
	}
	
}
