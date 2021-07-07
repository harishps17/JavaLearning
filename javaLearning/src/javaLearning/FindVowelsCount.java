package javaLearning;

public class FindVowelsCount {

	public static void main(String[] args) {

		String input= "Mahendra singh Dhoni";
		
		int vowelsCount = 0;
		
		input= input.toLowerCase();
		
		int length = input.length();
		
		for (int i = 0; i < length; i++) {
			
			if (input.charAt(i)=='a'||input.charAt(i)=='e'|| input.charAt(i)=='i'|| input.charAt(i)=='0'|| input.charAt(i)=='u'){
				vowelsCount++;
				
			}
		}
		System.out.println("Your name has "+vowelsCount +" vowels");
		
	}

}
