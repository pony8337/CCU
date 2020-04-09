import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InterpolationSearcherTest {

	@Test
	void testSearch() {
		InterpolationSearcher searchNum = new InterpolationSearcher();
		int[] testCase1 = {1};
		int toFind1 = 1;
		assertEquals(0, searchNum.search(testCase1, toFind1));
		int[] testCase2 = {1, 2, 3};
		int toFind2 = 0;
		assertEquals(-1, searchNum.search(testCase2, toFind2));
		int[] testCase3 = {1, 2, 3};
		int toFind3 = 4;
		assertEquals(-1, searchNum.search(testCase3, toFind3));
		int[] testCase4 = {1, 2, 3};
		int toFind4 = 2;
		assertEquals(1, searchNum.search(testCase4, toFind4));
		int[] testCase5 = {1, 2, 3};
		int toFind5 = 1;
		assertEquals(0, searchNum.search(testCase5, toFind5));
		int[] testCase6 = {1, 2, 3};
		int toFind6 = 3;
		assertEquals(2, searchNum.search(testCase6, toFind6));
		int[] testCase7 = {1, 3, 6, 9};
		int toFind7 = 7;
		assertEquals(-1, searchNum.search(testCase7, toFind7));
		int[] testCase8 = {-5, -1, 0, 1};
		int toFind8 = -3;
		assertEquals(-1, searchNum.search(testCase8, toFind8));
		int[] testCase9 = {1, 3, 6, 9};
		int toFind9 = 6;
		assertEquals(2, searchNum.search(testCase9, toFind9));
		int[] testCase10 = {-5, -1, 0, 1};
		int toFind10 = -1;
		assertEquals(1, searchNum.search(testCase10, toFind10));
		int[] testCase11 = {-5, -1, 0, 0, 0, 1};
		int toFind11 = -1;
		assertEquals(1, searchNum.search(testCase11, toFind11));
		int[] testCase12 = {1, 6, 9, 10, 25};
		int toFind12 = 10;
		assertEquals(3, searchNum.search(testCase12, toFind12));
	}

}
