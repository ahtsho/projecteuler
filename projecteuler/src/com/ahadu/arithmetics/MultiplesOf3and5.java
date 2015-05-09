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
	
	public static ArrayList<Integer> mergeArrayOfNumbers(ArrayList<Integer> nums1,ArrayList<Integer> nums2){
		ArrayList<Integer> nums = new ArrayList<Integer>();
		for (int i = 0; i < nums1.size(); i++){
			nums.add(nums1.get(i));
		}
		for (int j = 0; j < nums2.size(); j++){
			for (int i = 0; i < nums.size(); i++){
				if(nums2.get(j)==nums.get(i)){
					break;
				}
				nums.add(nums2.get(j));
			}
		}
		
		return nums;
	}
	
	public static int sumArrayOfNumbers (ArrayList<Integer> nums){
		int sum = 0;
		for(int i: nums){
			sum +=i;
		}
		return sum;
	}
	
	public static void main (String[] args){
		ArrayList<Integer> multipOf3 = multiplesOf3Below(10);
		ArrayList<Integer> multipOf5 = multiplesOf5Below(10);
		ArrayList<Integer> multipOf3Or5 = mergeArrayOfNumbers(multipOf3, multipOf5);
		int sum = sumArrayOfNumbers(multipOf3Or5);
		System.out.println(sum);
	}
}
