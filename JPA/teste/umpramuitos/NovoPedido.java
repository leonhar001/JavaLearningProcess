package teste.umpramuitos;

import infra.DAO;
import modelo.basico.Produto;
import modelo.umpramuitos.ItemPedido;
import modelo.umpramuitos.Pedido;

public class NovoPedido {
	public static void main(String[] args) {
		DAO<Object> dao = new DAO<>();
		
		Produto produto = new Produto("Baralho", 15.50);
		Pedido pedido = new Pedido();
		
		ItemPedido itemPedido = new ItemPedido(pedido, produto, 3);
		
		dao
			.abrirTransacao()
			.incluir(produto)
			.incluir(pedido)
			.incluir(itemPedido)
			.fecharTransacao()
			.fechar();
	}
}
