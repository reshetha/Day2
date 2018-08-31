package com.capgemini.day1.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArmstrongTest {

	@Test
	void testCheckArmstrongNumber() 
	{
		assertEquals(true,Armstrong.checkArmstrongNumber(153));
		assertEquals(false,Armstrong.checkArmstrongNumber(123));
		assertEquals(false,Armstrong.checkArmstrongNumber('a'));
		assertEquals(false,Armstrong.checkArmstrongNumber(0x153));
		assertEquals(false,Armstrong.checkArmstrongNumber(0521));
		
		
		
	}

}
