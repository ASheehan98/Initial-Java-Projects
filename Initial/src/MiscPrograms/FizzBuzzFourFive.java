package MiscPrograms;

import java.util.Scanner;

//return "FizzBuzz" if number is divisible by both 4 and 5
//return "Fizz" if number is divisible by 4
//return "Buzz" if number is divisible by 5
public class FizzBuzzFourFive {
	public static void main(String[] args) {
		System.out.println("Enter an Interger");
		Scanner interger = new Scanner(System.in);
		int input = interger.nextInt();
		System.out.println(FizzBuzz(input));
		
		
	}
	public static String FizzBuzz(int input) {
		String FB = "FizzBuzz";
		String F = "Fizz";
		String B = "Buzz";
		String not = "Interger is Not Divisble by either 4 or 5";
		
		if (input % 4 == 0 && input % 5 == 0) {
			return (FB);
		}
		if (input % 4 == 0) {
			return (F);
		}
		if (input % 5 == 0) {
			return (B);
		}
		return (not);
	}

}
