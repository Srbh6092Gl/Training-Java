package com.globallogic.training.exceptionhandling;
import java.io.*;
import java.util.EmptyStackException;
import java.util.Stack;

public class ExceptionHandling {
	
	static void unChecked(){
		System.out.println("Started unchecked method");
		try {
			int n1=2;
			int n2=0;
			System.out.println(n1/n2);
		} catch(ArithmeticException e) {
			System.out.println(e);
		}
		try {
			System.out.println("1234".charAt(4));
		} catch(StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		try {
			String s=null;
			System.out.println(s.toUpperCase());
		} catch(NullPointerException e) {
			System.out.println(e);
		}
		try {
			String num="sdhhshv$@%#$";
			int n=Integer.parseInt(num);
			System.out.println(n+1);
		} catch(NumberFormatException e) {
			System.out.println(e);
		}
		try {
			Stack<Integer> stack = new Stack<>();
			stack.push(5);
			stack.pop();
			System.out.println(stack.pop());
		} catch(EmptyStackException e) {
			System.out.println(e);
		} finally {
			System.out.println("Finished unchecked method");
		}
	}
	
	static void checked()throws IOException{
		System.out.println("Started ckecked method");
		System.out.println("You'll get error on next line only on runtime, not compile time(because throws managed error at compile time)");
		FileReader fr = new FileReader("D:\\JavaFolder");
		System.out.println("Initialized FileReader");
		fr.close();
		System.out.println("Finished ckecked method");
	}
	
	public static void main(String[] args) throws IOException {
		System.out.println("Compilation Finished");
		System.out.println("Running the program...");
		System.out.println("..........................");
		System.out.println("..........................");
		unChecked();
		System.out.println("..........................");
		System.out.println("..........................");
		checked();
		System.out.println("..........................");
		System.out.println("..........................");
		System.out.println("Reached end of the program");
	}
}