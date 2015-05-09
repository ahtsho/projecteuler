package com.ahadu.arithmetics;

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 * @author at
 * Ans: 1179908154
 */
public class TenThOnethFstPrime {

	public static void main(String[] args){
		System.out.println(nthPrime(10001));
	}
	
	public static int nthPrime(int n){
		int nthPrime = 0;
		int i = 2;
		int primes=0;
		while(true){
			if(isPrime(i)){
				primes++;
				if(primes == n){
					nthPrime = i;
					break;
				}
			}
			i++;
		}
		return nthPrime;
	}

	public static boolean isPrime(int n) {
		for(int i =2; i < n; i++ ){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
}
