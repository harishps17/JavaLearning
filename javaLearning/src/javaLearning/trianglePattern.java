package javaLearning;

import java.util.Scanner;

public class trianglePattern {

	public void usingStar(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int row, column;
		int numberOfLines= scanner.nextInt();
		for (row = 0; row < numberOfLines; row++) {
			for (column = 0; column <row; column++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		
		trianglePattern printPattern = new trianglePattern();
		printPattern.usingStar();


	}
}
