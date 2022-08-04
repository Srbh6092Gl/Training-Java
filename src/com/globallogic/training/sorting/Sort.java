package com.globallogic.training.sorting;

abstract class Sort {
	int a[];
	Sort(int[] a){
		this.a=a;
	}
	public abstract void sortArray();
	public void display() {
		for(int e: this.a)
			System.out.print(e+" ");
		System.out.println();
	}
	public void swap(int i, int j) {
		int temp=a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
