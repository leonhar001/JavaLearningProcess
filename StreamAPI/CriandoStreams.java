package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		Consumer<Integer> println = System.out::println;

		Stream<String> langs = Stream.of("C ", "Cpp ", "JS\n");
		langs.forEach(print);
		
		String[] moreLangs = { "Lua ", "Ruby ", "Phyton\n" };
		
		Stream.of(moreLangs).forEach(print);
		/*OR*/
		Arrays.stream(moreLangs).forEach(print);
		Arrays.stream(moreLangs, 1,2).forEach(print);
 		
		List<String> anotherLangs = Arrays.asList("Go ", "Perl ", "Kotlin\n");
		anotherLangs.stream().forEach(print);
		anotherLangs.parallelStream().forEach(print);
		
		//Stream.generate(()->"a").forEach(print);
		Stream.iterate(0, n -> n+1).forEach(println);;
	}

}
