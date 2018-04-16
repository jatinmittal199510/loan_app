package com.macj7.loanapp.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoanTest {

	Loan obj = new Loan();
	@Test
	public void testLoanNo() {
		Integer i = new Integer(100);
		obj.setLoanNo(i);
		assertNotEquals(i, obj.getLoanNo());
	}


	@Test
	public void testLoanStatusId() {
		Integer i = new Integer(100);
		obj.setLoanStatusId(i);
		assertEquals(i, obj.getLoanStatusId());
	}

}
