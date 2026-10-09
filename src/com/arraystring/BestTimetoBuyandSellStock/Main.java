/**
 * 
 */
package com.arraystring.BestTimetoBuyandSellStock;

import java.util.Iterator;

/**
 * 
 */
public class Main {

	public static void main(String[] args) {
		int[] prices = { 7, 1, 5, 3, 6, 4 };
		
		System.out.println(maxProfit(prices));

	}

	public static int maxProfit(int[] prices) {

		int lowest = prices[0];
		int best = 0;

		for (int i = 1; i < prices.length; i++) {

			if (prices[i] < lowest) {
				lowest = prices[i];
			} else {
				int profit = prices[i] - lowest;
				if (profit > best) {
					best = profit;
				}
			}

		}
		return best;

	}
}
