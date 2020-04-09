import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

class QueueTest extends TestCase{
    //[class-level unit]++
	@Test
    void testClass() {
    	// test case 1
		try {
			Queue q = new Queue(1);
			assertEquals("[]", q.toString());
			q.insert(123);
			assertEquals("[123]", q.toString());
			q.delete();
			assertEquals("[]", q.toString());
			}
			catch (Exception e) {
			assertTrue(false);
		}
		
    	// test case 2
		try {
			Queue q = new Queue(1);
			assertEquals("[]", q.toString());
			q.insert(213);
			assertEquals("[213]", q.toString());
			q.delete();
			assertEquals("[]", q.toString());
			q.insert(476);
			assertEquals("[476]", q.toString());
			q.delete();
			assertEquals("[]", q.toString());
			}
			catch (Exception e) {
			assertTrue(false);
		}
		
    	// test case 3
		try {
			Queue q = new Queue(2);
			assertEquals("[]", q.toString());
			q.insert(256);
			assertEquals("[256]", q.toString());
			q.delete();
			assertEquals("[]", q.toString());
			}
			catch (Exception e) {
			assertTrue(false);
		}
		
    	// test case 4
		try {
			Queue q = new Queue(2);
			assertEquals("[]", q.toString());
			q.insert(351);
			assertEquals("[351]", q.toString());
			q.insert(476);
			assertEquals("[351,476]", q.toString());
			q.delete();
			assertEquals("[476]", q.toString());
			q.delete();
			assertEquals("[]", q.toString());
			}
			catch (Exception e) {
			assertTrue(false);
		}
		
		// test case 5
		try {
			Queue q = new Queue(2);
			assertEquals("[]", q.toString());
			q.insert(213);
			assertEquals("[213]", q.toString());
			q.delete();
			assertEquals("[]", q.toString());
			q.insert(476);
			assertEquals("[476]", q.toString());
			q.delete();
			assertEquals("[]", q.toString());
			}
			catch (Exception e) {
			assertTrue(false);
		}
		
    	// test case 6
		try {
			Queue q = new Queue(2);
			assertEquals("[]", q.toString());
			q.insert(351);
			assertEquals("[351]", q.toString());
			q.insert(476);
			assertEquals("[351,476]", q.toString());
			q.delete();
			assertEquals("[476]", q.toString());
			q.insert(569);
			assertEquals("[476,569]", q.toString());
			q.delete();
			assertEquals("[569]", q.toString());
			q.delete();
			assertEquals("[]", q.toString());
			}
			catch (Exception e) {
			assertTrue(false);
		}
		
		// test case 7
		try {
			Queue q = new Queue(4);
			assertEquals("[]", q.toString());
			q.insert(256);
			assertEquals("[256]", q.toString());
			q.delete();
			assertEquals("[]", q.toString());
			}
			catch (Exception e) {
			assertTrue(false);
		}
		
    	// test case 8
		try {
			Queue q = new Queue(4);
			assertEquals("[]", q.toString());
			q.insert(213);
			assertEquals("[213]", q.toString());
			q.delete();
			assertEquals("[]", q.toString());
			q.insert(476);
			assertEquals("[476]", q.toString());
			q.delete();
			assertEquals("[]", q.toString());
			}
			catch (Exception e) {
			assertTrue(false);
		}
		
    	// test case 9
		try {
			Queue q = new Queue(4);
			assertEquals("[]", q.toString());
			q.insert(351);
			assertEquals("[351]", q.toString());
			q.insert(476);
			assertEquals("[351,476]", q.toString());
			q.delete();
			assertEquals("[476]", q.toString());
			q.delete();
			assertEquals("[]", q.toString());
			}
			catch (Exception e) {
			assertTrue(false);
		}
		
    	// test case 10
		try {
			Queue q = new Queue(4);
			assertEquals("[]", q.toString());
			q.insert(351);
			assertEquals("[351]", q.toString());
			q.insert(476);
			assertEquals("[351,476]", q.toString());
			q.insert(743);
			assertEquals("[351,476,743]", q.toString());
			q.delete();
			assertEquals("[476,743]", q.toString());
			q.delete();
			assertEquals("[743]", q.toString());
			q.delete();
			assertEquals("[]", q.toString());
			}
			catch (Exception e) {
			assertTrue(false);
		}
		
    	// test case 11
		try {
			Queue q = new Queue(4);
			assertEquals("[]", q.toString());
			q.insert(351);
			assertEquals("[351]", q.toString());
			q.insert(476);
			assertEquals("[351,476]", q.toString());
			q.delete();
			assertEquals("[476]", q.toString());
			q.insert(569);
			assertEquals("[476,569]", q.toString());
			q.delete();
			assertEquals("[569]", q.toString());
			q.delete();
			assertEquals("[]", q.toString());
			}
			catch (Exception e) {
			assertTrue(false);
		}
		
		// test case 12
		try {
			Queue q = new Queue(4);
			assertEquals("[]", q.toString());
			q.insert(351);
			assertEquals("[351]", q.toString());
			q.insert(476);
			assertEquals("[351,476]", q.toString());
			q.insert(743);
			assertEquals("[351,476,743]", q.toString());
			q.insert(674);
			assertEquals("[351,476,743,674]", q.toString());
			q.delete();
			assertEquals("[476,743,674]", q.toString());
			q.delete();
			assertEquals("[743,674]", q.toString());
			q.delete();
			assertEquals("[674]", q.toString());
			q.delete();
			assertEquals("[]", q.toString());
			}
			catch (Exception e) {
			assertTrue(false);
		}
		
		// test case 13
		try {
			Queue q = new Queue(4);
			assertEquals("[]", q.toString());
			q.insert(351);
			assertEquals("[351]", q.toString());
			q.insert(476);
			assertEquals("[351,476]", q.toString());
			q.insert(743);
			assertEquals("[351,476,743]", q.toString());
			q.insert(674);
			assertEquals("[351,476,743,674]", q.toString());
			q.delete();
			assertEquals("[476,743,674]", q.toString());
			q.insert(744);
			assertEquals("[476,743,674,744]", q.toString());
			q.delete();
			assertEquals("[743,674,744]", q.toString());
			q.delete();
			assertEquals("[674,744]", q.toString());
			q.delete();
			assertEquals("[744]", q.toString());
			q.delete();
			assertEquals("[]", q.toString());
			}
			catch (Exception e) {
			assertTrue(false);
		}
    }
	//[class-level unit]--
	
