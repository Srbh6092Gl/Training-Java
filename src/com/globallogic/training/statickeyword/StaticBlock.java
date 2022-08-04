package com.globallogic.training.statickeyword;

public class StaticBlock {
	
	static void fun(){
		System.out.println("Method fun executed");
	}
	
	
	public static void main(String[] args) {
		System.out.println("Main started");
		fun();
		System.out.println("Main completed");
	}
	
	static {
		System.out.println("Static executed");
	}
}
