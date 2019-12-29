package com.yuk.algorithm.searcher;

public class Sorts {
	// arr.length -1 use end value
	public void quickSort(int[] arr, int left, int right) {
		int i = left, j = right, tmp;
		int pivot = arr[(left + right) / 2];
		while (i <= j) {
			while (arr[i] < pivot)
				i++;
			while (arr[j] > pivot)
				j--;
			if (i <= j) {
				tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				i++;
				j--;
			}
		}
		if (left < i - 1)
			quickSort(arr, left, i - 1);
		if (i < right)
			quickSort(arr, i, right);
	}
	
	
	
	

	public void mergeSort(int[] arr, int l, int r) {
		if (l < r) {
			int mid = (l + r) / 2;
			mergeSort(arr, l, mid);
			mergeSort(arr, mid + 1, r);
			int i = l;
			int j = mid + 1;
			int k = l;
			int temp[] = new int[arr.length];
			while (i <= mid && j <= r) {
				if (arr[i] < arr[j]) {
					temp[k++] = arr[i++];
				} else {
					temp[k++] = arr[j++];
				}
			}
			while (i <= mid)
				temp[k++] = arr[i++];
			while (j <= r)
				temp[k++] = arr[j++];
			for (int index = l; index < k; index++)
				arr[index] = temp[index];
		}
	}

	void insertionSort(int[] arr) {
		for (int index = 1; index < arr.length; index++) {
			int temp = arr[index];
			int aux = index - 1;
			while ((aux >= 0) && (arr[aux] > temp)) {
				arr[aux + 1] = arr[aux];
				aux--;
			}
			arr[aux + 1] = temp;
		}
	}
}
