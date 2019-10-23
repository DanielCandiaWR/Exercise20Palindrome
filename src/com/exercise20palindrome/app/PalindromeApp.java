package com.exercise20palindrome.app;
import com.exercise20palindrome.model.*;
public class PalindromeApp {
	public static void main(String[] args) {
		String cadPalindrome1 = "Anita, lava * la tina.";
		String cadPalindrome2 = "Somos o no, somos!%!";
		StringApplications.isPalindrome(cadPalindrome1);
		StringApplications.isPalindrome(cadPalindrome2);
		
		System.out.println(StringApplications.isPalindromeStack(cadPalindrome1));
		System.out.println(StringApplications.isPalindromeStack(cadPalindrome2));
	}
}
