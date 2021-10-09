package lambdas;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {

			Produto p = new Produto("notebook", 1000, 0.1);
			/*PRECO REAL*/
			/*Usando o objeto do tipo produto como entrada*/
			Function<Produto,Double> realPrice2 = 
					pr -> pr.preco*(1-pr.desconto);
			/*Colocando os valores manualmente...menos "inteligente"*/
			BiFunction<Double, Double, Double> realPrice = 
					(price,des) -> price*(1-des);
			/*IMPOSTO MUNICIAL*/
			UnaryOperator<Double> taxes =
					rp -> rp >= 2500 ? rp+(rp*0.085) : rp;
			/*FRETE*/
			UnaryOperator<Double> freight = 
					fr -> fr >= 3000 ? fr+100 : fr+50;
			/*FORMATAÇÃO*/
			Function<Double, String> format = 
					f -> String.format("R$ %.2f", f).replace(",", ".");
			
			String finalPrice = realPrice
					.andThen(taxes)
					.andThen(freight)
					.andThen(format)
					.apply(p.preco, p.desconto);
					
			String finalPrice2 = realPrice2
					.andThen(taxes)
					.andThen(freight)
					.andThen(format)
					.apply(p);
			
				System.out.println(finalPrice);
			System.out.println(finalPrice2);
			
			/*
			 * 1. Calcular preço real
			 * 2. Imposto Municipal: >=2500(8,5%) / <2500(isento)
			 * 3. Frete: >= 3000(100)/<3000(50)
			 * 4. Deixar duas casas decimais
			 * 5. Formatar: R$1234,53
			 */
			
		
	}

}
