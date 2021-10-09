package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	public static void main(String[] args) {
		
		Consumer<Produto> imprimir = p -> System.out.println(p.nome);;
		Produto p1 =  new Produto ("Lapis",10,0.1);
		imprimir.accept(p1);
		
		Produto p2 =  new Produto ("Borracha",12,0.2);
		Produto p3 =  new Produto ("Lapiseira",110,0.1);
		Produto p4 =  new Produto ("Pena",15,0.3);
		Produto p5 =  new Produto ("Caneta",13,0.1);
		
		List<Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5); 
		
		produtos.forEach(imprimir);
		produtos.forEach(p->System.out.println(p.preco));
		produtos.forEach(System.out::println);
		
	}
}
