package com.bt.exceptions;

public class IdNotfound {
	
	@SuppressWarnings("serial")
	public class IdNotFound extends Exception{
		public IdNotFound(String errorMsg){
			super(errorMsg);
		}
	}


}
