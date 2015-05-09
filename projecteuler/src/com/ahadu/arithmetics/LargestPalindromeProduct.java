package com.ahadu.arithmetics;

import java.util.ArrayList;

public class LargestPalindromeProduct {

	/**
	 * A palindromic number reads the same both ways. The largest palindrome
	 * made from the product of two 2-digit numbers is 9009 = 91 × 99.
	 * 
	 * Find the largest palindrome made from the product of two 3-digit numbers.
	 * 
	 * @param n
	 * @return
	 */
	public static int findLargestPalindromeProductOf3digitNumbers() {
		ArrayList<Integer> palindromes = new ArrayList<Integer>();
		for (int i = 999; i > 553; i--) {
			for (int j = 554; j > 99; j--) {
				if (isPalindrome(i * j)) {
					System.out.println(i + "*" + j + "=" + i * j);
					if (!palindromes.isEmpty()) {
						sortInsert(palindromes, i*j);
					}
				}
			}
		}
		return 0;
	}

	public static void sortInsert(ArrayList<Integer> array, int a){
		
		if (array.get(array.size() - 1) < a) {
			array.add(a);
		} else {
			sortInsert((ArrayList<Integer>) array.subList(0, array.size()-1), a);
		}
	}
	public static boolean isPalindrome(int n) {
		// convert n to string
		String num = n + "";
		// revert order of digits
		String revertedNum = "";
		for (int i = num.length() - 1; i >= 0; i--) {
			revertedNum += num.charAt(i);
		}

		// convert to int
		int revNum = Integer.valueOf(revertedNum);
		// compare the two
		if (n == revNum) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

	}
}
