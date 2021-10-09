package lambdas;

import java.util.Arrays;
import java.util.List;



public class ForeachFuncional {

		public static void main(String[] args) {
			List<String> reprovados = Arrays
					.asList("José","Poliano","Louco");
			
		System.out.println("ForEach Tradicional:");
		for (String nome : reprovados) {
			System.out.println(nome);
		}
		System.out.println("\nCom Lambda #01");
		
		reprovados.forEach(nome-> System.out.println(nome+"!!"));
		
		System.out.println("\nMethod Reference...");
		reprovados.forEach(System.out::println);
		
		System.out.println("\nCom Lambda #02");
		reprovados.forEach( nome -> myPrint(nome));
		
		System.out.println("\nMethod Reference #02...");
		reprovados.forEach(ForeachFuncional::myPrint);
		}
		
		static void myPrint(String nome) {
			System.out.println("Meu nome é "+nome);
		}
}
