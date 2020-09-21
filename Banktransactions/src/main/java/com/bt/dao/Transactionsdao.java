package com.bt.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bt.entity.Transactions;

public interface Transactionsdao extends JpaRepository<Transactions, String> {

}
