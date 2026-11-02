/**
 * 
 */
package com.twoPointer.TwoSumIIInputArrayIsSorted;

/**
 * 
 */
public class Main {
	public static void main(String[] args) {

		Main main = new Main();
		int[] numbers = { 2, 7, 11, 15 };
		int target = 9;
		int[] result = main.twoSum(numbers, target);
		System.out.println("[" + result[0] + ", " + result[1] + "]");

	}

	public int[] twoSum(int[] numbers, int target) {
		int left = 0;
		int right = numbers.length - 1;

		while (left < right) {

			int sum = numbers[left] + numbers[right];

			if (sum == target) {
				return new int[] { left + 1, right + 1 };
			} else if (sum > target) {
				right--;
			} else {
				left++;
			}

		}

		return new int[] { -1, -1 };

	}
}
