package generics;

public class TestPairs {

	public static void main(String[] args) {
		
		Pairs<Integer, String> gradesResult = new Pairs<>();
		gradesResult.add(1, "Joseph");
		gradesResult.add(2, "Mary");
		gradesResult.add(3, "Leonard");
		gradesResult.add(4, "James");
		
		System.out.println(gradesResult.getValue(3));
		System.out.println(gradesResult.getValue(1));

	}

}
