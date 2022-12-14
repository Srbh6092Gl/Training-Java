package com.globallogic.training.sorting;

public class Insertion extends Sort{
	Insertion(int[] a) {
		super(a);
	}

	@Override
	public void sortArray() {
		for( int i = 1; i< a.length ; i++) {
			int j=i;
			int temp=a[i];
			while(j>0 && temp<=a[j-1]) {
				a[j]=a[j-1];
				j--;
			}
			a[j]=temp;
		}
	}
}