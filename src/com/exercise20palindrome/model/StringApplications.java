package com.exercise20palindrome.model;

import java.util.Stack;

public class StringApplications {
	public static boolean isPalindrome(String cad) {
		String cadClean = cad.replaceAll("[^A-Za-z]+","");
		System.out.println(cadClean);
		return false;
	}
	
	public static boolean isPalindromeStack(String cad) {
		boolean isPal=true;
		String cadClean = cad.replaceAll("[^A-Za-z]+","");
		char[] cadArray = cadClean.toCharArray();
		Stack<Character> letters1 = new Stack<Character>();
		Stack<Character> letters2 = new Stack<Character>();
		for(Character c : cadArray) {
			letters1.push(c);
		}
		for(int i=cadArray.length-1;i>=0;i--) {
			letters2.push(cadArray[i]);
		}
		while(!letters1.isEmpty()) {
			if(letters1.pop()!=letters2.pop()) {
				isPal=true;
			}
		}
		return isPal;
	}
}
