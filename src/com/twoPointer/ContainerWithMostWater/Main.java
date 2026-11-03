/**
 * 
 */
package com.twoPointer.ContainerWithMostWater;

/**
 * 
 */
public class Main {

	public static void main(String[] args) {

		Main main = new Main();
		int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		int result = main.maxArea(height);
		System.out.println(result);

	}

	public int maxArea(int[] height) {

		int left = 0;
		int right = height.length - 1;

		int maxArea = 0;

		while (left < right) {

			int width = right - left;

			int minHeight = Math.min(height[right], height[left]);

			int currentArea = width * minHeight;

			maxArea = Math.max(maxArea, currentArea);

			if (height[left] < height[right]) {

				left++;
			} else {
				right--;
			}

		}

		return maxArea;

	}

}
