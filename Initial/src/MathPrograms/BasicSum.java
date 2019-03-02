package MathPrograms;

import java.util.Scanner;

public class BasicSum {
	public static void main(String[] args) {
		System.out.println("Enter an INTERGER");
		Scanner first = new Scanner(System.in);
		System.out.println("Enter a second Interger");
		Scanner second = new Scanner(System.in);
		System.out.println(BasicSum(first,second));
		first.close();
		second.close();
		
	}
	public static int BasicSum(Scanner first, Scanner second) {
		int one = first.nextInt();
		int two = second.nextInt();
		return(one + two);
	}

}
