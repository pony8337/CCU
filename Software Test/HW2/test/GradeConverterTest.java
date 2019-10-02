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
	  // Test convert method
	  try {
	    assertEquals("There is a bug in convert function of GradeConverter!", "A", g1.convert(100));
	  } catch(IllegalGradeException e) {
		assertTrue("No exception should be thrown.", false);
	  }
	  // Test exception of convert method
	  try {
		g1.convert(101);
		assertTrue("There should be a exception.", false);
	  } catch(IllegalGradeException e) {
		assertTrue(true);
	  }
	}

}
