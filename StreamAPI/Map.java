package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {

	public static void main(String[] args) {

		Consumer<String> print = System.out::println;
		
		List<String> philos = Arrays.asList("Nietzsche", "Descartes", "Platão", "Socrates");
		
		philos.stream().map(n->n.toUpperCase()).forEach(print);
		
		UnaryOperator<String> upperCase = e -> e.toUpperCase();
		UnaryOperator<String> inicial = e -> e.charAt(0) + "";
		
		System.out.println("\nCom composição...");
		philos.stream()
			.map(upperCase)
			//.map(inicial)
			.forEach(print);;
	}

}
