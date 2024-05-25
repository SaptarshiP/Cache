package com.psja.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.psja.entity.ErtbMessage;
import com.psja.repo.ErtbRepo;

@Service
public class CustomMessageServiceImpl implements CustomMessageService{

	@Autowired
	private ErtbRepo ertbRepo;
	
	@Override
	public void getMessage( String applicationName ) {
		List<ErtbMessage> ertbMessageList = ertbRepo.getErtbMessage(applicationName);
		ertbMessageList.forEach( data->{
			System.out.println(data.getErrorCode());
			System.out.println(data.getErrorMessage());
			System.out.println("****************************");
		} );
	}
}
