package lambdas;

public class CalculoTeste {

	public static void main(String[] args) {
		Calculo soma =  new Somar();
		Calculo multiplica = new Multiplicar();
		
		System.out.println(soma.executar(2, 6));
		System.out.println(multiplica.executar(2, 6));
	}

}
