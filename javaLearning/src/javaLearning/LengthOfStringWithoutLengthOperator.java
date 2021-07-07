package javaLearning;

public class LengthOfStringWithoutLengthOperator {

	public static void main(String[] args) {

		String givenString= "LasonIndia";
		
		System.out.println(givenString.length());
		
	char[] arrayLength=	givenString.toCharArray();
	
	int length = 0;
	
	for (char c : arrayLength) {
		length++;
	}
		System.out.println(length);		
	}
}
