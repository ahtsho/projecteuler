package com.ahadu.arithmetics;

import java.util.ArrayList;

import com.ahadu.utils.Adder;
import com.ahadu.utils.Printer;

public class EvenFibonacciNumbers {

	/**
	 * By considering the terms in the Fibonacci sequence whose values do not
	 * exceed four million, find the sum of the even-valued terms.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// get sequence in fibonacci sequence up to 4.000.000
		// felter only even
		// sum sequence
		System.out.println(Adder.sumSequence(filerEvenFibonacci(getFibonacciUpTo(4000000))));
		
	}

	private static ArrayList<Integer> filerEvenFibonacci(ArrayList<Integer> fibs) {
		int current = 0;
		while (current < fibs.size()) {
			if (fibs.get(current) % 2 == 1) {
				fibs.remove(current);
			} else {
				current++;
			}
		}
		return fibs;
	}

	private static ArrayList<Integer> getFibonacciUpTo(int n) {
		ArrayList<Integer> fibN = new ArrayList<Integer>();
		fibN.add(1); // The first two terms of Fibonacci are 1, 1
		fibN.add(1);
		int current = 1;
		// until what is going to be added as next term of the sequence is
		// less than the given number, keep on adding terms
		while (fibN.get(current - 1) + fibN.get(current) < n) {
			fibN.add(fibN.get(current - 1) + fibN.get(current));
			current++;
		}
		return fibN;
	}

	public static int calculateSumOfEvenTermsOfBoundFibonacciSequence(int bound) {
		// get Fibonacci Sequence up to a bound
		// get only even valued terms
		// sum them up
		return sumOfSequence(getEvenTermsOfSeqeunce(getFibonacciSequenceWithLastValueN(bound)));
	}

	public static int sumOfSequence(int[] sequence) {
		int sum = 0;
		for (int i = 0; i < sequence.length; i++) {
			sum += sequence[i];
		}
		return sum;
	}

	public static int[] getEvenTermsOfSeqeunce(int[] sequence) {
		int[] evens = new int[sequence.length / 2 + 1];
		int e = 0;
		for (int i = 0; i < sequence.length; i++) {
			if (sequence[i] % 2 == 0 && sequence[i] != 0) {
				evens[e] = sequence[i];
				e++;
			}
		}
		return evens;
	}

	public static int[] getFibonacciSequenceWithLastValueN(int num) {
		int[] boundFibonacciSequence = new int[(int) Math.log(num) + num];
		boundFibonacciSequence[0] = 1;

		int lastFibonacci = 1;
		if (num == 1) {
			return boundFibonacciSequence;
		} else if (num == 2) {
			boundFibonacciSequence[1] = 2;
			return boundFibonacciSequence;
		} else {
			boundFibonacciSequence[1] = 2;
			for (int i = 3; i <= (lastFibonacci = nThfibonacci(i)); i++) {
				if (lastFibonacci < num) {
					boundFibonacciSequence[i - 1] = lastFibonacci;
				} else {
					break;
				}
			}

			return boundFibonacciSequence;
		}
	}

	public static int fibonacciRec(int i) {
		if (i == 1) {
			return 1;
		} else if (i == 2) {
			return 2;
		} else {
			return i - 1 + fibonacciRec(i - 2);
		}
	}

	public static int nThfibonacci(int n) {
		int fibPrev = 2;
		int fibPrevPrev = 1;
		int fib = 1;

		if (n == 1) {
			return 1;
		} else if (n == 2) {
			return 2;
		} else {
			for (int i = 3; i <= n; i++) {
				fib = fibPrev + fibPrevPrev;
				fibPrevPrev = fibPrev;
				fibPrev = fib;
			}
			return fib;
		}

	}
}
