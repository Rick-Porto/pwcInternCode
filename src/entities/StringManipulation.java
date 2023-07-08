package entities;

import java.util.*;

public class StringManipulation {

	// Reverte a ordem das palavras na frase - Desafio 01
	public static String reverseWords(String input) {
		String[] words = input.split(" ");
		StringBuilder reversed = new StringBuilder();

		for (int i = words.length - 1; i >= 0; i--) {
			reversed.append(words[i]).append(" ");
		}

		return reversed.toString().trim();
	}

	// Remove caracteres duplicados - Desafio 02
	public static String removeDuplicates(String input) {
		StringBuilder result = new StringBuilder();
		Set<Character> uniqueChars = new HashSet<>();

		for (char c : input.toCharArray()) {
			if (!uniqueChars.contains(c)) {
				result.append(c);
				uniqueChars.add(c);
			}
		}

		return result.toString();
	}

	// Verifica se uma palavra é um palíndromo
	private static boolean isPalindrome(String word) {
		int left = 0;
		int right = word.length() - 1;

		while (left < right) {
			if (word.charAt(left) != word.charAt(right)) {
				return false;
			}

			left++;
			right--;
		}

		return true;
	}

	// Encontra a substring palíndroma mais longa - Desafio 03
	public static String longestPalindromeSubstring(String input) {
		int maxLength = 0;
		int start = 0;

		for (int i = 0; i < input.length(); i++) {
			for (int j = i + 1; j <= input.length(); j++) {
				String substring = input.substring(i, j);
				if (isPalindrome(substring) && substring.length() > maxLength) {
					maxLength = substring.length();
					start = i;
				}
			}
		}

		return input.substring(start, start + maxLength);
	}

}
