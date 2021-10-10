package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;
public class DesafioMap {

	public static void main(String[] args) {
		/*
		 * 1. Numbers to binary string 
		 * 2. Reserse string
		 * 3. Binary to integer
		 * */
		
		Consumer<Object> print = System.out::println;
		
		UnaryOperator<String> reverse =
				s -> new StringBuilder(s).reverse().toString();
		
		Function<String, Integer> strBinToInt = 
				s -> Integer.parseInt(s, 2);
	
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		numbers.stream()
			.map(Integer::toBinaryString) //METHOD REFERENCE!!!
			.map(reverse) 
			.map(strBinToInt)
			.forEach(print);
		
	}
}