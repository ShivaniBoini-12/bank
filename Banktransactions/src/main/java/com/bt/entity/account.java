package com.bt.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity 
	@Table(name="Account")	       //details of table
	public class account {
		@Id  
		@Column(length=12)         //specify details of column
		private String accountId;
		@Column(length=8)
		private Double amount;
		@Column(length = 20)
		private Date lastUpdate;
		
		//generation of getters and setters
		
		public String getAccountId() {
			return accountId;
		}
		public void setAccountId(String accountId) {
			this.accountId = accountId;
		}
		public Double getAmount() {
			return amount;
		}
		public void setAmount(Double amount) {
			this.amount = amount;
		}
		public Date getLastUpdate() {
			return lastUpdate;
		}
		public void setLastUpdate(Date lastUpdate) {
			this.lastUpdate = lastUpdate;
		}
	
	}
		
