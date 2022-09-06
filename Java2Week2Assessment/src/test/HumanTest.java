package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Human;

/**
 * Kenneth Gisler - kgisler@dmacc.edu
 * CIS171 22149
 * Sep 6, 2022
 */
public class HumanTest {
	Human human = new Human();
	
	@Before
	public void setUp() throws Exception {
		human.setName("Jim");;
	}

	@Test
	public void testGetName() {
		String name = human.getName();
		assertNotNull(name);
	}
	@Test
	public void testHuman() {
		Human hue = new Human();
		String name = hue.getName();
		assertNull(name);
	}

}
