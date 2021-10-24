package generics;

public class TestBox {

	public static void main(String[] args) {
		/*USING GENERICS*/
		Box<String> boxA = new Box<>();
		boxA.keep("Striiing!");
		System.out.println(boxA.open());
		
		Box<Double> boxB = new Box<>();
		boxB.keep(32.3);
		System.out.println(boxB.open());
	}

}
