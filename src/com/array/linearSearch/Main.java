/**
 * 
 */
package com.array.linearSearch;

/**
 * Given an array of integers nums and an integer target, find the smallest
 * index (0 based indexing) where the target appears in the array. If the target
 * is not found in the array, return -1
 * 
 * Example 1: Input: nums = [2, 3, 4, 5, 3], target = 3
 * 
 * Output: 1
 * 
 * Explanation:
 * 
 * The first occurence of 3 in nums is at index 1
 * 
 * Example 2: Input: nums = [2, -4, 4, 0, 10], target = 6
 * 
 * Output: -1
 * 
 * Explanation:
 * 
 * The value 6 does not occur in the array, hence output is -1
 */
public class Main {
	public static void main(String[] args) {
		
		Main main = new Main();
		int nums[] = { 2, 3, 4, 5, 3 };
		int target = 3;
		System.out.println(main.linearSearch(nums, target));

		int nums1[] = { 2, -4, 4, 0, 10 };
		int target1 = 6;
		System.out.println(main.linearSearch(nums1, target1));

	}

	public int linearSearch(int nums[], int target) {

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] == target) {
				return i;
			}
		}

		return -1;// not found index so return -1
	}

}
