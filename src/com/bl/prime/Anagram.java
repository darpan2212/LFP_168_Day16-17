package com.bl.prime;

import java.util.Arrays;

public class Anagram {

	public boolean isAnagram(int num1, int num2) {
		
		String num1Str = String.valueOf(num1);
		String num2Str = String.valueOf(num2);

		if(num1Str.length() != num2Str.length()) {
			return false;
		}
		char[] num1Arr = num1Str.toCharArray();
		char[] num2Arr = num2Str.toCharArray();
		
		Arrays.sort(num1Arr);
		Arrays.sort(num2Arr);

		for (int i = 0; i < num1Arr.length; i++) {
			if (num1Arr[i] != num2Arr[i]) {
				return false;
			}
		}
		return true;
	}
	
}