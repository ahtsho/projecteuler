package com.ahadu.utils;

import java.util.ArrayList;

public class Printer {

	public static void printCharNt(){
		
	}

	public static void printIntArray(int[] nums) {
		System.out.print("[ ");
		for (int i = 0; i < nums.length-1; i++) {
			System.out.print(nums[i]+", ");
		}
		System.out.println(nums[nums.length-1]+"]");
		
	}

	public static void printArrayList(ArrayList array) {
		System.out.print("[ ");
		for (int i = 0; i < array.size()-1; i++) {
			System.out.print(array.get(i)+", ");
		}
		System.out.println(array.get(array.size()-1)+"]");
	}
}
