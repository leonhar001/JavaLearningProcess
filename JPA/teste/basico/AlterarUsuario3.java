package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario3 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		/*DIFERENTE DO EXEMPLO ANTERIOR, USANDO O DETACH
		 * É POSSÍVEL TIRAR O USUÁRIO DO CONTEXTO GERENCIADO
		 * E NÃO É MAIS ALTERADO SEM O MERGE*/
		Usuario user = em.find(Usuario.class, 2L);
		//Cliente cliente = em.find(Cliente.class, 5L);
		em.detach(user); 
		//em.detach(cliente); 
		user.setNome("Leozinho");
		//cliente.setNome("Leozinho");
		em.merge(user);
		//em.merge(cliente);
		em.getTransaction().commit();
		
	}
}
