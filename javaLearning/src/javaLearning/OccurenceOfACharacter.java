package javaLearning;

public class OccurenceOfACharacter {

	String input= "IndiaLason";
	char toFind= 'i';

	public void usingIteration() {

		int occurence=0;

		input= input.toLowerCase();

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i)==toFind) {
				occurence= occurence+1;
			}
		}
		System.out.println(toFind + " is present "+occurence +" times");
	}
	public void withoutUsingIteration() {

		input= input.toUpperCase();

		String charTOFind = Character.toString(toFind).toUpperCase();

		int actualLength = input.length();

	//	System.out.println(actualLength);

		input= input.replace(charTOFind, "");

		int lengthAfterReplace= input.length();

		//System.out.println(lengthAfterReplace);
		int occurence= actualLength-lengthAfterReplace;
		
		System.out.println("Occurence of "+ toFind +" is "+occurence+" times");
	}

	public static void main(String[] args) {

		OccurenceOfACharacter frequency = new OccurenceOfACharacter();
		//frequency.usingIteration();
		frequency.withoutUsingIteration();

	}


}
