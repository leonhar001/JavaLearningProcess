package leonhar001.app.financeiro;
import java.util.ServiceLoader;

import leonhar001.app.Calculadora;

public class Teste {
	public static void main(String[] args) {
		
		/*EXEMPLO COM DEPENDENCIA DIRETA DA IMPLEMENTAÇÃO*/

//		/*Calculadora calc = new Calculadora();
//		System.out.println(calc.soma(3,32,5.3));
//		
//		/*Sessão de testes com java Refletion*/
//		/*É POSSÍVEL PEGAR O ATRIBUTO PRIVADO*/
//		System.out.println(Calculadora.class.getDeclaredFields()[0].getName());
//		
//		/*Porém, para fazer modificações com o refletion é necessário
//		 * setar o módulo como "aberto" (open)*/
//		Field fieldId = Calculadora.class.getDeclaredFields()[0];
//		fieldId.setAccessible(true);
//		try {
//			fieldId.set(calc, "yyy");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		fieldId.setAccessible(false);
//		System.out.println(calc.getAtributoPrivado());
		
		
		/*EXEMPLO UTILIZANDO DIRETAMENTE A INTERFACE*/
		/*Para fazer uso do recurso é necessário utilizar
		 * o ServiceLoader, onde o load irá procurar, nesse caso
		 * o primeiro "fornecedor" para a implementação:*/
		Calculadora calc = ServiceLoader
				.load(Calculadora.class)
				.findFirst()
				.get();
		System.out.println(calc.soma(3,5,3.3));
		
	}
	
}