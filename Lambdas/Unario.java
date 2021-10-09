package lambdas;

import java.util.function.UnaryOperator;

public class Unario {
	public static void main(String[] args) {
		
		UnaryOperator<Integer> plus2 = n -> n+2;
		UnaryOperator<Integer> times2 = n -> n*2;
		UnaryOperator<Integer> square = n -> n*n;
		
		int result1 = plus2.andThen(times2).apply(2);
		System.out.println(result1);
		
		int result2 = plus2.compose(times2).apply(2);
		System.out.println(result2);
		
		

	}
	
}
