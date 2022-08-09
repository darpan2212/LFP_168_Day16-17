package com.bl.prime.test;

import java.util.Iterator;
import java.util.LinkedList;

import com.bl.prime.Anagram;
import com.bl.prime.PalinDrome;
import com.bl.prime.PrimeNumber;

public class PrimeTest {

	public static LinkedList<Integer> filteredList = new LinkedList<>();

	public static void main(String[] args) {
		PrimeNumber pNum = new PrimeNumber();
		PalinDrome palinDrome = new PalinDrome();

		System.out.println("List of prime numbers in 0-1000");
		for (int i = 2; i <= 1000; i++) {
			if (pNum.isPrime(i)) {
				filteredList.add(i);
			}
		}

		for (int i = 0; i < filteredList.size(); i++) {
			if (!isAnagramExist(filteredList.get(i), i)) {
				filteredList.remove(i);
				i--;
			}
		}

		for (int i = 0; i < filteredList.size(); i++) {
			if (!palinDrome.isPalindrome(filteredList.get(i))) {
				filteredList.remove(i);
				i--;
			}
		}

		for (int i = 0; i < filteredList.size(); i++) {
			System.out.println(filteredList.get(i));
		}
	}

	public static boolean isAnagramExist(int num, int index) {
		Anagram anagram = new Anagram();

		for (int i = 0; i < filteredList.size(); i++) {
			if (i != index) {
				if (anagram.isAnagram(num, filteredList.get(i))) {
					return true;
				}
			}
		}
		return false;
	}
}