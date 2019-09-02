package uvu.cs.cs3250.inclass;


import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


public class LoopDemoTest {
	private LoopDemo demo;
	
	@Before
	public void beforeEach() {
		demo = new LoopDemo();
	}
	
	@Test
	public void testsumWithVariableArguments() {
		assertEquals(10, demo.sumWithVariableArguments(2, -3, 8, 1, 2));
	}
	
	@Test
	public void testsumWithWhileLoop() {
		int[] numbers = {2, -3, 8, 1, 2};
		assertEquals(10, demo.sumWithWhileLoop(numbers));
	}
	
	@Test
	public void testsum1() {
		List<Integer> numbers = Arrays.asList(2, -3, 8, 1, 2);
		assertEquals(10, demo.sumUsingForEach(numbers));
	}
}