	@Test
	void testQueue() {
		try {
			Queue q1 = new Queue(-1);
			assertTrue(false);
			}
			catch (Exception e) {
			assertTrue(true);
		}
		try {
			Queue q2 = new Queue(0);
			assertEquals("[]", q2.toString());
			}
			catch (Exception e) {
			assertTrue(false);
		}
		try {
			Queue q3 = new Queue(1);
			q3.insert(18549);
			assertEquals("[18549]", q3.toString());
			}
			catch (Exception e) {
			assertTrue(false);
		}
	}
    
	@Test
	void testInsert() {
		//Bound = 0
		try {
			Queue q1 = new Queue(0);
			q1.insert(20413);
			assertTrue(false);
			}
			catch (Exception e) {
			assertTrue(true);
		}
		//Bound = 1
		try {
			Queue q2 = new Queue(1);
			q2.insert(17932);
			assertEquals("[17932]", q2.toString());
			}
			catch (Exception e) {
			assertTrue(false);
		}
		
		try {
			Queue q3 = new Queue(1);
			q3.insert(15090);
			q3.insert(13852);
			assertTrue(false);
			}
			catch (Exception e) {
			assertTrue(true);
		}
		//Bound = 4
		try {
			Queue q4 = new Queue(4);
			q4.insert(7957);
			assertEquals("[7957]", q4.toString());
			}
			catch (Exception e) {
			assertTrue(false);
		}
		
		try {
			Queue q5 = new Queue(4);
			q5.insert(12966);
			q5.insert(20791);
			assertEquals("[12966,20791]", q5.toString());
			}
			catch (Exception e) {
			assertTrue(false);
		}
		
		try {
			Queue q6 = new Queue(4);
			q6.insert(32620);
			q6.insert(26564);
			q6.insert(8313);
			assertEquals("[32620,26564,8313]", q6.toString());
			}
			catch (Exception e) {
			assertTrue(false);
		}
		
		try {
			Queue q7 = new Queue(4);
			q7.insert(11197);
			q7.insert(12099);
			q7.insert(23650);
			q7.insert(15683);
			assertEquals("[11197,12099,23650,15683]", q7.toString());
			}
			catch (Exception e) {
			assertTrue(false);
		}
		
		try {
			Queue q8 = new Queue(4);
			q8.insert(30607);
			q8.insert(5226);
			q8.insert(7243);
			q8.insert(27443);
			q8.insert(13204);
			assertTrue(false);;
			}
			catch (Exception e) {
			assertTrue(true);
		}
		
	}
	
