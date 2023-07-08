package application;

import entities.StringManipulation;

public class Main {

	public static void main(String[] args) {
		// Desafio 01
		String string = "Hello, World! OpenAI is amazing.";
		String reversedWords = StringManipulation.reverseWords(string);
		System.out.println("Desafio 01: \n" + reversedWords);

		// Desafio 02
		String string2 = "Hello, World!";
		String removeDuplicates = StringManipulation.removeDuplicates(string2);
		System.out.println("");
		System.out.println("Desafio 02: \n" + removeDuplicates);

		// Desafio 03
		String string3 = "babad";
		String longestPalindromeSubstring = StringManipulation.longestPalindromeSubstring(string3);
		System.out.println("");
		System.out.println("Desafio 03: \n" + longestPalindromeSubstring);
		
		//Desafio 04
		String string4 = "hello how are you? i'm fine, thank you.";
		String upperFirstLetter = StringManipulation.upperFirstLetter(string4);
		System.out.println("");
		System.out.println("Desafio 04: \n" + upperFirstLetter);    
		
		//Desafio 05
		String string5 = "racecar";
		boolean isAnagramOfPalindrome = StringManipulation.isAnagramOfPalindrome(string5);
		System.out.println("");
		System.out.println("Desafio 05: \n" + isAnagramOfPalindrome);    
	}
}
