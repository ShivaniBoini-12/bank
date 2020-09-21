package com.bt.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bt.entity.Cheque;

public class Chequedao {
	@Repository
	public interface ChequeTransactionsDao extends JpaRepository<Cheque, String> {

		
		
		
	}

}
