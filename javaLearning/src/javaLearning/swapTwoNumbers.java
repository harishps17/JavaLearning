package javaLearning;

public class swapTwoNumbers {

	public void usingThird() {
		int mySalary= 20;
		int superiorSalary= 50;
		System.out.println("Before swapping" +"Mine" +mySalary+ "Superior" + superiorSalary );
		int temp = mySalary;

		mySalary = superiorSalary;
		superiorSalary= temp;
		System.out.println("After swapping" +"Mine" +mySalary+ "Superior" + superiorSalary );
	}
	public void withotUsingThird() {
		int first = 20;
		int second= 50;

		System.out.println("Before swapping" +"First" +first+ "Second" + second );
		first= first-second;
		second= first+second;
		first = second-first;
		System.out.println("After swapping" +"First" +first+ "Second" + second );
	}

	public static void main(String[] args) {

		swapTwoNumbers numbers= new swapTwoNumbers();
		numbers.usingThird();
		numbers.withotUsingThird();
	}
}
