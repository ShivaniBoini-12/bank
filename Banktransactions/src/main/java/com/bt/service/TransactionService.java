package com.bt.service;

import com.bt.entity.Cheque;
import com.bt.entity.Slip;
import com.bt.entity.account;

public interface TransactionService {


	String debitUsingSlip(Slip debit) ;
	

	String updateBalance(account balance) ;


	account getAccountbyID(String accountID);


	String debitUsingCheque(Cheque debit);


	String creditUsingCheque(Cheque credit);


	String creditUsingSlip(Slip credit);

}