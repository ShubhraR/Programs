import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialTest {

	@Test
	public void FactorialPositiveTest() {
		Factorial factObj = new Factorial();
		assertEquals(479001600,factObj.calculateFactorial(12),"Factorial of 12 : 479001600");
	}
	@Test
	public void FactorialTestOfOne() {
		Factorial factObj = new Factorial();
		assertEquals(1,factObj.calculateFactorial(1));
	}
	@Test
	public void FactorialTestOf0() {
		Factorial factObj = new Factorial();
		assertEquals(1,factObj.calculateFactorial(0));
	}
	@Test
	public void FactorialTestOfNegative() {
		Factorial factObj = new Factorial();
		IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,()->factObj.calculateFactorial(-3));
		assertEquals("n cannot be < 0 !",ex.getMessage());
	}
	@Test
	public void FactorialTestOfEdgeCase() {
		Factorial factObj = new Factorial();
		IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,()->factObj.calculateFactorial(13));
		assertEquals("n cannot be greater than 12",ex.getMessage());
	}

}
