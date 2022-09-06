package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Human;
import model.HumanEvents;

public class HumanEventsTest {
	Human human = new Human("Bob");
	HumanEvents hE = new HumanEvents();
	
	@Before
	public void setUp() throws Exception {
		human.setAge(21);
		human.setFavoriteColor("Blue");
	}

	@Test
	public void testHaveBirthday() {
		assertEquals(22,hE.haveBirthday(human));
	}
	
	@Test
	public void testIsFavoriteColor() {
		assertTrue(hE.isFavoriteColor(human, "blue"));
	}
	
	@Test
	public void testHowOldNotOne() {
		human.setAge(21);
		assertEquals("I'm 21 year's old!",hE.howOld(human));
	}
	
	@Test 
	public void testHowOldOne() {
		human.setAge(1);
		assertEquals("I'm a 1 year old!", hE.howOld(human));
		
	}

}
