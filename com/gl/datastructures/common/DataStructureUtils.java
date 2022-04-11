package com.gl.datastructures.common;

import java.util.Random;

public class DataStructureUtils {

	public static int[] generateRandomArray(int size) {
		
		int resultArray[] = new int[size];
				
		for (int index = 0; index < size; index ++) {
						
			int random1 = (int)(Math.random() * 10) + 1;
			int random2 = (int)(Math.random() * 10) + 1;
						
			resultArray[index] = (random1 * random2) + (index + 3);			
		}
		
		return resultArray;
	}

	public static int[] generateRandomSortedArray(int size) {
		
		int resultArray[] = new int[size];
		
		int initialValue = generateInitialRandomNumber();
		resultArray[0] = initialValue;
		
		for (int index = 1; index < size; index ++) {
			
			int prevValue = resultArray[index - 1];
			
			int random = (int)(Math.random() * 10) + 1;
			int currentValue = prevValue + random;
			
			resultArray[index] = currentValue;			
		}
		
		return resultArray;
	}
	
	public static int pickRandomNumber(int[] array) {
		
		int size = array.length;
		
		Random random = new Random();
		int randomIndex = random.nextInt(size);
		
		return array[randomIndex];
	}
	
	public static void printWithIndex(int[] array) {
		
		System.out.print("{ ");
		for (int index = 0; index < array.length; index ++) {	

			System.out.print("(" + index + ") ");

			System.out.print("[" + array[index] + "]");
			
			if (index != (array.length - 1)) {
				System.out.print(", ");
			}
		}
		System.out.println(" }");
	}

	public static void print(int[] array) {
		
		System.out.print("{ ");
		for (int index = 0; index < array.length; index ++) {	

			System.out.print(array[index]);
			
			if (index != (array.length - 1)) {
				System.out.print(", ");
			}
		}
		System.out.println(" }");
	}

	public static String printAndReturn(int[] array) {
		
		StringBuilder result = new StringBuilder();
		result.append("{ ");
		for (int index = 0; index < array.length; index ++) {	

			result.append(array[index]);

			if (index != (array.length - 1)) {
				result.append(", ");
			}
		}
		result.append(" }");
		return result.toString();
	}

	private static int generateInitialRandomNumber() {
		
		double random = (Math.random() * 10) + 1;
		return (int)random;
	}
	
	public static void main(String[] args) {
		
		int array[] = DataStructureUtils.generateRandomSortedArray(3);
		printWithIndex(array);
	}
}