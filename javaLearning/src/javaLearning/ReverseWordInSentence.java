package javaLearning;

public class ReverseWordInSentence {

	public static void main(String[] args) {

		String given= "India Lason Source";
		String reversed="";
		
		String[] temp = given.split(" ");
		
		System.out.println(temp.length);
		
		for (int i = temp.length-1; i>=0; i--) {
			
			reversed= reversed+temp[i]+" ";
			
		}
		System.out.println(reversed);
		
	}

}
