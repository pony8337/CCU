import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GradeConverterTest {

	@Test
	public void testGradeConverter() {
	  GradeConverter g1 = new GradeConverter();
	  assertNotNull(g1);	
	}
	
	@Test
	public void testConvert() {
	  GradeConverter g1 = new GradeConverter();
	  try {
	    assertEquals("There is a bug in convert function of GradeConverter!", "A", g1.convert(100));
	  } catch(IllegalGradeException e) {
		assertTrue(false, "No exception should be thrown.");
	  }
	}

}
