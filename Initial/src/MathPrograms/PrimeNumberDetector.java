package MathPrograms;

import java.util.Scanner;

public class PrimeNumberDetector {
	public static void main(String[] args) {
		System.out.println("Enter Interger");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		System.out.println(PrimeDetect(number));

		
	}
	public static String PrimeDetect(int input) {
		String firstresult = "Number is not prime";
		String secondresult = "Number is prime";
		for (int i = 2;i<input;i++) {
			if (input % i == 0) {
				return(firstresult);
				
			}
		}
		return secondresult;
	}

}
