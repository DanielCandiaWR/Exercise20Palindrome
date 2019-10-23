package com.exercise20palindrome.app;
import com.exercise20palindrome.model.*;
public class PalindromeApp {
	public static void main(String[] args) {
		String cadPalindrome1 = "Anita, lava * la tina.";
		String cadPalindrome2 = "Somos o no, somos!%!";
		String cadPalindrome3 = "Somos o no, somos tu!%!";
		
		System.out.println(StringApplications.isPalindrome(cadPalindrome1));
		System.out.println(StringApplications.isPalindrome(cadPalindrome2));
		System.out.println(StringApplications.isPalindrome(cadPalindrome3));
		
		System.out.println(StringApplications.isPalindromeStack(cadPalindrome1));
		System.out.println(StringApplications.isPalindromeStack(cadPalindrome2));
	}
}
