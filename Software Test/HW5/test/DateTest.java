import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateTest {

	@Test
	void testDate() {
		/* 
		 * Test Case - Exception:  (0, 0, 0), (4000, 0, 0), (0, 13, 0), (0, 0, 32)
		 * Test Case: (1, 1, 31), (1, 1, 1), (1, 3, 31), (1, 3, 1), 
		 *            (1, 5, 31), (1, 5, 1), (1, 7, 31), (1, 7, 1),
		 *            (1, 8, 31), (1, 8, 1), (1, 10, 31), (1, 10, 1), 
		 *            (1, 12, 31), (1, 12, 1), (1, 2, 28), (1, 2, 1),
		 *            (100, 2, 28), (100, 2, 1), (400, 2, 29), (400, 2, 1), 
		 *            (4, 2, 29), (4, 2, 1), (1, 4, 30), (1, 4, 1),
		 *            (1, 6, 30), (1, 6, 1), (1, 9, 30), (1, 9, 1), 
		 *            (1, 11, 30), (1, 11, 1)*/
		int year, month, day;
		year = 0;month = 0;day = 0;
		try {
		  Date date = new Date(year, month, day);
		  assertTrue(false);
		}catch(IllegalDateException e){
		  assertTrue(true);
		}
		
		year = 4000;month = 0;day = 0;
		try {
		  Date date = new Date(year, month, day);
		  assertTrue(false);
		}catch(IllegalDateException e){
		  assertTrue(true);
		}
		
		year = 0;month = 13;day = 0;
		try {
		  Date date = new Date(year, month, day);
		  assertTrue(false);
		}catch(IllegalDateException e){
		  assertTrue(true);
		}
		
		year = 0;month = 0;day = 32;
		try {
		  Date date = new Date(year, month, day);
		  assertTrue(false);
		}catch(IllegalDateException e){
		  assertTrue(true);
		}
		
		year = 1;month = 1;day = 31;
		try {
		  Date date = new Date(year, month, day);
		  assertTrue(true);
		}catch(IllegalDateException e){
		  assertTrue(false);
		}
		
		year = 1;month = 1;day = 1;
		try {
		  Date date = new Date(year, month, day);
		  assertTrue(true);
		}catch(IllegalDateException e){
		  assertTrue(false);
		}
		
		year = 1;month = 3;day = 31;
		try {
		  Date date = new Date(year, month, day);
		  assertTrue(true);
		}catch(IllegalDateException e){
		  assertTrue(false);
		}
		
		year = 1;month = 3;day = 1;
		try {
		  Date date = new Date(year, month, day);
		  assertTrue(true);
		}catch(IllegalDateException e){
		  assertTrue(false);
		}
		
		year = 1;month = 5;day = 31;
		try {
		  Date date = new Date(year, month, day);
		  assertTrue(true);
		}catch(IllegalDateException e){
		  assertTrue(false);
		}
		
		year = 1;month = 5;day = 1;
		try {
		  Date date = new Date(year, month, day);
		  assertTrue(true);
		}catch(IllegalDateException e){
		  assertTrue(false);
		}
		
		year = 1;month = 7;day = 31;
		try {
		  Date date = new Date(year, month, day);
		  assertTrue(true);
		}catch(IllegalDateException e){
		  assertTrue(false);
		}
		
		year = 1;month = 7;day = 1;
		try {
		  Date date = new Date(year, month, day);
		  assertTrue(true);
		}catch(IllegalDateException e){
		  assertTrue(false);
		}
		
		year = 1;month = 8;day = 31;
		try {
		  Date date = new Date(year, month, day);
		  assertTrue(true);
		}catch(IllegalDateException e){
		  assertTrue(false);
		}
		
		year = 1;month = 8;day = 1;
		try {
		  Date date = new Date(year, month, day);
		  assertTrue(true);
		}catch(IllegalDateException e){
		  assertTrue(false);
		}
		
		year = 1;month = 10;day = 31;
		try {
		  Date date = new Date(year, month, day);
		  assertTrue(true);
		}catch(IllegalDateException e){
		  assertTrue(false);
		}
		
		year = 1;month = 10;day = 1;
		try {
		  Date date = new Date(year, month, day);
		  assertTrue(true);
		}catch(IllegalDateException e){
		  assertTrue(false);
		}
		
		year = 1;month = 12;day = 31;
		try {
		  Date date = new Date(year, month, day);
		  assertTrue(true);
		}catch(IllegalDateException e){
		  assertTrue(false);
		}
		
		year = 1;month = 12;day = 1;
		try {
		  Date date = new Date(year, month, day);
		  assertTrue(true);
		}catch(IllegalDateException e){
		  assertTrue(false);
		}
		
		year = 1;month = 2;day = 28;
		try {
		  Date date = new Date(year, month, day);
		  assertTrue(true);
		}catch(IllegalDateException e){
		  assertTrue(false);
		}
		
		year = 1;month = 2;day = 1;
		try {
		  Date date = new Date(year, month, day);
		  assertTrue(true);
		}catch(IllegalDateException e){
		  assertTrue(false);
		}
		
		year = 100;month = 2;day = 28;
		try {
		  Date date = new Date(year, month, day);
		  assertTrue(true);
		}catch(IllegalDateException e){
		  assertTrue(false);
		}
		
		year = 100;month = 2;day = 1;
		try {
		  Date date = new Date(year, month, day);
		  assertTrue(true);
		}catch(IllegalDateException e){
		  assertTrue(false);
		}
		
		year = 400;month = 2;day = 29;
		try {
		  Date date = new Date(year, month, day);
		  assertTrue(true);
		}catch(IllegalDateException e){
		  assertTrue(false);
		}
		
		year = 400;month = 2;day = 1;
		try {
		  Date date = new Date(year, month, day);
		  assertTrue(true);
		}catch(IllegalDateException e){
		  assertTrue(false);
		}
		
		year = 4;month = 2;day = 29;
		try {
		  Date date = new Date(year, month, day);
		  assertTrue(true);
		}catch(IllegalDateException e){
		  assertTrue(false);
		}
		
		year = 4;month = 2;day = 1;
		try {
		  Date date = new Date(year, month, day);
		  assertTrue(true);
		}catch(IllegalDateException e){
		  assertTrue(false);
		}
		
		year = 1;month = 4;day = 30;
		try {
		  Date date = new Date(year, month, day);
		  assertTrue(true);
		}catch(IllegalDateException e){
		  assertTrue(false);
		}
		
		year = 1;month = 4;day = 1;
		try {
		  Date date = new Date(year, month, day);
		  assertTrue(true);
		}catch(IllegalDateException e){
		  assertTrue(false);
		}
		
		year = 1;month = 6;day = 30;
		try {
		  Date date = new Date(year, month, day);
		  assertTrue(true);
		}catch(IllegalDateException e){
		  assertTrue(false);
		}
		
		year = 1;month = 6;day = 1;
		try {
		  Date date = new Date(year, month, day);
		  assertTrue(true);
		}catch(IllegalDateException e){
		  assertTrue(false);
		}
		
		year = 1;month = 9;day = 30;
		try {
		  Date date = new Date(year, month, day);
		  assertTrue(true);
		}catch(IllegalDateException e){
		  assertTrue(false);
		}
		
		year = 1;month = 9;day = 1;
		try {
		  Date date = new Date(year, month, day);
		  assertTrue(true);
		}catch(IllegalDateException e){
		  assertTrue(false);
		}
		
		year = 1;month = 11;day = 30;
		try {
		  Date date = new Date(year, month, day);
		  assertTrue(true);
		}catch(IllegalDateException e){
		  assertTrue(false);
		}
		
		year = 1;month = 11;day = 1;
		try {
		  Date date = new Date(year, month, day);
		  assertTrue(true);
		}catch(IllegalDateException e){
		  assertTrue(false);
		}
	}
	
	@Test
	void testGetYear() {
		// Test Case: (1, 1, 1)
		int year, month, day;
		year = 1;month = 1;day = 1;
		try {
  		  Date date = new Date(year, month, day);
  		  assertEquals(1, date.getYear());
		}catch(IllegalDateException e) {
		  assertTrue(false);
		}
	}
	
	@Test
	void testGetMonth() {
		// Test Case: (1, 1, 1)
		int year, month, day;
		year = 1;month = 1;day = 1;
		try {
  		  Date date = new Date(year, month, day);
		  assertEquals(1, date.getMonth());
		}catch(IllegalDateException e) {
		  assertTrue(false);
		}
	}

	@Test
	void testGetDay() {
		// Test Case: (1, 1, 1)
		int year, month, day;
		year = 1;month = 1;day = 1;
		try {
  		  Date date = new Date(year, month, day);
		  assertEquals(1, date.getDay());
		}catch(IllegalDateException e) {
		  assertTrue(false);
		}
	}
	
	@Test
	void testNext() {
		/* (1, 12, 31), (1, 12, 1), (1, 1, 31), (1, 1, 1), (1, 3, 31), (1, 3, 1), (1, 5, 31), (1, 5, 1),
		 * (1, 7, 31), (1, 7, 1), (1, 8, 31), (1, 8, 1), (1, 10, 31), (1, 10, 1), (1, 4, 30), (1, 4, 1),
		 * (1, 6, 30), (1, 6, 1), (1, 9, 30), (1, 9, 1), (1, 11, 30), (1, 11, 1), (400, 2, 29), (400, 2, 1),
		 * (4, 2, 29), (4, 2, 1), (1, 2, 28), (1, 2, 1), (100, 2, 28), (100, 2, 1) */
		int year, month, day;
		year = 1;month = 12;day = 31;
		try {
		  Date date1 = new Date(year, month, day);
		  Date date2 = date1.next();
		  assertEquals("2/1/1", date2.toString());
		}catch(IllegalDateException e) {
			assertTrue(false);
		}
		
		year = 1;month = 12;day = 1;
		try {
		  Date date1 = new Date(year, month, day);
		  Date date2 = date1.next();
		  assertEquals("1/12/2", date2.toString());
		}catch(IllegalDateException e) {
			assertTrue(false);
		}
		
		year = 1;month = 1;day = 31;
		try {
		  Date date1 = new Date(year, month, day);
		  Date date2 = date1.next();
		  assertEquals("1/2/1", date2.toString());
		}catch(IllegalDateException e) {
			assertTrue(false);
		}
		
		year = 1;month = 1;day = 1;
		try {
		  Date date1 = new Date(year, month, day);
		  Date date2 = date1.next();
		  assertEquals("1/1/2", date2.toString());
		}catch(IllegalDateException e) {
			assertTrue(false);
		}
		
		year = 1;month = 3;day = 31;
		try {
		  Date date1 = new Date(year, month, day);
		  Date date2 = date1.next();
		  assertEquals("1/4/1", date2.toString());
		}catch(IllegalDateException e) {
			assertTrue(false);
		}
		
		year = 1;month = 3;day = 1;
		try {
		  Date date1 = new Date(year, month, day);
		  Date date2 = date1.next();
		  assertEquals("1/3/2", date2.toString());
		}catch(IllegalDateException e) {
			assertTrue(false);
		}
		
		year = 1;month = 5;day = 31;
		try {
		  Date date1 = new Date(year, month, day);
		  Date date2 = date1.next();
		  assertEquals("1/6/1", date2.toString());
		}catch(IllegalDateException e) {
			assertTrue(false);
		}
		
		year = 1;month = 5;day = 1;
		try {
		  Date date1 = new Date(year, month, day);
		  Date date2 = date1.next();
		  assertEquals("1/5/2", date2.toString());
		}catch(IllegalDateException e) {
			assertTrue(false);
		}
		
		year = 1;month = 7;day = 31;
		try {
		  Date date1 = new Date(year, month, day);
		  Date date2 = date1.next();
		  assertEquals("1/8/1", date2.toString());
		}catch(IllegalDateException e) {
			assertTrue(false);
		}
		
		year = 1;month = 7;day = 1;
		try {
		  Date date1 = new Date(year, month, day);
		  Date date2 = date1.next();
		  assertEquals("1/7/2", date2.toString());
		}catch(IllegalDateException e) {
			assertTrue(false);
		}
		
		year = 1;month = 8;day = 31;
		try {
		  Date date1 = new Date(year, month, day);
		  Date date2 = date1.next();
		  assertEquals("1/9/1", date2.toString());
		}catch(IllegalDateException e) {
			assertTrue(false);
		}
		
		year = 1;month = 8;day = 1;
		try {
		  Date date1 = new Date(year, month, day);
		  Date date2 = date1.next();
		  assertEquals("1/8/2", date2.toString());
		}catch(IllegalDateException e) {
			assertTrue(false);
		}
		
		year = 1;month = 10;day = 31;
		try {
		  Date date1 = new Date(year, month, day);
		  Date date2 = date1.next();
		  assertEquals("1/11/1", date2.toString());
		}catch(IllegalDateException e) {
			assertTrue(false);
		}
		
		year = 1;month = 10;day = 1;
		try {
		  Date date1 = new Date(year, month, day);
		  Date date2 = date1.next();
		  assertEquals("1/10/2", date2.toString());
		}catch(IllegalDateException e) {
			assertTrue(false);
		}
		
		year = 1;month = 4;day = 30;
		try {
		  Date date1 = new Date(year, month, day);
		  Date date2 = date1.next();
		  assertEquals("1/5/1", date2.toString());
		}catch(IllegalDateException e) {
			assertTrue(false);
		}
		
		year = 1;month = 4;day = 1;
		try {
		  Date date1 = new Date(year, month, day);
		  Date date2 = date1.next();
		  assertEquals("1/4/2", date2.toString());
		}catch(IllegalDateException e) {
			assertTrue(false);
		}
		
		year = 1;month = 6;day = 30;
		try {
		  Date date1 = new Date(year, month, day);
		  Date date2 = date1.next();
		  assertEquals("1/7/1", date2.toString());
		}catch(IllegalDateException e) {
			assertTrue(false);
		}
		
		year = 1;month = 6;day = 1;
		try {
		  Date date1 = new Date(year, month, day);
		  Date date2 = date1.next();
		  assertEquals("1/6/2", date2.toString());
		}catch(IllegalDateException e) {
			assertTrue(false);
		}
		
		year = 1;month = 9;day = 30;
		try {
		  Date date1 = new Date(year, month, day);
		  Date date2 = date1.next();
		  assertEquals("1/10/1", date2.toString());
		}catch(IllegalDateException e) {
			assertTrue(false);
		}
		
		year = 1;month = 9;day = 1;
		try {
		  Date date1 = new Date(year, month, day);
		  Date date2 = date1.next();
		  assertEquals("1/9/2", date2.toString());
		}catch(IllegalDateException e) {
			assertTrue(false);
		}
		
		year = 1;month = 11;day = 30;
		try {
		  Date date1 = new Date(year, month, day);
		  Date date2 = date1.next();
		  assertEquals("1/12/1", date2.toString());
		}catch(IllegalDateException e) {
			assertTrue(false);
		}
		
		year = 1;month = 11;day = 1;
		try {
		  Date date1 = new Date(year, month, day);
		  Date date2 = date1.next();
		  assertEquals("1/11/2", date2.toString());
		}catch(IllegalDateException e) {
			assertTrue(false);
		}
		
		year = 400;month = 2;day = 29;
		try {
		  Date date1 = new Date(year, month, day);
		  Date date2 = date1.next();
		  assertEquals("400/3/1", date2.toString());
		}catch(IllegalDateException e) {
			assertTrue(false);
		}
		
		year = 400;month = 2;day = 1;
		try {
		  Date date1 = new Date(year, month, day);
		  Date date2 = date1.next();
		  assertEquals("400/2/2", date2.toString());
		}catch(IllegalDateException e) {
			assertTrue(false);
		}
		
		year = 4;month = 2;day = 29;
		try {
		  Date date1 = new Date(year, month, day);
		  Date date2 = date1.next();
		  assertEquals("4/3/1", date2.toString());
		}catch(IllegalDateException e) {
			assertTrue(false);
		}
		
		year = 4;month = 2;day = 1;
		try {
		  Date date1 = new Date(year, month, day);
		  Date date2 = date1.next();
		  assertEquals("4/2/2", date2.toString());
		}catch(IllegalDateException e) {
			assertTrue(false);
		}
		
		year = 1;month = 2;day = 28;
		try {
		  Date date1 = new Date(year, month, day);
		  Date date2 = date1.next();
		  assertEquals("1/3/1", date2.toString());
		}catch(IllegalDateException e) {
			assertTrue(false);
		}
		
		year = 1;month = 2;day = 1;
		try {
		  Date date1 = new Date(year, month, day);
		  Date date2 = date1.next();
		  assertEquals("1/2/2", date2.toString());
		}catch(IllegalDateException e) {
			assertTrue(false);
		}
		
		year = 100;month = 2;day = 28;
		try {
		  Date date1 = new Date(year, month, day);
		  Date date2 = date1.next();
		  assertEquals("100/3/1", date2.toString());
		}catch(IllegalDateException e) {
			assertTrue(false);
		}
		
		year = 100;month = 2;day = 1;
		try {
		  Date date1 = new Date(year, month, day);
		  Date date2 = date1.next();
		  assertEquals("100/2/2", date2.toString());
		}catch(IllegalDateException e) {
			assertTrue(false);
		}
	}
	
	@Test
	void testToString() {
		// Test Case: (1, 1, 1)
		int year, month, day;
		year = 1;month = 1;day = 1;
		try {
		  Date date = new Date(year, month, day);
		  assertEquals("1/1/1", date.toString());
		}catch(IllegalDateException e) {
		  assertTrue(false);
		}
	}
}
