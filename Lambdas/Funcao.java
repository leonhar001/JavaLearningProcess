package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {

		Function<Integer, String> parImpar = 
				x -> x%2 == 0 ? "Par" : "Impar";
		
		System.out.println(parImpar.apply(13));
		
		Function<String, String> oResultadoE = 
				result -> "O resultado é: "+result;
				
		Function<String, String> empolgado = 
				result -> result + "!!!";
		//System.out.println(oResultadoE.apply(parImpar.apply(3)));
		 
		String result = parImpar.andThen(oResultadoE).andThen(empolgado).apply(33);
		
		System.out.println(result);
		
	}

}
