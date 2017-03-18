package com.bdgolka.lambda;

import javax.naming.ldap.Rdn;

public class LambdaExceptionDemo {

	public static void main(String[] args) {
		
		double[] values = {1.0, 2.0, 3.0, 4.0};
		
		/**
		 * This block lambda expression may generate
		 * expression IOExpression. Therefore this exception
		 * should be specified in the methods operator throw
		 * ioAction() of functional interface MyIOAction.		 *  
		 */
		
		MyIOAction myIO = (rdr) ->{
			//may generate an exception IOException 
			int ch = rdr.read();
			return true;
		};
		

	}

}
