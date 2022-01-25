package teste.muitosparamuitos;

import infra.DAO;
import modelo.muitosparamuitos.Ator;
import modelo.muitosparamuitos.Filme;

public class NovoFilmeAtor {

	public static void main(String[] args) {
		
		Filme filmeA = new Filme("A guerra do fim", 9.0);
		Filme filmeB = new Filme("A porcaria da múmia", 8.8);
		
		Ator atorA = new Ator("Rodrigo Carlos Sobrinho");
		Ator atrizB = new Ator("Juliana Paes");
		
		filmeA.addAtor(atorA);
		filmeA.addAtor(atrizB);
		filmeB.addAtor(atorA);
		
		DAO<Filme> dao = new DAO<Filme>();
		
		/*COMO COLOCAMOS persist E cascade COMO ATRIBUTOS TANTO
		 * PARA ATOR COMO PARA FILME, SIMPLESMENTE AO ADICIONAR
		 * O filmeA ELE IRÁ ACIONAR OS ATORES (Rodrigo e Juliana)
		 * E AO PERCEBER QUE EXISTE UM OUTRO FILME RELACIONADO
		 * COM Rodrigo, IRÁ AUTOMATICAMENTE ADICIONA-LO NA TABELA,
		 * MESMO QUE NÃO TENHAMOS DIRETAMENTE INCLUÍDO.*/
		dao.incluirAtomico(filmeA);
		
	}

}
