package com.qa.receiver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.qa.entity.SentAccount;
import com.qa.repository.AccountRepository;

@Component
public class AccountReceiver {
	
	    @Autowired
	    private AccountRepository repo;

	    @JmsListener(destination = "AccountQueue", containerFactory = "myFactory")
	    public void receiveMessage(SentAccount sentAccount) {
	    	System.out.println(sentAccount);
	        repo.save(sentAccount);
	    }
}
