package com.globallogic.training.sorting;

import java.util.Scanner;

public class Sorting {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] a = {1,4,3,5,3,6,7,34,74,2,5};
		System.out.println("1-Selection Sort");
		System.out.println("2-Insertion Sort");
		System.out.println("3-Bubble Sort");
		System.out.println("4-Heap Sort");
		System.out.println("5-Merge Sort");
		System.out.println("6-Quick Sort");
		System.out.println("Enter your choice 1,2,3,4,5 or 6");
		int choice= s.nextInt();
		s.close();
		switch(choice) {
			case 1:
				Sort insertionSorting = new Insertion(a);
				insertionSorting.display();
				insertionSorting.sortArray();
				insertionSorting.display();
				break;
			case 2:
				Sort selectionSorting = new Selection(a);
				selectionSorting.display();
				selectionSorting.sortArray();
				selectionSorting.display();
				break;
			case 3:
				Sort bubbleSorting = new Bubble(a);
				bubbleSorting.display();
				bubbleSorting.sortArray();
				bubbleSorting.display();
				break;
			case 4:
				Sort heapSorting = new Heap(a);
				heapSorting.display();
				heapSorting.sortArray();
				heapSorting.display();
				break;
			case 5:
				Sort mergeSorting = new Merge(a);
				mergeSorting.display();
				mergeSorting.sortArray();
				mergeSorting.display();
				break;
			case 6:
				Sort quickSorting = new Quick(a);
				quickSorting.display();
				quickSorting.sortArray();
				quickSorting.display();
				break;
			default:
				System.out.println("Wrong input! Run it again.");
		}
	}
}
