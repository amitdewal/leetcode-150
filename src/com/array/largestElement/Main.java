/**
 * 
 */
package com.array.largestElement;

/**
 * Given an array of integers nums, return the value of the largest element in
 * the array
 * 
 * Example 1: Input: nums = [3, 3, 6, 1]
 * 
 * Output: 6
 * 
 * Explanation: The largest element in array is 6
 * 
 * Example 2: Input: nums = [3, 3, 0, 99, -40]
 * 
 * Output: 99
 * 
 * Explanation: The largest element in array is 99
 */
public class Main {

	public static void main(String[] args) {
		
		Main main = new Main();
		int nums[] = { 3, 3, 6, 1 };
		System.out.println(main.largestElement(nums));

		int nums1[] = { 3, 3, 0, 99, -40 };
		System.out.println(main.largestElement(nums1));

	}

	public int largestElement(int[] nums) {

		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < nums.length; i++) {
			
			if (nums[i]> max) {
				max = nums[i]; // update the new max value
			}
		}
		
		return max;

	}

}
