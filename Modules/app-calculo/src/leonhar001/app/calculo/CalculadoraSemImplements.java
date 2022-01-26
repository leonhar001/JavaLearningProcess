package leonhar001.app.calculo;

import leonhar001.app.calculo.interno.OperacoesAritmeticas;

public class CalculadoraSemImplements {
	
	private String atributoPrivado = "xxx";
	
	private OperacoesAritmeticas opArit = new OperacoesAritmeticas();

	public Double soma(double... nums) {
		return opArit.soma(nums);
	}

	public String getAtributoPrivado() {
		return atributoPrivado;
	}
	
}
