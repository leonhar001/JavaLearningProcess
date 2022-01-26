
/*Através do open é possível abrir o módulo para 
 * modificações de atributos privados via
 * refletion e PRINCIPALMENTE limitar a atuação
 * do refletion...*/
/*open module app.calculo {*/

module app.calculo {
	//exports leonhar001.app.calculo;
	//requires transitive app.logging;
	
	exports leonhar001.app.calculo
		to app.financeiro, app.logging;
	
	/*É possível usar o opens também somente
	 * para alguns pacotes*/
	/*opens leonhar001.app.calculo;*/
	
	/*É possível também usar o "opens to" para
	 * determinar quem poderá acessar*/
	opens leonhar001.app.calculo
		to app.financeiro;
	
	/*Tornando calculo dependente da API PUBLICA
	 * Pois ele irá precisar implementar a interface*/
	requires app.api;
	/*Indica-se a implementação da seguinte maneira:*/
	provides leonhar001.app.Calculadora
		with leonhar001.app.calculo.CalculadoraImplementacao;
}