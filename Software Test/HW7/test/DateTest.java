import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateTest {

	@Test
	void testAbsoluteNumberOfDay() {
		try {
			Date day = new Date(4,3,1);
			assertEquals(1156, day.absoluteNumberOfDays());
		} catch(illegalDateException e) {
			assertTrue(false);
		}
		
		try {
			Date day = new Date(400,3,1);
			assertEquals(145792, day.absoluteNumberOfDays());
		} catch(illegalDateException e) {
			assertTrue(false);
		}
		
		try {
			Date day = new Date(1,3,1);
			assertEquals(60, day.absoluteNumberOfDays());
		} catch(illegalDateException e) {
			assertTrue(false);
		}
		
		try {
			Date day = new Date(100,3,1);
			assertEquals(36219, day.absoluteNumberOfDays());
		} catch(illegalDateException e) {
			assertTrue(false);
		}
		
		try {
			Date day = new Date(1,2,1);
			assertEquals(32, day.absoluteNumberOfDays());
		} catch(illegalDateException e) {
			assertTrue(false);
		}
		
		try {
			Date day = new Date(1,1,1);
			assertEquals(1, day.absoluteNumberOfDays());
		} catch(illegalDateException e) {
			assertTrue(false);
		}
	}

}
