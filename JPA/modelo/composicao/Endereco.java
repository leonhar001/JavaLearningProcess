package modelo.composicao;

import javax.persistence.Embeddable;

/*USA-SE Embeddable PARA QUANDO QUEREMOS INTEGRAR
 * OS ATRIBUTOS DE DETERMINADA CLASSE NAQUELAS TABELAS
 * QUE IMPLEMENTAREM A CLASSE, COMO É O CASO DE ENDEREÇO*/
@Embeddable
public class Endereco {
	
	private String logradouro;
	private String complemento;
	
	public Endereco() {

	}
	
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	
}
