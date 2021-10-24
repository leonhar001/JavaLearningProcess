package generics;

public class TestIntBox {

	public static void main(String[] args) {
		
		IntBox boxA = new IntBox();
		boxA.keep(32);
		
		System.out.println(boxA.open());
	}
}
