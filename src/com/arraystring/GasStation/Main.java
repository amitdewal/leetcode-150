/**
 * 
 */
package com.arraystring.GasStation;

import java.util.Arrays;

/**
 * 
 */
public class Main {

	public static void main(String[] args) {
		int[] gas = { 1, 2, 3, 4, 5 };
		int[] cost = { 3, 4, 5, 1, 2 };
		
		int canCompleteCircuit = canCompleteCircuit(gas,cost);
		System.out.println(canCompleteCircuit);
	}

	public static int canCompleteCircuit(int[] gas, int[] cost) {
		int totalGas = 0;
		int currentTank = 0;
		int start = 0;

		for (int i = 0; i < gas.length; i++) {
			int netGas = gas[i] - cost[i];

			totalGas = totalGas + netGas;
			currentTank = currentTank + netGas;

			if (currentTank < 0) {
				currentTank = 0;
				start = i + 1;
			}

		}

		if (totalGas < 0) {
			return -1;
		}

		return start;

	}
}
