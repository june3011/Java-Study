package kr.hs.dgsw.java.dept23.d0407;

import java.util.Arrays;

public class ArrayStudy {
	
	public void studyArray() {
		
		int array2[];
		
		String[] names = new String[5];
		
		int[] array1 = new int[10];
		int[] values = {1, 2, 3, 4, 5};
		
		//TODO colors ��� ���ڿ� Ÿ���� �迭�� �����ϰ�, ���� �ʱ�ȭ �غ�����.
		String[] colors = {"����", "���", "�Ķ�", "�ʷ�", "����"};
		
		System.out.println(colors[1]);
		colors[4] = "��ȫ";
		
		printLastValue(colors);
		
		printColors(colors);
		
//		String myColor = colors[5];
//		System.out.println("myColor : " + myColor);
		
		String[] colors2 = colors;	// colors�� �迭�� �ּ� ���� ����
		
		colors2[2] = "blue";
		System.out.println(colors[2]);	// blue
		System.out.println(colors2[2]);	// blue
		
		ArrayCopy arrayCopy = new ArrayCopy();
		String[] colors3 = arrayCopy.copy(colors);
		colors3[3] = "green";
//		System.out.println(colors[3]);
		
		System.out.println("colors : " + Arrays.toString(colors));
		System.out.println("colors2 : " + Arrays.toString(colors2));
		System.out.println("colors3 : " + Arrays.toString(colors3));

		
		int[] intArray = {1, 2, 3, 4, 5};
		int[] copyIntArray = arrayCopy.copy(intArray);
		intArray[2] = 1;
		System.out.println("intArray : " + Arrays.toString(intArray));
		System.out.println("copyIntArray : " + Arrays.toString(copyIntArray));
	}
	
	public void printColors(String[] colors) {
		// TODO colors�� ����ִ� ���� �ε��� - �� �������� ��� ����� ������.
		for (int i=0; i<colors.length; i++) {
			System.out.println(i+" - "+colors[i]);
		}
		
		for (String color : colors) {
			System.out.println(color);
		}
		// �κи� ����ϴ� ���� �ƴ϶�� Ÿ���� �絵 ����,
		// �Ʒ��ڵ尡 �� ���ϴ�
		// ������ i���� �˾ƾ��ϸ� ���� ����� �� ����
	}
	
	
	public void printLastValue(String[] values) {
		
//		int length = values.length;
//		System.out.println(values[length-1]);
		System.out.println(values[values.length-1]);
	}
	
	
	public static void main(String[] args) {
		
		ArrayStudy study = new ArrayStudy();
		study.studyArray();
		
		
	}
}
