package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Employee;

public class Accessemp {
	
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
	   public void insert(Employee emp)
	   {
		   et.begin();
		   em.persist(emp);
		   et.commit();
	   }
	}


