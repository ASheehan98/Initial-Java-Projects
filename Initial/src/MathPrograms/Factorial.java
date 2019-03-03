package MathPrograms;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		System.out.println("Enter");
		Scanner in = new Scanner(System.in);
		int input = in.nextInt();
		System.out.println(Facto(input));
		
	}
	public static int Facto(int input) {
		int result = 0;
		for (int i = input - 1; i > 0; i--) {
			result = input *= i;
			
		}
		return result;
	}

}
