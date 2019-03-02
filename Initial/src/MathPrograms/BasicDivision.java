package MathPrograms;

import java.util.Scanner;

public class BasicDivision {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter dividend");
		double divi = input.nextDouble();
		System.out.println("Enter divisor");
		double divis = input.nextDouble();
		System.out.println(BasicDivision(divi,divis));
			
	}
	public static double BasicDivision(double dividend, double divisor) {
		return (dividend/divisor);
		}

	}



