package com.psja.repo;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.beans.factory.annotation.Autowired;

import com.psja.entity.ErtbMessage;

public class CustomRepoImpl implements CustomRepo<ErtbMessage>{
	
	@Autowired
	private EntityManager em;

	
	@Cacheable(value="ertbMessage")
	public List<ErtbMessage> getErtbMessage(String applicationName){
		
		System.out.println("Inserting into CustomRepoImpl---->getErtbMessage");
		Query query = em.createNamedQuery( "ErtbMessage.findByApplicationName" );
		query.setParameter("applicationName", applicationName);
		System.out.println("Exiting from CustomRepoImpl---->getErtbMessage");
		return query.getResultList();
	}

}
