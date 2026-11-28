/**
 * 
 */
package com.array.secondLargestElement;

/**
 * Given an array of integers nums, return the second-largest element in the
 * array. If the second-largest element does not exist, return -1.
 * 
 * Example 1: Input: nums = [8, 8, 7, 6, 5]
 * 
 * Output: 7
 * 
 * Explanation:
 * 
 * The largest value in nums is 8, the second largest is 7
 * 
 * Example 2: Input: nums = [10, 10, 10, 10, 10]
 * 
 * Output: -1
 * 
 * Explanation:
 * 
 * The only value in nums is 10, so there is no second largest value, thus -1 is
 * returned
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Main main = new Main();
		int nums[] = { 8, 8, 7, 6, 5 };
		System.out.println(main.secondLargestElement(nums));

		int nums1[] = { 10, 10, 10, 10, 10 };
		System.out.println(main.secondLargestElement(nums1));

	}

	public int secondLargestElement(int[] nums) {

		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] > max) {

				secondMax = max;
				max = nums[i];

			} else if (nums[i] < max && nums[i] > secondMax) {
				secondMax = nums[i];
			}
		}

		return secondMax == Integer.MIN_VALUE ? -1 : secondMax;// means second largest element does not exist so return -1

	}

}
