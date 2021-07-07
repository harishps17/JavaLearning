package javaLearning;

public class RemoveLeadingTrialingSpaces {

	public static void main(String[] args) {

		String input = "  Hello World  !!  ";
				System.out.println(input.trim());
		
		System.out.println(input.strip());
		
		System.out.println(input.stripLeading());
		
		System.out.println(input.stripTrailing());
		
		System.out.println(input.replaceAll("^[ \t]+|[\t ]+$", ""));
		
		System.out.println(input.replaceAll("^[ \t]", ""));
		
		System.out.println(input.replaceAll("[\t ]+$", ""));

	}

}
