module app.financeiro {
	
	requires java.base; /*java.base vem importado por padrão :-)*/
	requires app.calculo;
	
	
	/*Como queremos depender diretamente da API,
	 * basta indicar conforme foi feito anteriormente.
	 * E indicar o SERVIÇO que será utilizado, que nesse caso
	 * é fornecido pela interface Calculadora.*/
	requires app.api;
	uses leonhar001.app.Calculadora;
	/*Nesse caso o módulo financeiro não sabe nada
	 * da implementação, apenas solicita um serviço
	 * para a interface Calculadora e é responsabilidade
	 * de um terceiro fornecer essa implementação...*/
}