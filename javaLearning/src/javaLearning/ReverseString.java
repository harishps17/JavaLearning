package javaLearning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseString {
	String given = "Agni";

	public void usingStringBuffer() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(given);
		System.out.println(buffer.reverse());
	}
	
	public void usingArray() {
		char[] array =given.toCharArray();
		String reversed="";
		for (int i = array.length-1; i>=0; i--){
			reversed =reversed+ array[i];
		}
		System.out.println(reversed);
	}
		public void usingCollections() {
			char[] characArray =given.toCharArray();
			List<Character> list= new ArrayList<Character>();
			for (Character character : characArray) {
				list.add(character);
			}
			Collections.reverse(list);

			ListIterator<Character> iterator = list.listIterator();
			while (iterator.hasNext()) {
				System.out.print(iterator.next());
			}		
		}	
		
		public static void main(String[] args) {
			ReverseString aString = new ReverseString();
			aString.usingArray();
			aString.usingStringBuffer();
			aString.usingCollections();
		}
}
