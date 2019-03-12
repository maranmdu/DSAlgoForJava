package com.maran.sort;

/*
 * Bubble sort, Selection Sort, Insertion Sort
 */
public class SortingAlgo {

	public static void main(String[] args) {
		int[] arr = { 6, 34, 45, 2, 5, 8, 92 };
		showArray(arr);
		insertionSort(arr);
		System.out.println();
		showArray(arr);
	}

	public static void bubbleSort(int[] nums) {
		int len = nums.length;
		for (int i = 0; i < len - 1; i++) {
			for (int j = 0; j < len - 1 - i; j++) {
				if (nums[j] > nums[j + 1]) {
					swap(nums, j, j + 1);
				}
			}
		}
	}

	public static void selectionSort(int[] nums) {
		int len = nums.length;
		for (int i = 0; i < len - 1; i++) {
			int index = i;
			for (int j = i + 1; j < len; j++) {
				if (nums[j] < nums[index]) {
					index = j;
				}
			}
			if (i != index) {
				swap(nums, i, index);
			}
		}
	}

	public static void insertionSort(int[] nums) {
		int len = nums.length;
		for (int i = 1; i < len; ++i) {
			int j = i;
			while ((j > 0) && (nums[j - 1] > nums[j])) {
				swap(nums, j, j - 1);
				--j;
			}
		}
	}

	private static void showArray(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}

	private static void swap(int[] nums, int a, int b) {
		int t = nums[a];
		nums[a] = nums[b];
		nums[b] = t;
	}
}
