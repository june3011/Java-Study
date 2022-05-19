package kr.hs.dgsw.java.dept23.d0519;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Divider {
	
	private Scanner sc;
	
	public Divider() {
		sc = new Scanner(System.in);
	}
	
	public int calculate(int value1, int value2) {
		return value1 / value2;
	}
	
//	private void saveResult(String filePath, int v1, int v2, int result) throws IOException {
//		
//		// ���� ��ü ����
//		File file = new File(filePath+"/writeTest.txt");
//		
//		
//		if (file.exists()) {
//			file.createNewFile();
//		}
//		
//		FileWriter fw = new FileWriter(file, true);
//		PrintWriter writer = new PrintWriter(fw);
//		
//		writer.println("%d / %d = %d".formatted(v1, v2, result));
//		
//		writer.close();		
//	}
	
	private boolean saveResult(String filePath, int value1, int value2, int result) {
		
		String str = String.format("%d / %d = %d\n", value1, value2, result);
		
		OutputStream os = null;
		
		try {
			File file = new File(filePath+"/writeTest.txt");		
			
			os = new FileOutputStream(file, true);	// true�� ���ԵǸ� ������ ���� ���� ������ �̾ ��
			os.write(str.getBytes());
			
			return true;
		} catch (Exception e) {
			System.out.println("���Ͽ� ������ �� �����ϴ�.");
		} finally {	// return �ϰԵǸ� ������ ���������� ������ finally�� �Ἥ return �ϱ� ���� finally���� ������
			if (os != null) {
				try {
					os.close();
				} catch(IOException e) {}
			}
		}
		
		
				
		return true;
	}
	
	public void execute() {
		
		try {

			System.out.println("�� ������ �Է��ϼ���.");
			
			int value1 = sc.nextInt();
			int value2 = sc.nextInt();
			
			int result = calculate(value1, value2);
			System.out.printf("%d / %d = %d\n", value1, value2, result);
			
			// ��� �İ� ����� ���Ϸ� �����Ѵ�.
			boolean saved = saveResult("C:/Users/DGSW/eclipse-workspace/�� ����/javaFirst/src/kr/hs/dgsw/java/dept23/d0519", value1, value2, result);
			
			System.out.println("���� ���� ��� : " + saved);
			
			
			 
			System.out.println("���α׷��� �����մϴ�.");
			
		} catch (InputMismatchException e) {
			System.out.println("���ڰ� �ƴ� ���ڸ� �Է��ϼ���.");
		} catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		} finally {
			sc.close();
		}
		
		/* catch (IOException e) {
			System.out.println("���Ͽ� ������ �� �����ϴ�.");
			e.printStackTrace();
		} */
		
		/* catch (Exception e) {
			System.out.println("���ܰ� �߻��Ͽ����ϴ�. " + e);
			
			if (e instanceof InputMismatchException) {
				System.out.println("���ڰ� �ƴ� ���ڸ� �Է��ϼ���.");
			} else if (e instanceof ArithmeticException) {
				System.out.println("0���� ���� �� �����ϴ�.");
			}
			
		} */
		
		
	}
	
	public static void main(String[] args) {
		new Divider().execute();
	}
	
}
