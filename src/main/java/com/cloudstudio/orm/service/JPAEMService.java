package com.cloudstudio.orm.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cloudstudio.orm.entity.Product;

public class JPAEMService {

	public static void main(String[] args) {
		
		Persistence per=new Persistence();
		EntityManagerFactory emf=per.createEntityManagerFactory("testPer");
		
		EntityManager em=emf.createEntityManager();
		
		Product p=em.find(Product.class, 103);
		System.out.println(p.getName());
		em.close();
		emf.close();

	}

}
