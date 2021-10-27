package generics;

import java.util.TreeSet;

public class TestComparable {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> days = new TreeSet<>();
		
		days.add(1);
		days.add(4);
		days.add(3);
		days.add(7);
		days.add(-10);
		days.add(144);
		
		for (Integer n : days) {
			System.out.println(n);
		}
	}
}
