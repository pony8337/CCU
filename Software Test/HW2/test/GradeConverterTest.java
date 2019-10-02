import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

class GradeConverterTest extends TestCase {

	@Test
	public void testGradeConverter() {
      // test GradeConverter construction
	  GradeConverter g1 = new GradeConverter();
	  assertNotNull(g1);	
	}
	
	@Test
	public void testConvert() {
	  GradeConverter g1 = new GradeConverter();
	  String test;
	  // Test convert method
	  try {
		test = g1.convert(100);
	    assertEquals("There is a bug in convert function of GradeConverter!", "A", test);
	  } catch(IllegalGradeException e) {
		assertTrue("No exception should be thrown.", false);
	  }
	  // Test exception of convert method
	  try {
		test = g1.convert(111);
		assertTrue("There should be a exception.", false);
	  } catch(IllegalGradeException e) {
		assertTrue(true);
	  }
	}

}
