package ua.cn.dmitrykrivenko.sorting.algorithms;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko at gmail.com>
 */
public class InsertionSortTest {
	
	@Test
	public void shourdSortUnsortedArray() {
		Sort insertionSort = new InsertionSort();

		int[] array = new int[]{5, 1, 3, 7, 2, 9, 8, 4, 0, 6};
		int[] expected = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

		insertionSort.sort(array);

		Assert.assertArrayEquals(expected, array);
	}

}
