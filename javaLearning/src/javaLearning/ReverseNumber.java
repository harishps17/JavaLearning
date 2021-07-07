package javaLearning;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		int givenNumber=0;

		int reversedNumber=0;

		System.out.println("Enter the number to be reversed:");

		@SuppressWarnings("resource")
		Scanner scanner= new Scanner(System.in);
		givenNumber= scanner.nextInt();

		while (givenNumber!=0) {
			reversedNumber = reversedNumber*10;
			reversedNumber= reversedNumber+givenNumber%10;
			givenNumber = givenNumber/10;
		}
		System.out.println("ReverseNumber: "+ reversedNumber);
	}
}
