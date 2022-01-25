package teste.heranca;

import infra.DAO;
import modelo.heranca.Pessoa;
import modelo.heranca.PessoaFisica;
import modelo.heranca.PessoaJuridica;

public class HierarquiaDeClasses {
	public static void main(String[] args) {
		
		DAO<Pessoa> dao = new DAO<>(Pessoa.class);
	
		PessoaFisica pessoaF = new PessoaFisica("Grilo", "776534362523");
		PessoaJuridica pessoaP = new PessoaJuridica("Grilaria S.A", "6633278959592");
		dao.incluirAtomico(pessoaF);
		dao.incluirAtomico(pessoaP);
		dao.fechar();
		
	}
}
