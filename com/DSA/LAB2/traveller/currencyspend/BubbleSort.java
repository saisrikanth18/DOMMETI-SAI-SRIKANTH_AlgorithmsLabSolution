package com.DSA.LAB2.traveller.currencyspend;

import com.gl.datastructures.common.DataStructureUtils;

public class BubbleSort {

	private int[] data;

	public BubbleSort(int[] data) {

		this.data = data;
	}

	public void sort() {
		sortAsc();
	}
	
	public void sortAsc() {

		int length = data.length;
		for (int iIndex = 0; iIndex < (length - 1); iIndex++) {
		
			for (int jIndex = 0; jIndex < (length - iIndex - 1); jIndex++) {
			
				if (data[jIndex] > data[jIndex + 1]) {
				
					int temp = data[jIndex];
					data[jIndex] = data[jIndex + 1];
					data[jIndex + 1] = temp;
				}
			}
		}

	}
	
	public void sortDesc() {
	
		int length = data.length;
		for (int iIndex = 0; iIndex < (length - 1); iIndex++) {
		
			for (int jIndex = 0; jIndex < (length - iIndex - 1); jIndex++) {
			
				if (data[jIndex] < data[jIndex + 1]) {
				
					int temp = data[jIndex];
					data[jIndex] = data[jIndex + 1];
					data[jIndex + 1] = temp;
				}
			}
		}		
	}
	
	public static void main(String[] args) {
	
		testDescSorting(new int[] {5, 1, 10});
		testDescSorting(new int[] {60, 5, 12, 78, 25});
		testDescSorting(new int[] {12, 5, 123, 18});
	}

	private static void testAscSorting(int [] data) {
		
		BubbleSort sort = new BubbleSort(data);
		System.out.println("Before Sorting...");
		DataStructureUtils.print(data);
		
		System.out.println("After Sorting...");
		sort.sort();
		DataStructureUtils.print(data);
	}

	private static void testDescSorting(int [] data) {
		
		BubbleSort sort = new BubbleSort(data);
		System.out.println("Before Sorting...");
		DataStructureUtils.print(data);
		
		System.out.println("After Sorting...");
		sort.sortDesc();
		DataStructureUtils.print(data);
	}

}

