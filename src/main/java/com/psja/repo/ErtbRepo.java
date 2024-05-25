package com.psja.repo;

import java.util.List; 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.psja.entity.ErtbMessage;

public interface ErtbRepo extends JpaRepository<ErtbMessage, String>, CustomRepo<ErtbMessage>{

	
}
