package com.globallogic.training.loop;

//Java Program to reverse the letters present in the given String
public class ReverseString {
	public static void main(String[] args) {
		String s="GlobalLogic";
//		String reverse="";
		for(int i=s.length()-1 ; i>=0 ; i--) {
			System.out.print(s.charAt(i));
//			reverse = reverse + s.charAt(i);
		}
//		System.out.println();
//		System.out.println("Reverse: "+reverse);
	}
}