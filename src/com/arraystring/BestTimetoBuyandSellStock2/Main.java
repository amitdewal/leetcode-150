/**
 * 
 */
package com.arraystring.BestTimetoBuyandSellStock2;

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
		int profit = 0;

		for (int i = 1; i < prices.length; i++) {

			if (prices[i] > prices[i - 1]) { // today_price > yesterday_price

				profit = profit + (prices[i] - prices[i - 1]);

			}
		}
		return profit;

	}
}
