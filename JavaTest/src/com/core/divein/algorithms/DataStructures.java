package com.core.divein.algorithms;

import java.lang.reflect.Array;

public class DataStructures {

	static int arraySize = 10;
	static int[] intArray = new int[arraySize];

	// BubbleSort
	private static void constructArray() {
		// makeArray
		for (int i = 0; i < arraySize; i++) {
			intArray[i] = (int) (Math.random() * 10) + 10;
		}
	}

	private static void printArray(String keyword) {
		System.out.println(keyword + "\n" + "-----------------");
		String printStr = "";
		for (int i = 0; i < arraySize; i++) {
			printStr = printStr + intArray[i] + "|";
		}
		System.out.println(printStr);
	}

	// the Highest value element bubbles up to highest position
	private static void bubbleSort() {
		int lastSortedPosition = arraySize - 1;
		for (int i = 0; i < arraySize; i++) {
			for (int j = 0; j < lastSortedPosition; j++) {
				if (intArray[j] > intArray[j + 1]) {
					int temp = intArray[j];
					intArray[j] = intArray[j + 1];
					intArray[j + 1] = temp;
				}
				// printArray("Swapped" + intArray[j] +":" +intArray[j+1]);
			}
			lastSortedPosition--;

		}
	}

	// Select minimum value and Swap it and place at lower position
	private static void selectionSort() {
		for (int i = 0; i < arraySize - 1; i++) {
			int minIndex = i; // store minimum index value
	   		for (int j = i; j < arraySize; j++) {
				if (intArray[j] < intArray[minIndex]) {
					minIndex = j; // minimum index value is current array cell
				}
			}
			// Swap - Place Min index element in lowest cell; place lowest cell element in
			// the Minimum one
			//System.out.println("Min is:" +minIndex + "loop is:" + i);
			int temp = intArray[i]; // lowest cell
			intArray[i] = intArray[minIndex]; // swap lowest cell with min index
			intArray[minIndex] = temp; // swap min index with lowest from temp
			//printArray("Swapped" + intArray[i] +":" +intArray[minIndex]);
			}

	}

	public static void main(String args[]) {
		constructArray();
		printArray("Before");
		//bubbleSort();
		selectionSort();
		printArray("After");

	}

}
