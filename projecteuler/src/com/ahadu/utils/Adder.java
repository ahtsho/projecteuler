package com.ahadu.utils;

import java.util.ArrayList;

public class Adder {

	public static int sumSequence(ArrayList<Integer> nums) {
		int sum = 0;
		for (int i = 0; i < nums.size(); i++) {
			sum+=nums.get(i);
		}
		return sum;
	}

}
