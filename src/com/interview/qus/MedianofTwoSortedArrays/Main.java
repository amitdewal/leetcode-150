/**
 * 
 */
package com.interview.qus.MedianofTwoSortedArrays;

import java.util.Arrays;

/**
 * 
 */
public class Main {
	public static void main(String[] args) {
		int[] nums1 = { 1, 3 };
		int[] nums2 = { 2 };

		Main m = new Main();
		double median = m.findMedianSortedArrays(nums1, nums2);
		System.out.println("Median: " + median);

	}

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		// first create a array
		int arr[] = new int[nums1.length + nums2.length];

		// fill this big array
		for (int i = 0; i < nums1.length; i++) {
			arr[i] = nums1[i];

		}

		for (int i = 0; i < nums2.length; i++) {
			arr[nums1.length + i] = nums2[i];
		}

		// sort the big array
		Arrays.sort(arr);

		// find median
		int n = arr.length;
		int mid = n / 2;

		if (n % 2 == 1) {// n is odd
			return arr[mid];
		} else {
			return (double) (arr[mid - 1] + arr[mid]) / 2;
		}


	}
}
