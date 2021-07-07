package javaLearning;

import java.util.Scanner;

public class PositionOfEnglishAlphabet {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Alphabet: ");

		char givenChar= scanner.next().charAt(0);

		givenChar =	Character.toLowerCase(givenChar);
		scanner.close();


		int asciiValue = (int) givenChar;
		System.out.println(asciiValue);

		int position = asciiValue-96;

		System.out.println(position);

	}

}
