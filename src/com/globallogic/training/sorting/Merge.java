package com.globallogic.training.sorting;

public class Merge extends Sort {

	Merge(int[] a) {
		super(a);
	}

	@Override
	public void sortArray() {
		mergeSort(a,0,a.length-1);
	}
	private void mergeSort(int[] a, int left, int right) {
		//Only one element: no sorting needed
		if(left==right)
			return;
		
		//More than one element
		int mid= left+(right-left)/2;//Find mid of the array
		mergeSort(a,left,mid);//Sort left sub-array (till mid)
		mergeSort(a,mid+1,right);//Sort right sun-array(after mid)
		merge(a,left,mid,right);//Merge left and right
	}

	private void merge(int[] a, int left, int mid, int right) {
		int size1=mid-left+1;
		int size2=right-mid;
		int[] aLeft=new int[size1];
		int[] aRight=new int[size2];
		
		//Create copy of left and right
		for(int i=0;i<size1;i++)
			aLeft[i]=a[left+i];
		for(int i=0;i<size2;i++)
			aRight[i]=a[mid+1+i];
		
		int i=0;
		int j=0;
		int k=left;
		//from the beginning, add minimum of the left and right sub arrays to original array
		//Until one of the sub-arrays reaches the end
		while(i<size1 && j<size2)
			a[k++]=(aLeft[i]<=aRight[j])?aLeft[i++]:aRight[j++];
		//If left sub-array as not reached the end
		//add all elements left of it to the original array
		while(i<size1)
			a[k++]=aLeft[i++];
		//If right sub-array as not reached the end
		//add all elements left of it to the original array
		while(j<size2)
			a[k++]=aRight[j++];
	}

}
