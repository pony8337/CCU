import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

class WholesaleCompanyTest extends TestCase{

	@Test
	void testWholesaleCompany() {
	    // test WholesaleCompany construction
		WholesaleCompany company = new WholesaleCompany("Test Company");
		assertNotNull(company);
	}
	
	@Test
	void testGetName() {
		String errorMessage = "There is an issue in the getName method";
		WholesaleCompany company = new WholesaleCompany("Test Company");		
		//test getName method - correct input test
		assertEquals(errorMessage, "Test Company", company.getName());
		//test getName method - wrong input test
		assertNotEquals(errorMessage, "Tesst Commpany", company.getName());
	}
	
	@Test
	void testPrice() {
		String errorMessage = "There is an issue in the price method";
		WholesaleCompany company = new WholesaleCompany("Test Company");
		//Test price method
		try {//16
			assertEquals(errorMessage,  1350, company.price(1,  1500));
			assertEquals(errorMessage,   475, company.price(1,   500));
			assertEquals(errorMessage, 33750, company.price(25, 1500));
			assertEquals(errorMessage, 22523, company.price(25, 1001));
			assertEquals(errorMessage, 23750, company.price(25, 1000));
			assertEquals(errorMessage, 11875, company.price(25,  500));
			assertEquals(errorMessage,    24, company.price(25,    1));
			assertEquals(errorMessage, 67500, company.price(50, 1500));
			assertEquals(errorMessage, 23750, company.price(50,  500));
			assertEquals(errorMessage, 61200, company.price(51, 1500));
			assertEquals(errorMessage, 22950, company.price(51,  500));
			assertEquals(errorMessage, 90000, company.price(75, 1500));
			assertEquals(errorMessage, 60060, company.price(75, 1001));
			assertEquals(errorMessage, 67500, company.price(75, 1000));
			assertEquals(errorMessage, 33750, company.price(75,  500));
			assertEquals(errorMessage,    68, company.price(75,    1));
		} catch(IllegalArgumentException e) {
			assertTrue("No exception should be thrown.", false);
		}
		
		//Test the exceptions of price method
		//(-4, 500)
		try {
			company.price(-4, 500);
			assertTrue("There should be a exception.", false);
		} catch (IllegalArgumentException e) {
			assertTrue(true);
		}
		try {
			company.price(25, -4);
			assertTrue("(25, -4), there should be a exception.", false);
		} catch (IllegalArgumentException e) {
			assertTrue(true);
		}
		//(0, 1500)
		try {
			company.price(0, 1500);
			assertTrue("(0, 1500), there should be a exception.", false);
		} catch (IllegalArgumentException e) {
			assertTrue(true);
		}
		//(0, 500)
		try {
			company.price(0, 500);
			assertTrue("(0, 500), There should be a exception.", false);
		} catch (IllegalArgumentException e) {
			assertTrue(true);
		}
		//(25, 0)
		try {
			company.price(25, 0);
			assertTrue("(25, 0), There should be a exception.", false);
		} catch (IllegalArgumentException e) {
			assertTrue(true);
		}
		//(75, 0)
		try {
			company.price(75, 0);
			assertTrue("(75, 0), There should be a exception.", false);
		} catch (IllegalArgumentException e) {
			assertTrue(true);
		}
	}
}
