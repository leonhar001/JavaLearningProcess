package streamAPI;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
	public static void main(String[] args) {
		
		List<String> paoCom= Arrays.asList("margarina", "maionese", "queijo", "mortadela");
	
		/*JEITO NOOB (NUM SENTIDO NÃO PEJORATIVO)*/
		/*FOREACH*/
		System.out.println("FOREACH");
		for (String string : paoCom) {
			System.out.println(string);
		}
		/*ITERATOR*/
		System.out.println("\nITERATOR");
		Iterator<String> it = paoCom.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		/*Usando Stream*/
		System.out.println("\nSTREAM");
		Stream<String> stream = paoCom.stream();
		stream.forEach(System.out::println);
		
	}
}
