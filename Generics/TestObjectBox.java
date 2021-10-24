package generics;

public class TestObjectBox {

	public static void main(String[] args) {
		/*WITHOUT GENERICS*/
		
		ObjectBox boxA = new ObjectBox();
		boxA.keep(5.3);
		
		Double thingA = (Double) boxA.open();
		System.out.println(thingA);
		
		ObjectBox boxB = new ObjectBox();
		boxB.keep("hi");
		
		String thingB = (String) boxB.open();
		System.out.println(thingB);
	}
}
