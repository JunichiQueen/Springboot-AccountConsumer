package com.qa.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.qa.entity.SentAccount;

@Repository
public interface AccountRepository extends MongoRepository<SentAccount, Long>{
	
}