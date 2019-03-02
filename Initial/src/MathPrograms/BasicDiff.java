package MathPrograms;

import java.util.Scanner;

public class BasicDiff {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an INTERGER");
		int first = input.nextInt();
		System.out.println("Enter another INTERGER");
		int second = input.nextInt();
		System.out.println(BasicDiff(first,second));
	}
	public static int BasicDiff(int first, int second) {
		return(first - second);
		
	}

}
