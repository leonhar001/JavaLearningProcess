package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario2 {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		
		/*IMPORTANTE: MESMO SEM O MERGE A MODIFICAÇÃO É FEITA
		POIS QUANDO USAMOS O FIND ESTAMOS NUM CONTEXTO GERENCIADOR
		SENDO POSSÍVEL, QUANDO NESSE CONTEXTO, FAZER AS MODIFICAÇÕES
		SEM O MERGE*/
		Usuario user = em.find(Usuario.class, 2L);
		System.out.println(user.getEmail());
		user.setNome("Leonardo S");
		
		em.getTransaction().begin();
		//em.merge(user);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
	
}