	@Test
	void testDelete() {
		//bound = 0
		try {
			Queue q1 = new Queue(0);
			q1.delete();
			assertTrue(false);
			}
			catch (Exception e) {
			assertTrue(true);
		}		

		//Bound = 1
		try {
			Queue q2 = new Queue(1);
			q2.delete();
			assertTrue(false);
			}
			catch (Exception e) {
			assertTrue(true);
		}
		try {
			Queue q3 = new Queue(1);
			q3.insert(32547);
			q3.delete();
			assertEquals("[]",q3.toString());
			}
			catch (Exception e) {
			assertTrue(false);
		}
		
		//bound = 4
		try {
			Queue q4 = new Queue(4);
			q4.delete();
			assertTrue(false);
			}
			catch (Exception e) {
			assertTrue(true);
		}
		
		try {
			Queue q5 = new Queue(4);
			q5.insert(32547);
			q5.delete();
			assertEquals("[]",q5.toString());
			}
			catch (Exception e) {
			assertTrue(false);
		}
		
		try {
			Queue q6 = new Queue(4);
			q6.insert(27187);
			q6.insert(20166);
			q6.delete();
			assertEquals("[20166]",q6.toString());
			}
			catch (Exception e) {
			assertTrue(false);
		}
		
		try {
			Queue q7 = new Queue(4);
			q7.insert(13455);
			q7.insert(27667);
			q7.insert(23069);
			q7.delete();
			assertEquals("[27667,23069]",q7.toString());
			}
			catch (Exception e) {
			assertTrue(false);
		}
		
		try {
			Queue q8 = new Queue(4);
			q8.insert(13163);
			q8.insert(28409);
			q8.insert(27022);
			q8.insert(30682);
			q8.delete();
			assertEquals("[28409,27022,30682]",q8.toString());
			}
			catch (Exception e) {
			assertTrue(false);
		}		
    }
	

    @Test
    void testFirst() {
    	//Bound = 0
    	try {
			Queue q1 = new Queue(0);
			assertEquals("[]", q1.toString());
			q1.first();
			assertTrue(false);
			}
			catch (Exception e) {
			assertTrue(true);
		}
    	//Bound = 1
    	try {
			Queue q2 = new Queue(1);
			assertEquals("[]", q2.toString());
			q2.first();
			assertTrue(false);
			}
			catch (Exception e) {
			assertTrue(true);
		}
    	try {
			Queue q3 = new Queue(1);
			q3.insert(5742);
			assertEquals("[5742]", q3.toString());
			assertEquals(5742, q3.first());
			}
			catch (Exception e) {
			assertTrue(false);
		}
    	//Bound = 4
    	try {
			Queue q4 = new Queue(4);
			assertEquals("[]", q4.toString());
			q4.first();
			assertTrue(false);
			}
			catch (Exception e) {
			assertTrue(true);
		}
    	try {
			Queue q5 = new Queue(4);
			q5.insert(5742);
			assertEquals("[5742]", q5.toString());
			assertEquals(5742, q5.first());
			}
			catch (Exception e) {
			assertTrue(false);
		}
    	try {
			Queue q6 = new Queue(4);
			q6.insert(28346);
			q6.insert(31323);
			assertEquals("[28346,31323]", q6.toString());
			assertEquals(28346, q6.first());
			}
			catch (Exception e) {
			assertTrue(false);
		}
    	try {
			Queue q7 = new Queue(4);
			q7.insert(2588);
			q7.insert(19114);
			q7.insert(19567);
			assertEquals("[2588,19114,19567]", q7.toString());
			assertEquals(2588, q7.first());
			}
			catch (Exception e) {
			assertTrue(false);
		}
    	try {
			Queue q8 = new Queue(4);
			q8.insert(793);
			q8.insert(21403);
			q8.insert(17308);
			q8.insert(16585);
			assertEquals("[793,21403,17308,16585]", q8.toString());
			assertEquals(793, q8.first());
			}
			catch (Exception e) {
			assertTrue(false);
		}
    }
	
    @Test
    void testLast() {
    	//Bound = 0
    	try {
			Queue q1 = new Queue(0);
			assertEquals("[]", q1.toString());
			q1.last();
			assertTrue(false);
			}
			catch (Exception e) {
			assertTrue(true);
		}
    	//Bound = 1
    	try {
			Queue q2 = new Queue(1);
			assertEquals("[]", q2.toString());
			q2.last();
			assertTrue(false);
			}
			catch (Exception e) {
			assertTrue(true);
		}
    	try {
			Queue q3 = new Queue(1);
			q3.insert(27808);
			assertEquals("[27808]", q3.toString());
			assertEquals(27808, q3.last());
			}
			catch (Exception e) {
			assertTrue(false);
		}
    	//Bound = 4
    	try {
			Queue q4 = new Queue(4);
			assertEquals("[]", q4.toString());
			q4.last();
			assertTrue(false);
			}
			catch (Exception e) {
			assertTrue(true);
		}
    	try {
			Queue q5 = new Queue(4);
			q5.insert(27808);
			assertEquals("[27808]", q5.toString());
			assertEquals(27808, q5.last());
			}
			catch (Exception e) {
			assertTrue(false);
		}
    	try {
			Queue q6 = new Queue(4);
			q6.insert(1551);
			q6.insert(32612);
			assertEquals("[1551,32612]", q6.toString());
			assertEquals(32612, q6.last());
			}
			catch (Exception e) {
			assertTrue(false);
		}
    	try {
			Queue q7 = new Queue(4);
			q7.insert(6169);
			q7.insert(8014);
			q7.insert(29632);
			assertEquals("[6169,8014,29632]", q7.toString());
			assertEquals(29632, q7.last());
			}
			catch (Exception e) {
			assertTrue(false);
		}
    	try {
			Queue q8 = new Queue(4);
			q8.insert(6020);
			q8.insert(20198);
			q8.insert(30260);
			q8.insert(22571);
			assertEquals("[6020,20198,30260,22571]", q8.toString());
			assertEquals(22571, q8.last());
			}
			catch (Exception e) {
			assertTrue(false);
		}
    }
	
