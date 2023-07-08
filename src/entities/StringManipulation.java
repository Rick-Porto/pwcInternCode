package entities;

import java.util.*;

public class StringManipulation {

	// Reverter a ordem das palavras na frase - Desafio 01
	public static String reverseWords(String input) {
		String[] words = input.split(" ");
		StringBuilder reversed = new StringBuilder();

		for (int i = words.length - 1; i >= 0; i--) {
			reversed.append(words[i]).append(" ");
		}

		return reversed.toString().trim();
	}

	// Remover caracteres duplicados - Desafio 02
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
	
	

}
