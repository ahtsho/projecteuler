package com.ahadu.arithmetics;

import java.util.ArrayList;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
 * The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * @author at
 */
public class MultiplesOf3and5 {

	public static ArrayList<Integer> multiplesOf3Below(int i){
		ArrayList<Integer> multiplesOf3 = new ArrayList<Integer>();
		for (int j = 3; j < i; j++){
			if(j%3==0){
				multiplesOf3.add(j);
			}
		}
		return multiplesOf3; 
	}
	
	public static ArrayList<Integer> multiplesOf5Below(int i){
		ArrayList<Integer> multiplesOf5 = new ArrayList<Integer>();
		for (int j = 5; j < i; j++){
			if(j%5==0){
				multiplesOf5.add(j);
			}
		}
		return multiplesOf5; 
	}
	
	public static ArrayList<Integer> multiplesOf3Or5Below(int i){
		ArrayList<Integer> multiples = new ArrayList<Integer>();
		for (int j = 3; j < i; j++){
			if(j%5==0 || j%3==0){
				multiples.add(j);
			}
		}
		return multiples; 
	}
	
	
	public static int sumArrayOfNumbers (ArrayList<Integer> nums){
		int sum = 0;
		for(int i: nums){
			sum +=i;
		}
		return sum;
	}
	
	public static void main (String[] args){
		System.out.println(sumArrayOfNumbers(multiplesOf3Or5Below(1000)));
	}
}
