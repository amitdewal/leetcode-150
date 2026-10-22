/**
 * 
 */
package com.arraystring.Candy;

import java.util.Arrays;

/**
 * 
 */
public class Main {

	public int candy(int[] ratings) {

		// ratings = [1,0,2]
		int ans = 0;
		int n = ratings.length;
		int left[] = new int[n];

		int[] right = new int[n];

		Arrays.fill(left, 1);
		Arrays.fill(right, 1);

		for (int i = 1; i < n; i++) {
			if (ratings[i] > ratings[i - 1]) {
				left[i] = left[i - 1] + 1;
			}
		}
		for (int j = n - 2; j >= 0; j--) {
			if (ratings[j] > ratings[j + 1]) {
				right[j] = right[j + 1] + 1;

			}
		}

		for (int k = 0; k < n; k++) {
			ans = ans + Math.max(left[k], right[k]);
		}

		return ans;

	}
}
