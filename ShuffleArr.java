package com.Arrays;
import java.util.*;
import java.util.Collections;

public class ShuffleArr {

	public static void main(String[] args) {
		ArrayList<Integer> numbers=new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		
		Collections.shuffle(numbers);
		System.out.println(numbers);
	}

}
