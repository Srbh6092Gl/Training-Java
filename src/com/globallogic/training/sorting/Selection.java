package com.globallogic.training.sorting;

public class Selection extends Sort{
	Selection(int[] a) {
		super(a);
	}

	@Override
	public void sortArray() {
		int lastIndex =a.length-1;
		for(int i=0 ; i<lastIndex ; i++) {
			int minIndex = i;
			for( int j=i+1 ; j<=lastIndex ;j++)
				if(a[j]<a[minIndex])
					minIndex=j;
			super.swap(i, minIndex);
		}
	}
}
