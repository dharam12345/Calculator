package com.as.test;

import org.junit.Test;

import com.as.sample.App;

import junit.framework.Assert;
import junit.framework.TestCase;

public class testFunctions extends TestCase {
	App app = new App();
	
	@Test
	public void testAdd() {
		Assert.assertEquals(7, app.add(5, 2));		
	}
		
	@Test
	public void testSub() {
		Assert.assertEquals(3, app.sub(5, 2));		
	}
	
	@Test
	public void testMultiply() {
		Assert.assertEquals(10, app.multiply(5, 2));		
	}

	@Test
	public void testDivide() {
		Assert.assertEquals(2, app.divide(5, 2));		
	}
}
