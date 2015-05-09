package com.ahadu.arithmetics;

/**
 * The sum of the squares of the first ten natural numbers is,
 * 1^2 + 2^2 + ... + 10^2 = 385
 * 
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)^2 = 552 = 3025
 * 
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 
 * 3025 − 385 = 2640.
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 * @author at
 *
 */
public class SumSquareDifference {
	public static void main(String[] args){
		int sqS = sumSquaresFirstNNumbers(100);
		int sSq = squareSumFirstNNumbers(100);
		System.out.println(sqS);
		System.out.println(sSq);
		System.out.println(sSq-sqS);
	}
	
	public static int sumSquaresFirstNNumbers(int n){
		int sumOfSquares = 0;
		for(int i =1;i<= n;i++){
			sumOfSquares += Math.pow(i, 2);
		}
		return sumOfSquares ;
	}
	
	public static int squareSumFirstNNumbers(int n){
		int sum = 0;
		for(int i =1;i<= n;i++){
			sum += i;
		}
		return (int) Math.pow(sum, 2);
	}
	
	
}
