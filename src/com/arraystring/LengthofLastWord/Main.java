/**
 * 
 */
package com.arraystring.LengthofLastWord;

/**
 * 
 */
public class Main {

	public static void main(String[] args) {
		System.out.println(lengthOfLastWord("Hello World"));
	}

	public static int lengthOfLastWord(String s) {
		int index = s.length() - 1;
		int lengthOfLastWord = 0;

		while (index >= 0 && s.charAt(index) == ' ') {
			index--;

		}
		// count word character

		while (index >= 0 && s.charAt(index) != ' ') {
			index--;
			lengthOfLastWord++;
		}
		return lengthOfLastWord;

	}

}
