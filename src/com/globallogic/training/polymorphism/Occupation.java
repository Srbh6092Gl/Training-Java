package com.globallogic.training.polymorphism;

//Polymorphism is achieved through : method overloading
//									 method overriding

class Person {
	private String name;
	Person(String name){
		this.name=name;
	}
	void work() {
		System.out.println("I am unemployed");
	}
	void work(String occ) {
		System.out.println("I am: "+ occ);
	}
}

class Student extends Person {
	Student(String name) {
		super(name);
	}
	void work() {
		System.out.println("I am a student");
	}
}

class Teacher extends Person {
	Teacher(String name) {
		super(name);
	}
	void work() {
		System.out.println("I am a teacher");
	}
}

public class Occupation {
	public static void main(String[] args) {
		Person aman = new Person("Aman");
		aman.work();
		
		Student raman = new Student("Raman");
		raman.work(); //overriding
		
		Person amaan = new Teacher("Amaan");
		amaan.work();//overriding
		
		Student shaan = new Student("Shaan");
		shaan.work("Intern");//overloading
		
	}
}
