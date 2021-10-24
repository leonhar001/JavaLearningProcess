package generics;

public class TestBoxNumber {
	public static void main(String[] args) {
		BoxNumber<Double> boxA = new BoxNumber<>();
		boxA.keep(33.6);
		System.out.println(boxA.open());
	}
}
