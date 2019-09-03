package uvu.cs.cs3250.inclass;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ClassDemoTest {
	private ClassDemo demo;
	
	@Before
	public void setUp() {
		demo = new ClassDemoImpl();
	}
	
	@Test
	public void testEcho() {
		assertEquals("dummy", demo.echo("dummy"));
	}
	
	@Test
	public void testGetDescription() {
		assertEquals("This is an interface", demo.getDescription());
	}
}
