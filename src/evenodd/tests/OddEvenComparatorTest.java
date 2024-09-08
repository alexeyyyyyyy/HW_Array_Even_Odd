package evenodd.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import evenodd.utils.OddEvenComparator;

class OddEvenComparatorTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testCompare() {
		Integer[] origin = {1,2,3,4,5,6,7,8,9,3};
		Integer[] expected = {2,4,6,8,9,7,5,3,3,1};
		
		Arrays.sort(origin, new OddEvenComparator());
		
		assertArrayEquals(expected, origin);
	}

}
