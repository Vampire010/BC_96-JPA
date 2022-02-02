package com.jpa.persist;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Student;

public class Persist_Student {

	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("student");
		EntityManager em =emf.createEntityManager();
		em.getTransaction().begin();
		
		Student s1 = new Student();
		s1.setId(101);
		s1.setName("jon");
		s1.setFees(1000);
		
		em.persist(s1);

	}

}
