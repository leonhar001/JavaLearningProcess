package teste.basico;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class ObterClienteAssento {

	public static void main(String[] args) {
		DAO<Cliente> daoCliente = new DAO<>(Cliente.class);
		
		Cliente cliente = daoCliente.obterPorId(2L);
		/*ACESSANDO ASSENTO ATRAVÉS DO CLIENTE*/
		System.out.println(cliente.getAssento().getNome());
		/*ACESSANDO CLIENTE ATRAVÉS DO ASSENTO*/
		System.out.println(cliente.getAssento().getCliente().getNome());
		
		daoCliente.fechar();
		
		DAO<Assento> daoAssento = new DAO<>(Assento.class);
		Assento assento = daoAssento.obterPorId(2L);
		System.out.println(assento.getCliente().getNome());
	
		daoAssento.fechar();
	}

}
