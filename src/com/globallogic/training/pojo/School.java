package com.globallogic.training.pojo;

public class School {
	public static void main(String[] args) {
		Student rohit = new Student(1001,"Rohit Sharma", 89.9f, "XII", 'B');
		System.out.println("Percentage of "+ rohit.getName()+": "+rohit.getPercentage());
	}
}

class Student {
	
	private int admNo;
	private String name;
	private float percentage;
	private String mClass;
	private char section;
	
	public Student() {
	}
	
	public Student(int admNo, String name, float percentage, String mClass, char section) {
		this.admNo = admNo;
		this.name = name;
		this.percentage = percentage;
		this.mClass = mClass;
		this.section = section;
	}
	
	public int getAdmNo() {
		return admNo;
	}
	public void setAdmNo(int admNo) {
		this.admNo = admNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	public String getmClass() {
		return mClass;
	}
	public void setmClass(String mClass) {
		this.mClass = mClass;
	}
	public char getSection() {
		return section;
	}
	public void setSection(char section) {
		this.section = section;
	}
	@Override
	public String toString() {
		return "Student [admNo=" + admNo + ", name=" + name + ", percentage=" + percentage + ", mClass=" + mClass
				+ ", section=" + section + "]";
	}
	
}
