package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Binario {

	public static void main(String[] args) {

		BinaryOperator<Double> media = 
				(x,y) -> (x+y)/2;
				
		double result = media.apply(2.0, 4.0);
		System.out.println(result);
		
		BiFunction<Double, Double, String> result1 = 
				(x,y) -> (x+y)/2 >=7 ? "Aproved!":"Reproved";
		
		String resultStrg = result1.apply(7.6, 6.3);
		System.out.println(resultStrg);
		
		Function<Double, String> finalResult = 
				m -> m >=7 ? "Aproved" : "Reproved";
		System.out.println(media.andThen(finalResult).apply(5.3, 8.1));
	}

}
