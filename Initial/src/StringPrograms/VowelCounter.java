package StringPrograms;

import java.util.Scanner;

public class VowelCounter {
	public static void main(String[] args) {
		System.out.println("Enter a word or sentence for a vowel count (y not included).");
		Scanner input = new Scanner(System.in);
		String word = input.nextLine();
		System.out.println(VowelCount(word));

		
	}
	public static int VowelCount(String word) {
		char[] input = word.toCharArray();
		int vcount = 0;
		for (int i = 0; i < input.length; i++) {
			if(input[i] == 'a' || input[i] == 'e' ||input[i] == 'i'
					||input[i] == 'o' || input[i] == 'u' || input[i] == 'a'
					||input[i] == 'A' ||input[i] == 'E' ||input[i] == 'I'
					||input[i] == 'O'||input[i] == 'U') {
				vcount++;
			}

		}
		return vcount;
				
		
	}

}
