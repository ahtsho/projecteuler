package com.ahadu.arithmetics;

public class SmallestMultiple {
	/**
	 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
	 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
	 */

	
	public static void main(String[] args){
		System.out.println(multipleOfNumbersUpTo(20));
	}

	private static int multipleOfNumbersUpTo(int n) {
		int m = n;
		for(int i = 1; i< n; i++){
			if(m%i!=0){
				m++;
				i=1;
			}
		}
		return m;
	}
}
