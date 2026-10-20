/**
 * 
 */
package com.arraystring.H_Index;

/**
 * 
 */
public class Main {
	public static void main(String[] args) {

		int[] citations = { 3, 0, 6, 1, 5 };
		int hIndex = hIndex(citations);
		System.out.println(hIndex);

	}

	public static int hIndex(int[] citations) {
		int maxH = 0;

		for (int h = 1; h <= citations.length; h++) {

			int count = 0;

			for (int j = 0; j < citations.length; j++) {

				if (citations[j] >= h) {
					count++;
				}
			}

			if (count >= h) {
				maxH = h;
			}
		}
		return maxH;

	}
}
