package javaLearning;

public class FindElementPresentOrNot {

	public static void main(String[] args) {

		int array[] = {10,20,30,34,44,55, 34,34};

		int findNumber= 374;

		boolean found = false;

		for (int number : array) {

			if(number==findNumber) {
				found = true;
				//System.out.println("Number is present");
				break;
			}
		}
		if (found) {
			System.out.println("Number is present");
		}else
			System.out.println("Not present");
	}
}
