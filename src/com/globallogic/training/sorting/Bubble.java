package com.globallogic.training.sorting;

public class Bubble extends Sort {

	Bubble(int[] a) {
		super(a);
	}

	@Override
	public void sortArray() {
		int lastIndex=a.length-1;
		for(int i=0;i<lastIndex;i++)
			for(int j=0 ; j<lastIndex-i;j++)
				if(a[j]>a[j+1])
					super.swap(j, j+1);
	}

}
