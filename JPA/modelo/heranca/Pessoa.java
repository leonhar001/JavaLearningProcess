package modelo.heranca;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/*
 * @Inheritance(strategy = InheritanceType.SINGLE_TABLE)
 * 
 * NESSA ESTRATÉGIA É GERADA UMA ÚNICA TABELA QUE IRÁ
 * FAZER TODA A HIERARQUIA DAS CLASSES
 * COM OS DADOS DE Pessoa + PessoaFisica + PessoaJuridica 
 * O ATRIBUTO discriminator DIFERENCIA OS DOIS TIPOS DE PESSOAS*/


/*
 * @Inheritance(strategy = InheritanceType.JOINED)
 * 
 * NESSA ESTRATÉGIA É GERADA UMA TABELA PARA CADA CLASSE COM SEUS
 * RESPECTIVOS ATRIBUTOS E REFERENCIADO ATRAVÉS DE UMA CHAVE 
 * ESTRANGEIRA DAS TABELAS QUE HERDAM DA CLASSE "MÃE"
 * */

/*
 * @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
 * 
 * NESSA ESTRATÉGIA É GARADA UMA TABELADA PARA CADA CLASSE CONCRETA, 
 * OU SEJA, SE Pessoa FOR CLASSE ABSTRATA E PesssoaFisica e Juridica SÃO 
 * CLASSES FILHO, CRIA-SE NO BANCO APENAS AS TABELAS pessoaFisica E
 * pessoaJuridica
 * */


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo", length = 1, discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("P")
public class Pessoa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	/*O ATRIBULO "tipo" SERVE COMO DISCRIMINADOR
	 * PARA A CRIAÇÃO DA TABELA NO BANCO. ONDE
	 * IREMOS DEFINIR PESSOA JURÍDICA OU FÍSICA,
	 * FAZENDO ASSIM A HERANÇA*/
	@Column(insertable=false, updatable=false)
	private String tipo;
	
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}
	public Pessoa(String nome) {
		this.nome = nome;
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
