package com.mahesh.springbootsample.model;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface  AccountRepository extends JpaRepository<Account, Long>{
	
	Optional<Account> findByUsername(String Username);

}
