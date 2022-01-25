package modelo.muitosparamuitos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "filmes")
public class Filme {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;

	private Double nota;
	
	/*O cascade GARANTE QUE AO INSERIR OS FILMES SERÃO TAMBÉM
	 * INSERIDOS OS ATORES*/
	@ManyToMany(cascade = CascadeType.PERSIST)
	/*USA-SE JoinTable PARA CRIAR A TABELA DE JUNÇÃO (AH, SÉRIO?)
	 * ENFIM, EM JoinColumn COLOCAMOS O NOME (name) DA COLUNA DA CHAVE PRIMÁRIA
	 * DE UMA DAS LIGAÇÕES (escolhi o padrão "filme_id") e EM referencedColumnName
	 * INDICA-SE O NOME DO ATRIBUTO ONDE ESTÁ MAPEADA A CHAVE PRIMÁRIA, CONFORME
	 * EXEMPLIFICADO: =v= 
	 * PARA MEPEAR A CHAVE PRIMÁRIA DA OUTRA TABELA USA-SE A MESMA LÓGICA, PORÉM COM
	 * A NOTAÇÃO inverseJoinColumn...*/
	@JoinTable(
			name= "atores_filmes",
			joinColumns = @JoinColumn(name = "filme_id", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name = "ator_id", referencedColumnName = "id")
			)
	private List<Ator> atores;
	
	public Filme() {
		
	}
	
	public Filme(String nome, Double nota) {
		super();
		this.nome = nome;
		this.nota = nota;
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

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}

	public List<Ator> getAtores() {
		if(atores == null)
			atores = new ArrayList<>();
		return atores;
	}

	public void setAtores(List<Ator> atores) {
		this.atores = atores;
	}
	
	/*MÉTODO PARA ADICIONAR ATORES BIDERECIONALMENTE NUM FILME
	 * NÃO NECESSITANDO MANUALMENTE ADICIONAR TAMBÉM O FILME NA
	 * LISTA DE FILMES DO ATOR
	 * (DIFERENTE DO EXEMPLO TIO/SOBRINHO)*/
	public void addAtor(Ator ator) {
		if(ator != null && !getAtores().contains(ator)) {
			getAtores().add(ator);
			
			if(!ator.getFilmes().contains(this))
				ator.getFilmes().add(this);
		}
	}
}
