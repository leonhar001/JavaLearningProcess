package infra;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class DAO<E> {
	
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Class<E> classe;
	/*BLOCO ESTÁTICO: TREXO EXECUTADO APENAS
	 * QUANDO A CLASSE FOR CARREGADA PELO
	 * JAVA. 
	 * !!DEVE-SE TOMAR CUIDADO COM GERAÇÃO
	 * DE ERROS, POIS PODE IMPEDIR APLICAÇÃO
	 * DE INICIAR.*/
	static {
		try {
			emf = Persistence
					.createEntityManagerFactory("exercicios-jpa");
			
		} catch (Exception e) {
			/* logar -> log4j (API DE DEBUG)*/
		}
	}
	
	public DAO() {
		this(null);
	}
	
	public E obterPorId(Object id) {
		return em.find(classe, id);
	}
	
	public DAO(Class<E> classe) {
		this.classe = classe;
		em = emf.createEntityManager();
	}
	/*OBS: AO RETORNAR O OBJETO DAO NOS MÉTODOS
	 * É POSSÍVEL "ENCADEAR" DIVERSAS CHAMADAS NUM 
	 * MESMO DAO, EXEMPLO: 
	 * DAO<Exemplo> dao = new DAO<>(Exemplo.class);
	 * dao.abrirTransacao().incluir(exemplo).fecharTransacao().fechar();
	 * 
	 * */
	public DAO<E> abrirTransacao(){
		em.getTransaction().begin();
		return this;
	}
	
	public DAO<E> fecharTransacao(){
		em.getTransaction().commit();
		return this;
	}
	
	public DAO<E> incluir(E entidade){
		em.persist(entidade);
		return this;
	}
	
	public DAO<E> incluirAtomico(E entidade){
		return this
				.abrirTransacao()
				.incluir(entidade)
				.fecharTransacao();
	}
	
	public List<E> obterTodos(){
		return this.obterTodos(10, 0);
	}
	
	public List<E> obterTodos(int qntRegistros, int deslocamento){
		if(classe == null) {
			throw new UnsupportedOperationException("Classe nula.");
		}
		String jpql = "select e from "+classe.getName() + " e";
		TypedQuery<E> query = em.createQuery(jpql, classe);
		query.setMaxResults(qntRegistros);
		query.setFirstResult(deslocamento);
		return query.getResultList();
	}
	
	public List<E> consultar(String nomeConsulta, Object... params){
		TypedQuery<E> query = em.createNamedQuery(nomeConsulta, classe);
		
		for (int i = 0; i < params.length; i+=2) {
			query.setParameter(params[i].toString(), params[i+1]);
		}
		
		return query.getResultList();
	}
	
	/*MÉTODO PARA OS CASOS QUE NECESSITAMOS DE APENAS UM RETORNO DO BANCO:
	 * COMO CALCULAR UMA MÉDIA OU SABER A QUANTIDADE DE DETERMINADA COISA. */
	public E consultarUm(String nomeConsulta, Object... params){
		List<E> list = consultar(nomeConsulta, params);
		return list.isEmpty() ? null : list.get(0); 
	}
	
	/*NÃO SE FECHA O EMF POIS ELE SERVE PARA
	 * TODOS OS 'DAOS' CRIADOS NA APLICAÇÃO.
	 * QUEM É RESPONSÁVEL POR ENCAPSULAR ESSA
	 * COMUNICAÇÃO COM BANCO É 'EM'*/
	public void fechar() {
		em.close();
	}
}
