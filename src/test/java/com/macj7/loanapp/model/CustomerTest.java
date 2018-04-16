package com.macj7.loanapp.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class CustomerTest {
	
	Customer obj = new Customer();

	@Test
	public void testCustIdNo() {
		obj.setCustIdNo(100);
		assertEquals(100, obj.getCustIdNo());
	}

	
	@Test
	public void testCustName() {
		obj.setCustName("None");
		assertEquals("None", obj.getCustName());
	}

}
