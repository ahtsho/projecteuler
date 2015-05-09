package com.ahadu.arithmetics;
/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 * @author at
 */

public class SummationOfPrimes {
	public static void main(String[] args){
		System.out.println(sumPrimesBelow(2000000));
	}
	
	public static int sumPrimesBelow(int n){
		int sum = 0;
		for(int i = n; i > 1; i--){
//			System.out.println("prime "+i+" "+TenThOnethFstPrime.isPrime(i));
			if(TenThOnethFstPrime.isPrime(i)){
				sum +=i;
			}
		}
		return sum;
	}
}
