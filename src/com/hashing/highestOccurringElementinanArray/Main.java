/**
 * 
 */
package com.hashing.highestOccurringElementinanArray;

import java.util.HashMap;
import java.util.Map;

/**
 * Example 1: Input: nums = [1, 2, 2, 3, 3, 3]
 * 
 * Output: 3
 * 
 * Explanation: The number 3 appears the most (3 times). It is the most frequent
 * element.
 * 
 * Example 2: Input: nums = [4, 4, 5, 5, 6]
 * 
 * Output: 4
 * 
 * Explanation: Both 4 and 5 appear twice, but 4 is smaller. So, 4 is the most
 * frequent element.
 */
public class Main {

	public static void main(String[] args) {
		
		Main main = new Main();
		int[] nums = { 1, 2, 2, 3, 3, 3 };
		int result = main.mostFrequentElement(nums);
		System.out.println(result); // Output: 3

		int[] nums2 = { 4, 4, 5, 5, 6 };
		int result2 = main.mostFrequentElement(nums2);
		System.out.println(result2); // Output: 4

	}

	public int mostFrequentElement(int[] nums) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();// frequency map creation

		// key as number value as frequency

		for (int i = 0; i < nums.length; i++) {

			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

		}

		int maxFrequency = 0;
		int answer = Integer.MAX_VALUE;

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

			Integer number = entry.getKey();
			Integer frequency = entry.getValue();

			if (frequency > maxFrequency) {
				maxFrequency = frequency;
				answer = number;
			} else if (frequency == maxFrequency && number < answer) {// here we are checking if the frequency is same then we will take the smaller number
				answer = number;
			}

		}

		return answer;

	}

}
