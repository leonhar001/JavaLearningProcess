package streamAPI;

public class TestAverage {

	public static void main(String[] args) {

		Average a1 = new Average().add(9.3).add(6.7);
		Average a2 = new Average().add(4.7).add(10);
		
		System.out.println(a1.getValue());
		System.out.println(a2.getValue());

		System.out.println(Average.combine(a1, a2).getValue());
		
	}

}
