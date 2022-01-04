package OperationsJenkins.OperationsJenkins;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import CalculationsJenkins.CalculationsJenkins.Operations;



class OperationsTest {

	
	
	
	@Test
	void testSumSuccess() {
		Operations op = new Operations();
		assertEquals(18, op.add(10,8));
	}
	
	@Test
	void testSumInputOneFailuerOutOfRange() {
		Operations op = new Operations();
		assertEquals(-1, op.add(2147483647,9999));
	}
	
	@Test
	void testSumInputTwoFailuerOutOfRange() {
		Operations op = new Operations();
		assertEquals(-1, op.add(1000000, 2147483647));
	}
	
	@Test
	void testSumFailuer() {
		Operations op = new Operations();
		assertNotEquals(200, op.add(100,201));
	}

	
	@Test
	void testSubSuccess() {
		Operations op = new Operations();
		assertEquals(92, op.sub(100,8));
	}
	
	@Test
	void testSubInputOneFailuerOutOfRange() {
		Operations op = new Operations();
		assertEquals(-1, op.sub(1000000, 2147483647));
	}
	
	@Test
	void testSubInputTwoFailuerOutOfRange() {
		Operations op = new Operations();
		assertEquals(-1, op.sub(2147483647,1000000));
	}
	
	@Test
	void testSubFailure() {
		Operations op = new Operations();
		assertNotEquals(92, op.sub(200,80));
	}
	
	@Test
	void testMulSuccess() {
		Operations op = new Operations();
		assertEquals(360, op.mul(12,30));
	}
	
	@Test
	void testMulInputOneFailuerOutOfRange() {
		Operations op = new Operations();
		assertEquals(-1, op.mul(214748364,10000));
	}
	
	@Test
	void testMulInputTwoFailuerOutOfRange() {
		Operations op = new Operations();
		assertEquals(-1, op.mul(2183,9900000));
	}
	
	@Test
	void testMulFailure() {
		Operations op = new Operations();
		assertNotEquals(90, op.mul(20,80));
	}
	
	@Test
	void testDivSuccess() {
		Operations op = new Operations();
		assertEquals(120, op.div(3600,30));
	}
	
	@Test
	void testDivInputOneFailuerOutOfRange() {
		Operations op = new Operations();
		assertEquals(-1, op.div(214748364,10000));
	}
	
	@Test
	void testDivInputTwoFailuerOutOfRange() {
		Operations op = new Operations();
		assertEquals(-1, op.div(2183,999900000));
	}
	
	@Test
	void testDivExceptionFailure() {
		Operations op = new Operations();
		assertEquals(-1, op.div(200,0));
	}
	
	@Test
	void testDivFailure() {
		Operations op = new Operations();
		assertNotEquals(90, op.div(200,20));
	}
	
	@Test
	void testExpSuccess() {
		Operations op = new Operations();
		assertEquals(8000, op.exp(20,3));
	}
	
	@Test
	void testExpBaseOutOfRange() {
		Operations op = new Operations();
		assertEquals(-1, op.exp(100,2));
	}
	
	@Test
	void testExpPowerOutOfRange() {
		Operations op = new Operations();
		assertEquals(-1, op.exp(200,20));
	}
	
	@Test
	void testExpFailure() {
		Operations op = new Operations();
		assertNotEquals(9000, op.div(30,5));
	}
	
	@Test
	void testFactSuccess() {
		Operations op = new Operations();
		assertEquals(720, op.fact(6));
	}
	
	@Test
	void testFactNumberOutOfRange() {
		Operations op = new Operations();
		assertEquals(-1, op.fact(20));
	}
	
	@Test
	void testFactFailure() {
		Operations op = new Operations();
		assertNotEquals(900, op.fact(11));
	}

}