    @Test
    void testIsEmpty() {
    	//bound = 0
    	try {
			Queue q1 = new Queue(0);
			assertEquals(true, q1.isEmpty());
			}
			catch (Exception e) {
			assertTrue(false);
		}
    	//bound = 1
    	try {
			Queue q2 = new Queue(1);
			assertEquals(true, q2.isEmpty());
			}
			catch (Exception e) {
			assertTrue(false);
		}
    	try {
			Queue q3 = new Queue(1);
			q3.insert(23083);
			assertEquals(false, q3.isEmpty());
			}
			catch (Exception e) {
			assertTrue(false);
		}
    	//bound = 4
    	try {
			Queue q4 = new Queue(4);
			assertEquals(true, q4.isEmpty());
			}
			catch (Exception e) {
			assertTrue(false);
		}
    	try {
			Queue q5 = new Queue(4);
			q5.insert(23083);
			assertEquals(false, q5.isEmpty());
			}
			catch (Exception e) {
			assertTrue(false);
		}
    	try {
			Queue q6 = new Queue(4);
			q6.insert(14584);
			q6.insert(26871);
			assertEquals(false, q6.isEmpty());
			}
			catch (Exception e) {
			assertTrue(false);
		}
    	try {
			Queue q7 = new Queue(4);
			q7.insert(5023);
			q7.insert(1496);
			q7.insert(8642);
			assertEquals(false, q7.isEmpty());
			}
			catch (Exception e) {
			assertTrue(false);
		}
    	try {
			Queue q8 = new Queue(4);
			q8.insert(26464);
			q8.insert(16812);
			q8.insert(10251);
			q8.insert(8412);
			assertEquals(false, q8.isEmpty());
			}
			catch (Exception e) {
			assertTrue(false);
		}
    }
    
    @Test
    void testIsFull() {
    	//bound = 0
    	try {
			Queue q1 = new Queue(0);
			assertEquals(true, q1.isFull());
			}
			catch (Exception e) {
			assertTrue(false);
		}
    	//bound = 1
    	try {
			Queue q2 = new Queue(1);
			assertEquals(false, q2.isFull());
			}
			catch (Exception e) {
			assertTrue(false);
		}
    	try {
			Queue q3 = new Queue(1);
			q3.insert(17588);
			assertEquals(true, q3.isFull());
			}
			catch (Exception e) {
			assertTrue(false);
		}
    	//bound = 4
    	try {
			Queue q4 = new Queue(4);
			assertEquals(false, q4.isFull());
			}
			catch (Exception e) {
			assertTrue(false);
		}
    	try {
			Queue q5 = new Queue(4);
			q5.insert(22349);
			assertEquals(false, q5.isFull());
			}
			catch (Exception e) {
			assertTrue(false);
		}
    	try {
			Queue q6 = new Queue(4);
			q6.insert(22373);
			q6.insert(2470);
			assertEquals(false, q6.isFull());
			}
			catch (Exception e) {
			assertTrue(false);
		}
    	try {
			Queue q7 = new Queue(4);
			q7.insert(23456);
			q7.insert(10365);
			q7.insert(31827);
			assertEquals(false, q7.isFull());
			}
			catch (Exception e) {
			assertTrue(false);
		}
    	try {
			Queue q8 = new Queue(4);
			q8.insert(20529);
			q8.insert(26875);
			q8.insert(29913);
			q8.insert(11530);
			assertEquals(true, q8.isFull());
			}
			catch (Exception e) {
			assertTrue(false);
		}
    }
    
	/********************************************************/
	
	
    @Test
    void testGetBound() {
    	try {
			Queue q1 = new Queue(0);
			assertEquals(0, q1.getBound());
			}
			catch (Exception e) {
			assertTrue(false);
		}
    }
    
    @Test
    void testToString() {
    	try {
			Queue q1 = new Queue(4);
			q1.insert(123);
			q1.insert(321);
			assertEquals("[123,321]", q1.toString());
			}
			catch (Exception e) {
			assertTrue(false);
		}
    }
}
