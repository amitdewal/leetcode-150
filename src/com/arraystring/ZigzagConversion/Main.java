/**
 * 
 */
package com.arraystring.ZigzagConversion;

/**
 * 
 */
public class Main {
	public static void main(String[] args) {

		Main main = new Main();
		String s = "PAYPALISHIRING";
		int numRows = 3;
		String result = main.convert(s, numRows);
		System.out.println(result); // Output: "PAHNAPLSIIGYIR"

	}

	public String convert(String s, int numRows) {
		if (numRows == 1 || numRows >= s.length()) {
			return s;
		}
		int row = 0;
		int direction = 1;

		StringBuilder[] rows = new StringBuilder[numRows];

		for (int i = 0; i < rows.length; i++) {
			rows[i] = new StringBuilder();
		}

		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);
			rows[row].append(ch);

			// reverse direc
			if (row == numRows - 1) { // move up
				direction = -1;

			} else if (row == 0) { // move down
				direction = 1;
			}

			row = row + direction;
		}
		StringBuilder result = new StringBuilder();
		for (StringBuilder r : rows) {

			result.append(r);

		}

		return result.toString();

	}

}
