/**
 * 
 */
package com.hashing.secondHighestOccurringElement;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of n integers, find the second most frequent element in it.
 * 
 * If there are multiple elements that appear second most frequent times, find
 * the smallest of them.
 * 
 * If second most frequent element does not exist return -1.
 * 
 * Example 1: Input: arr = [1, 2, 2, 3, 3, 3]
 * 
 * Output: 2
 * 
 * Explanation:
 * 
 * The number 2 appears the second most (2 times) and number 3 appears the
 * most(3 times).
 * 
 * Example 2: Input: arr = [4, 4, 5, 5, 6, 7]
 * 
 * Output: 6
 * 
 * Explanation:
 * 
 * Both 6 and 7 appear second most times, but 6 is smaller.
 */
public class Main {

	public static void main(String[] args) {
		
		int[] nums = { 1, 2, 2, 3, 3, 3, 4, 4, 4, 4 };

		Main main = new Main();
		int result = main.secondMostFrequentElement(nums);
		System.out.println("Second most frequent element: " + result);

	}

	public int secondMostFrequentElement(int[] nums) {
		// frequency map creation

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}

		int maxFrequency = 0;
		int secondFrequency = 0;
		int maxFrequentNumber = -1;
		int secondMostFrequentNumber = -1;

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

			Integer frequency = entry.getKey();
			Integer number = entry.getValue();

			if (frequency > maxFrequency) {
				secondFrequency = maxFrequency;
				secondMostFrequentNumber = maxFrequentNumber;

				maxFrequency = frequency;
				maxFrequentNumber = number;
			} else if (frequency > secondFrequency && frequency < maxFrequency) {
				secondFrequency = frequency;
				secondMostFrequentNumber = number;

			} else if (frequency == secondFrequency && number < secondFrequency) {
				secondFrequency = number;

			}

		}

		return secondMostFrequentNumber;

	}
}
