package ua.cn.dmitrykrivenko.sorting.algorithms;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko at gmail.com>
 */
public class SelectionSort implements Sort {

	@Override
	public void sort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[min]) {
					min = j;
				}
			}

			int tmp = array[min];
			array[min] = array[i];
			array[i] = tmp;
		}
	}

}
