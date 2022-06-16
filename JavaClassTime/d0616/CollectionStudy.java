package kr.hs.dgsw.java.dept23.d0616;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class CollectionStudy {

	public void studyMap() {
		Map<String, Integer> map = new HashMap<String, Integer>();	// key, value
		
		map.put("�����ֶ�", 1592);
		map.put("�����Ǳ�", 1392);
		map.put("�Ŵ���߰�", 1492);
		map.put("������������", 1789);
		map.put("���θ����", 476);
		
		Integer year = map.get("�����ֶ�");
		System.out.println(year);
		
		year = map.get("����ź��");
		System.out.println(year);
		
//		String history = map.get(476);	// HashMap���� key���� �ƴ� value�����δ� �˻� �ҰŴ�
//		System.out.println(history);
		
		
		Set<String> keys = map.keySet();
		Collection<Integer> values = map.values();
	}
	
	public void studyQueue() {
		Queue<String> queue = new LinkedList<String>();
		List<String> list = new LinkedList<String>();
		
//		Queue<String> queue2 = new ArrayList<String>();
		
		queue.add("Korea");
		queue.add("Japan");
		queue.add("China");
		queue.add("USA");
		
		while (queue.size() > 0) {
			System.out.println(queue.poll());
		}
	}
	
	public void studySet() {
		Set<String> set = new HashSet<String>();
		
		set.add("Korea");
		set.add("Japan");
		set.add("China");
		set.add("USA");
		set.add("Korea");
		set.add("USA");
		set.add("Japan");
		
		for (String str : set) {
			System.out.println(str);
		}
		
	}
	
	public static void main(String[] args) {
		new CollectionStudy().studySet();
	}
	
}
