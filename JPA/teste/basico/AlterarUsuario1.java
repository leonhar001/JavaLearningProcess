package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario1 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario user = em.find(Usuario.class, 2L);
		System.out.println(user.getEmail());
		user.setEmail("leonardo@gmail.com");
		user.setNome("Leonardo Steffen");
		
		em.merge(user);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}
