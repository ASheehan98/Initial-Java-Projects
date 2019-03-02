package StringPrograms;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		System.out.println("Enter a String");
		Scanner input = new Scanner(System.in);
		String in = input.nextLine();
		System.out.println(StringReverse(in));
		
	}
	public static String StringReverse(String input) {
		char[] in = input.toCharArray();
		char[] out = new char[in.length];
		for (int i = in.length - 1; i >= 0; i--) {
			out[in.length - i - 1] = in[i];
			
		}
		String output = new String(out);
		return output;
		
	}

}
