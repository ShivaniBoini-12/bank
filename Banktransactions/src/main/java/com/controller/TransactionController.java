package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bt.entity.Slip;
import com.bt.entity.account;
import com.bt.exceptions.IdNotfound.IdNotFound;
import com.bt.exceptions.InsufficientBalance;
import com.bt.service.TransactionService;
@RestController
@RequestMapping("/transactions")
@CrossOrigin("http://localhost:4200")
public class TransactionController {
	@Autowired
	private TransactionService service;

	@PutMapping("/debitUsingSlip")
	public ResponseEntity<String> debitUsingSlip(@RequestBody Slip Debit) throws IdNotFound, InsufficientBalance  {
		account acc=service.getAccountbyID(Debit.getAccountNo());
		if(acc==null) {
			throw new IdNotFound("Please enter valid accountId!");
		}
		else {
			if(acc.getAmount()<=Debit.getAmount()) {
				throw new InsufficientBalance("Insufficient account balance");
			}
			else
			{
				ResponseEntity< String> details = new ResponseEntity<String>(service.debitUsingSlip(Debit),HttpStatus.OK);
				return details;
			}
		}
	}

}
