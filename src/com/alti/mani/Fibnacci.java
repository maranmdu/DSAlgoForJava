package com.alti.mani;

public class Fibnacci {

	public static void main(String[] args) {
		/*int[] b = fib(34);
		for (int i : b) {
			System.out.println(i);
		}*/

		for (int i = 0; i < 25; i++)
			System.out.println(fibRec(i));

	}

	public static int[] fib(int n) {
		int[] a = new int[n];
		a[0] = 0;
		a[1] = 1;
		for (int i = 2; i < n; i++) {
			a[i] = a[i - 1] + a[i - 2];
		}
		return a;
	}

	public static int fibRec(int n) {
		if (n <= 1)
			return n;
		return fibRec(n - 1) + fibRec(n - 2);
	}

}
