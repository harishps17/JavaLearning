package javaLearning;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SmallestNumber {

	Integer array []  = {40,70,67,78,98,102} ;
	
	public void findSmallest() {
		Integer temp, size;
		size= array.length;

		for (int number1 = 0; number1 <size; number1++) {
			for (int number2 = 0; number2 < size; number2++) {

				if (array[number1]> array[number2]) {
					temp= array[number1];
					array[number1]= array[number2];
					array[number1]= temp;
				}
			}
		}
		System.out.println("Print the smallest number: " + array[0]);
	}

	public void findSmallest1() {
		int smallest= Integer.MAX_VALUE;
		for (int i = 0; i< array.length; i++) {
			if (array[i]<smallest) {
				smallest=array[i];
			}
		}
	}
	public void usingArrays() {
		Arrays.sort(array);
		System.out.println(array[0]);
	}

	public void usingCollections() {

		List<Integer> list =Arrays.asList(array);
		Collections.sort(list);
		int smallest =list.get(0);
		System.out.println(smallest);
	}

	public static void main(String[] args) {

		@SuppressWarnings("unused")
		SmallestNumber array= new SmallestNumber();
	//	array.usingArrays();
		//array.findSmallest1();
	}
}
