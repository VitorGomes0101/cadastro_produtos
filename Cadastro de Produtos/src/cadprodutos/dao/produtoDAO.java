package cadprodutos.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import cadprodutos.modelo.Produto;

public class produtoDAO {
	
	public void salvar(Produto produto){
		EntityManager entityManager = JPAUtil.getEntityManager();
		entityManager.getTransaction().begin();
		entityManager.merge(produto);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	
	public List<Produto> listarTodos(){
		EntityManager entityManager = JPAUtil.getEntityManager();
		Query query = entityManager.createQuery("from Produto");
		return query.getResultList();
	}

}
