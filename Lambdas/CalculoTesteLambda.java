package lambdas;

public class CalculoTesteLambda {

	public static void main(String[] args) {
		Calculo cal = (x,y) ->{
			return x+y;
		};
		
		System.out.println(cal.executar(3, 5));
		
		cal = (x,y) -> x*y;
		System.out.println(cal.executar(3, 5));
	}
	

}
