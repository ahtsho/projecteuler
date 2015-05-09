package com.ahadu.arithmetics;

import java.util.ArrayList;

import javax.print.attribute.standard.Sides;

public class LargestPrimeFactor {

	/**
	 * The prime factors of 13195 are 5, 7, 13 and 29. What is the largest prime
	 * factor of the number 600.851.475.143 ?
	 */
	
	public static void main (String[] args){
		System.out.println(calculateLargestPrimeFactorOf(600851475143.0));
	}
	public static double calculateLargestPrimeFactorOf(double n) {

		ArrayList<Double> factors = findPrimeDivisors(n);
		return factors.get(factors.size()-1);

	}

	public static ArrayList<Double> findDivisors(double n) {
		ArrayList<Double> factors = new ArrayList<Double>();

		for (double i = 1; i <= n / factors.get(factors.size()-1); i++) {
			if (n % i == 0) {
				factors.add(i);
			}
		}
		return factors;
	}

	public static ArrayList<Double> findPrimeDivisors(double n) {
		ArrayList<Double> factors = new ArrayList<Double>();
		factors.add((double) 1);
		for (double i = 2; i <= n / factors.get(factors.size()-1); i++) {
			if (n % i == 0 && isPrime(i)) {
				factors.add(i);
			}
		}
		return factors;
	}

	public static boolean isPrime(double n) {
		for (double i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
