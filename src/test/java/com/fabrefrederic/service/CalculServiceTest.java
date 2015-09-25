package com.fabrefrederic.service;

import junit.framework.Assert;

import org.junit.Test;

import com.fabrefrederic.service.interfaces.CalculService;

public class CalculServiceTest {

	@Test
	public void calculTest() {
		// [given]
		final CalculService service = new CalculServiceImpl();
		int result;
		// [when]
		result = service.calcul();

		// [then]
		Assert.assertTrue(result > 10);
	}
}
