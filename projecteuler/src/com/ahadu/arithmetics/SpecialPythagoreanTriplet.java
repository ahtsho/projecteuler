package com.ahadu.arithmetics;

import java.util.ArrayList;

/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for
 * which, a^2 + b^2 = c^2
 * 
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 * 
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000. Find
 * the product abc.
 * 
 * @author at
 * 
 */
public class SpecialPythagoreanTriplet {

	public static void main(String[] args) {
		// generate pythagorean triplets a,b,c
		ArrayList<Integer> triplet = findPythagoreanTripletWithSum(
				generatePythagoreanTripletsUpTo(500), 1000);
		int product = 1;
		if (triplet != null) {
			for (int j = 0; j < triplet.size(); j++) {
				// System.out.print(triplet.get(j));
				// System.out.print("+");
				product *= triplet.get(j);
			}
		}
		System.out.println(product);
	}

	public static ArrayList<Integer> findPythagoreanTripletWithSum(
			ArrayList<ArrayList<Integer>> triplets, int n) {
		for (int i = 0; i < triplets.size(); i++) {
			ArrayList<Integer> triplet = triplets.get(i);
			int sum = 0;
			for (int j = 0; j < triplet.size(); j++) {
				// System.out.print(triplet.get(j));
				// System.out.print("+");
				sum += triplet.get(j);
			}
			// System.out.println("=" + sum);
			if (sum == n) {
				System.out.println(triplet);
				System.out.println("=" + sum);
				return triplet;
			}
		}
		return null;
	}

	public static ArrayList<ArrayList<Integer>> generatePythagoreanTripletsUpTo(
			int n) {
		ArrayList<ArrayList<Integer>> triplets = new ArrayList<ArrayList<Integer>>();
		for (int a = 1; a < n - 1; a++) {
			for (int b = a + 1; b < n; b++) {// a < b < n
				int asq = (int) Math.pow(a, 2);
				int bsq = (int) Math.pow(b, 2);
				int csq = asq + bsq;
				if ((int) Math.sqrt(csq) == Math.sqrt(csq)) {
					ArrayList<Integer> triplet = new ArrayList<Integer>();
					triplet.add(a);
					triplet.add(b);
					triplet.add((int) Math.sqrt(csq));
					triplets.add(triplet);
					// System.out.print(triplet);
					// System.out.println("->"+asq+"+"+bsq+"="+csq);
				}
			}
		}
		return triplets;
	}

}
