package com.bt.entity;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Cheque")                           //details of table
public class Cheque {
	@Id                                         //specification of primary key
	@Column(length = 4)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int transactionID;
	@Column(length = 6)
	private String chequeNumber;
	@Column(length = 12)
	private String payeeAccountNo;
	@Column(length = 12)
	private String beneficiaryAccountNo;
	@Column(length=7)
	private double amount;
	@Column(length = 12)
	private String bankName;
	@Column(length=10)
	private String Ifsc;
	@Column(length = 10)
	private Date chequeissueDate;
	
	//generation of getters and setters
	public int getTransactionID() {
		return transactionID;
	}
	public void setTransactionID(int transactionID) {
		this.transactionID = transactionID;
	}
	public String getChequeNumber() {
		return chequeNumber;
	}
	public void setChequeNumber(String chequeNumber) {
		this.chequeNumber = chequeNumber;
	}
	public String getPayeeAccountNo() {
		return payeeAccountNo;
	}
	public void setPayeeAccountNo(String payeeAccountNo) {
		this.payeeAccountNo = payeeAccountNo;
	}
	public String getBeneficiaryAccountNo() {
		return beneficiaryAccountNo;
	}
	public void setBeneficiaryAccountNo(String beneficiaryAccountNo) {
		this.beneficiaryAccountNo = beneficiaryAccountNo;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getIfsc() {
		return Ifsc;
	}
	public void setIfsc(String ifsc) {
		Ifsc = ifsc;
	}
	public Date getChequeissueDate() {
		return chequeissueDate;
	}
	public void setChequeissueDate(Date chequeissueDate) {
		this.chequeissueDate = chequeissueDate;
	}
	

}
