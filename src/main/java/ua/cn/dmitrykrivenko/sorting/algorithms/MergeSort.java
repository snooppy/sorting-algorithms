package ua.cn.dmitrykrivenko.sorting.algorithms;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko at gmail.com>
 */
public class MergeSort implements Sort {

	private int[] array;
	private int[] tempMergArr;

	@Override
	public void sort(int array[]) {
		this.array = array;
		this.tempMergArr = new int[array.length];
		mergeSort(0, array.length - 1);
	}

	private void mergeSort(int lowerIndex, int higherIndex) {
		if (lowerIndex < higherIndex) {
			int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
			// Below step sorts the left side of the array
			mergeSort(lowerIndex, middle);
			// Below step sorts the right side of the array
			mergeSort(middle + 1, higherIndex);
			// Now merge both sides
			merge(lowerIndex, middle, higherIndex);
		}
	}

	private void merge(int lowerIndex, int middle, int higherIndex) {
		// Copy both parts into the tempMergArr
		for (int i = lowerIndex; i <= higherIndex; i++) {
			tempMergArr[i] = array[i];
		}
		int i = lowerIndex;
		int j = middle + 1;
		int k = lowerIndex;
		// Copy the smallest values from either the left or the right side back
		// to the original array
		while (i <= middle && j <= higherIndex) {
			if (tempMergArr[i] <= tempMergArr[j]) {
				array[k] = tempMergArr[i];
				i++;
			} else {
				array[k] = tempMergArr[j];
				j++;
			}
			k++;
		}
		// Copy the rest of the left side of the array into the target array
		while (i <= middle) {
			array[k] = tempMergArr[i];
			k++;
			i++;
		}

	}

}
