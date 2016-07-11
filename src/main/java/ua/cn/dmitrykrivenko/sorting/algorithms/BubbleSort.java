package ua.cn.dmitrykrivenko.sorting.algorithms;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko at gmail.com>
 */
public class BubbleSort implements Sort {

	@Override
	public void sort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 1; j < array.length - i; j++) {
				if (array[j - 1] > array[j]) {
					int tmp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = tmp;
				}
			}
		}
	}

}
