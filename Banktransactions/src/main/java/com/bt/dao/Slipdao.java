package com.bt.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bt.entity.Slip;

@Repository
public interface Slipdao extends JpaRepository<Slip, String> {

	
	
	
}

