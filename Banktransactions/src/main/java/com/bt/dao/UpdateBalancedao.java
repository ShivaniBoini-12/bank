package com.bt.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.bt.entity.account;



public interface UpdateBalancedao extends JpaRepository<account, String> {
	
}