package entities;

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
	
	

}
