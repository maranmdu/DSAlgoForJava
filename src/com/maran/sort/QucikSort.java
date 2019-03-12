package com.maran.sort;

public class QucikSort {

	public static void main(String[] args) {
		int[] nums = { 2, 6, 99, 55, 33, 92, 18, 38, 4 };
		showArray(nums);
		sort(nums);
		System.out.println();
		showArray(nums);

	}

	private static void sort(int[] nums) {
		int n = nums.length;
		quickSort(nums, 0, n - 1);
	}

	private static void quickSort(int[] nums, int low, int high) {
		if (low >= high)
			return;

		int pivot = partition(nums, low, high);
		quickSort(nums, low, pivot - 1);
		quickSort(nums, pivot + 1, high);
	}

	private static int partition(int[] nums, int low, int high) {
		int pivot = (low + high) / 2;
		int i = low;

		swap(nums, pivot, high);
		for (int j = low; j < high; j++) {
			if (nums[j] <= nums[high]) {
				swap(nums, i, j);
				i++;
			}
		}
		swap(nums, i, high);
		return i;
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
