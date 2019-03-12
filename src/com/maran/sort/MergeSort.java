package com.maran.sort;

public class MergeSort {

	int[] temp;
	int[] nums = { 8, 87, 46, 28, 01, 99, 38, 72, 84 };

	public static void main(String[] args) {
		MergeSort s = new MergeSort();
		s.temp = new int[s.nums.length];
		showArray(s.nums);
		s.sort(s.nums);
		System.out.println();
		showArray(s.nums);
	}

	private void sort(int[] nums) {
		int low = 0;
		int high = nums.length - 1;
		mergeSort(low, high);
	}

	private void mergeSort(int low, int high) {
		if (low >= high) {
			return;
		}
		int middle = (low + high) / 2;
		mergeSort(low, middle);
		mergeSort(middle + 1, high);
		merge(low, middle, high);
	}

	private void merge(int low, int middle, int high) {
		for (int a = low; a <= high; a++) {
			temp[a] = nums[a];
		}

		int i = low;
		int j = middle + 1;
		int k = low;

		while ((i <= middle) && (j <= high)) {
			if (temp[i] <= temp[j]) {
				nums[k] = temp[i];
				i++;
			} else {
				nums[k] = temp[j];
				j++;
			}
			k++;
		}

		while (i <= middle) {
			nums[k] = temp[i];
			i++;
			k++;
		}
		while (j <= high) {
			nums[k] = temp[j];
			j++;
			k++;
		}
	}

	private static void showArray(int[] nums) {
		for (int i : nums) {
			System.out.print(i + " ");
		}
	}

}
