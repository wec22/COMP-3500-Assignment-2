import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FinderTest {

	@Test
	public void test_findMax_valid() {
		int[] array = {7,2,9,4,6,1};
		int expected = 9;
		int result = Finder.findMax(array);
		assertEquals(result, expected);
	}

	@Test
	public void test_findMax_null() {
		Integer expected = null;
		Integer actual = Finder.findMax(null);
		assertEquals(expected, actual);
	}

	@Test
	public void test_findMax_empty() {
		int[] array = {};
		Integer expected = null;
		Integer actual = Finder.findMax(array);
		assertEquals(expected, actual);
	}

	@Test
	public void test_findMin_valid() {
		int[] array = {7,2,9,4,6,1};
		int expected = 1;
		int result = Finder.findMin(array);
		assertEquals(result, expected);
	}

	@Test
	public void test_findMin_null() {
		Integer expected = null;
		Integer actual = Finder.findMin(null);
		assertEquals(expected, actual);
	}

	@Test
	public void test_findMin_empty() {
		int[] array = {};
		Integer expected = null;
		Integer actual = Finder.findMin(array);
		assertEquals(expected, actual);
	}

}
