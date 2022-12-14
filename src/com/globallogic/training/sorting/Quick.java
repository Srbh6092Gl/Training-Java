package com.globallogic.training.sorting;

public class Quick extends Sort {

	Quick(int[] a) {
		super(a);
	}

	@Override
	public void sortArray() {
		quickSort(a,0,a.length-1);
	}

	//Not complete
	private void quickSort(int[] a, int left, int right) {
		if(left==right)
			return;
		int p=partition(a, left, right);
		super.display();
		System.out.print("left: "+ left+", ");
		System.out.print("right: "+ right+", ");
		System.out.println("p: "+ p);
		quickSort(a,left,p-1);
		quickSort(a,p+1,right);
	}

	private int partition(int[] a, int left, int right) {
		int pivot=a[right];
		int i=left;
		for( int j=left; j<right ; j++)
			if(a[j]<pivot)
				super.swap(i++, j);
		super.swap(i++, right);
		return i;
	}

}
