package javaLearning;

import java.util.Arrays;
import java.util.HashSet;

public class FindMissingAlphabetInAString {

	public static void main(String[] args) {

		String find= "b";

		find = find.toLowerCase();

		find = find.replaceAll(" ", "");

		String[] userArray= find.split("");

		System.out.println(userArray);

		String[] alphabet = "abcdefghijklmnopqrstuvwxyz".split("");

		System.out.println(alphabet);

		HashSet<String> set1 = new HashSet<String>();

		for (String string : userArray) {
			set1.add(string);
		}
		
		HashSet<String> set2 = new HashSet<String>(Arrays.asList(alphabet));
		set2.removeAll(set1);
		
		System.out.println(set2);
	}
}
