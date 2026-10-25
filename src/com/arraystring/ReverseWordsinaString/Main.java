/**
 * 
 */
package com.arraystring.ReverseWordsinaString;

import java.util.Arrays;

/**
 * 
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("123");
		String s = "the sky is blue";

		Main main = new Main();

		String result = main.reverseWords(s);

		System.out.println(result);

	}

	public String reverseWords(String s) {

		String[] arr = s.trim().split("\\s+");
		StringBuilder sb = new StringBuilder();
		for (int i = arr.length - 1; i >= 0; i--) {

			sb.append(arr[i]).append(" ");

		}
		return sb.toString().trim();

	}

}
