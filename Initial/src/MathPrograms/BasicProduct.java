package MathPrograms;

import java.util.Scanner;

public class BasicProduct {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter First Value");
		double first = input.nextDouble();
		System.out.println("Enter Second Value");
		double second = input.nextDouble();
		System.out.println(BasicProduct(first,second));
		
	}
	public static double BasicProduct(double first, double second) {
		return (first * second);
	}

}
