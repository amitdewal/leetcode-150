/**
 * 
 */
package com.arraystring.RemoveDuplicatesfromSortedArray;

/**
 * 
 */
public class Main {

	public static void main(String[] args) {

		// int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		int[] nums = { 1,1,1,2,2,3};
		int result = removeDuplicates(nums);
		System.out.println(result);

	}

	public static int removeDuplicates(int[] nums) {

		int left = 1;// to keep the unique values;
    // left and right pointer start from 1 because in on-decresing array first element is always unique;
		for (int right = 1; right < nums.length; right++) {

			if (nums[right] != nums[right - 1]) {// compare with previous element 

				nums[left] = nums[right];
				left += 1;// increment;
			}

		}
		return left;

	}

}
