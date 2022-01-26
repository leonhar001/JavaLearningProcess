package leonhar001.app.calculo;

import leonhar001.app.Calculadora;
import leonhar001.app.calculo.interno.OperacoesAritmeticas;
/*RÉPLICA DA OUTRA CLASSE, PORÉM UTILIZADA PARA FAZER OS EXEMPLOS
 * DE provides with E uses NOS MÓDULOS*/
public class CalculadoraImplementacao implements Calculadora {
	
	private String atributoPrivado = "zzz";
	
	private OperacoesAritmeticas opArit = new OperacoesAritmeticas();

	public Double soma(double... nums) {
		return opArit.soma(nums);
	}

	public String getAtributoPrivado() {
		return atributoPrivado;
	}
}
