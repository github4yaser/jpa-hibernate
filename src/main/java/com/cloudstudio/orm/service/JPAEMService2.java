package com.cloudstudio.orm.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cloudstudio.orm.entity.Product;

public class JPAEMService2 {

	public static void main(String[] args) {
		
		Persistence per=new Persistence();
		EntityManagerFactory emf=per.createEntityManagerFactory("testPer");
		
		EntityManager em=emf.createEntityManager();
		
		Product p=new Product();
		p.setId(103);
		p.setName("xyz");
		em.getTransaction().begin();
		em.persist(p);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();

	}

}
