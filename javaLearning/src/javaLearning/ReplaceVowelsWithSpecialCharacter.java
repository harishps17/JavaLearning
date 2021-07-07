package javaLearning;

public class ReplaceVowelsWithSpecialCharacter {
	String given= "Employee of India Lason";

	public void usingArray() {

		char[] charArray =	given.toCharArray();

		for (int i = 0; i < given.length(); i++) {
			if (given.charAt(i)=='A'||given.charAt(i)=='E'||given.charAt(i)=='I'||given.charAt(i)=='O'
					||given.charAt(i)=='U'||given.charAt(i)=='a'||given.charAt(i)=='e'||given.charAt(i)=='i'
					||given.charAt(i)=='o'||given.charAt(i)=='u'  ) {
				charArray[i]='*';
			}
		}
		for (int i = 0; i < given.length(); i++) {
			System.out.print(charArray[i]);
			}
}
	public void usingRegexpression() {
		String replacedText = given.replaceAll("[AEIOUaeiou]", "*");
		System.out.println(replacedText);
	}

public static void main(String[] args) {

	ReplaceVowelsWithSpecialCharacter replaceVowelsWithSpecialCharacter = new ReplaceVowelsWithSpecialCharacter();
	//replaceVowelsWithSpecialCharacter.usingArray();
	replaceVowelsWithSpecialCharacter.usingRegexpression();
	
}}
