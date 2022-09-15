package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import entidade.Bicicleta;
import util.JPAUtil;

public class BicicletaDao {
	public static void salvar(Bicicleta b) {
		EntityManager em = JPAUtil.criarEntityManager();
		em.getTransaction().begin();
		em.persist(b);
		em.getTransaction().commit();
		em.close();
	}
	
	public static void editar(Bicicleta b) {
		EntityManager em = JPAUtil.criarEntityManager();
		em.getTransaction().begin();
		em.merge(b);
		em.getTransaction().commit();
		em.close();
	}
	
	public static void excluir(Bicicleta b) {
		EntityManager em = JPAUtil.criarEntityManager();
		em.getTransaction().begin();
		b = em.find(Bicicleta.class, b.getId());
		em.remove(b);
		em.getTransaction().commit();
		em.close();
	}
	
	public static List<Bicicleta> listar(){
		EntityManager em = JPAUtil.criarEntityManager();
		Query q = em.createQuery("select b from Bicicleta b");
		List<Bicicleta> lista = q.getResultList();
		em.close();
		return lista;
	}
}
