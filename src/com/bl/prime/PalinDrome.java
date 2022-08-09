package com.bl.prime;

public class PalinDrome {

	public boolean isPalindrome(int num) {
		int temp = num;
		int rev = 0;
		while (temp != 0) {
			rev = rev * 10;
			int rem = temp % 10;
			temp = temp / 10;
			rev = rev + rem;
		}

		if (num == rev) {
			return true;
		} else {
			return false;
		}
	}

}