package teste.consulta;

import java.util.List;

import infra.DAO;
import modelo.muitosparamuitos.Ator;
import modelo.muitosparamuitos.Filme;

public class ObterFilmes {
	public static void main(String[] args) {
		DAO <Filme> dao = new DAO<>(Filme.class);
		
		List<Filme> lista = dao.consultar("FilmesNotaMaiorQue", "nota", 8.0);
		
		for (Filme filme : lista) {
			System.out.println(filme.getNome()+" ==> "+filme.getNota());
			
			System.out.println(".:ATORES:.");
			for (Ator ator : filme.getAtores()) {
				System.out.println(ator.getNome());
			}
			System.out.println("\n");
		}
	}
}
