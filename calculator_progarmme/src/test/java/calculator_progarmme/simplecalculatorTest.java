package calculator_progarmme;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import maysupport.Calculator;

public class simplecalculatorTest {

	@Test
	public void test_Sum() {
		calculator11 c = new calculator11();
		int result = c.add(5, 2);
		assertEquals(7, result);
	}

	
	@Test
	public void test_Sub() {
		calculator11 c = new calculator11();
		int result = c.subtract(5, 2);
		assertEquals(3, result);
	}
	
	@Test
	public void test_division() {
		calculator11 c = new calculator11();
		int result = c.divide(10, 2);
		assertEquals(5, result);
	}
}