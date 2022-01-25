package teste.basico;

import java.util.List;

import infra.ProdutoDAO;
import modelo.basico.Produto;

public class ObterProdutos {
	public static void main(String[] args) {
		
		//DAO<Produto> dao = new DAO<>(Produto.class);
		ProdutoDAO dao = new ProdutoDAO();
		
		List<Produto> produtos = dao.abrirTransacao().obterTodos();
		dao.fechar();
		
		for (Produto produto : produtos) {
			System.out.println("Produto: "+produto.getNome()+", preço: "+produto.getPreco());
		}
		
		double total = produtos.stream()
				.map(p -> p.getPreco())
				.reduce(0.0, (t,p) -> t+p)
				.doubleValue();
		
		System.out.println("TOTAL: " + total);
	}
}
