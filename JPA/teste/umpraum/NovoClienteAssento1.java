package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssento1 {

	public static void main(String[] args) {
		
		DAO<Assento> daoAssento = new DAO<>(Assento.class);
		DAO<Cliente> daoCliente = new DAO<>(Cliente.class);
		Assento assento1 = new Assento("12D");
		
		Cliente cliente1 = new Cliente("Lucas", assento1);

		daoAssento.incluirAtomico(assento1).fechar();

		daoCliente.incluirAtomico(cliente1).fechar();
	}
	
}
