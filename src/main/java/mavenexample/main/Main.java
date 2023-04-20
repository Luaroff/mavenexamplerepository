package mavenexample.main;

import jakarta.persistence.EntityManager;

import mavenexample.Banco;
import mavenexample.db.Conn;

public class Main {

	public static void main(String[] args) {
		EntityManager em = Conn.getInstancia().getFactory().createEntityManager();
		
		Banco bancoSaga = new Banco();
		bancoSaga.setBancoNombre("Banco Saga");
		
		em.getTransaction().begin();
		em.persist(bancoSaga);
		em.getTransaction().commit();
		
		System.out.println("Nuevo banco de nombre: " + bancoSaga.getBancoNombre());

	}

}
