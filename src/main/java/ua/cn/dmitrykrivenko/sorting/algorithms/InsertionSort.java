package ua.cn.dmitrykrivenko.sorting.algorithms;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko at gmail.com>
 */
public class InsertionSort implements Sort {

	@Override
	public void sort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int value = array[i];
			int j;
			for (j = i - 1; j >= 0 && array[j] > value; j--) {
				array[j + 1] = array[j];
			}
			array[j + 1] = value;
		}
	}

}
