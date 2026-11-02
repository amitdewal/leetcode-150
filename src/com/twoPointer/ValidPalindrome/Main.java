package com.twoPointer.ValidPalindrome;

public class Main {

	public static void main(String[] args) {

		Main main = new Main();
		String s = "A man, a plan, a canal: Panama";
		System.out.println(main.isPalindrome(s));

	}

	public boolean isPalindrome(String s) {

		int left = 0;
		int right = s.length() - 1;

		while (left < right) {

			if (!Character.isLetterOrDigit(s.charAt(left))) {
				left++;
				continue;

			}

			if (!Character.isLetterOrDigit(s.charAt(right))) {
				right--;
				continue;

			}

			if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {

				return false;

			}
			left++;
			right--;
		}

		return true;

	}

}
