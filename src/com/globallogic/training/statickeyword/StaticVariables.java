package com.globallogic.training.statickeyword;

class Student{
	private int admNo;
	static int schoolCode;

	public Student(int admNo) {
		this.admNo = admNo;
	}
	public Student(int admNo, int schoolCode) {
		this.admNo = admNo;
		this.schoolCode = schoolCode;
	}
	public int getAdmNo() {
		return admNo;
	}
	public void setAdmNo(int admNo) {
		this.admNo = admNo;
	}
	public static int getSchoolCode() {
		return schoolCode;
	}
	public static void setSchoolCode(int schoolCode) {
		Student.schoolCode = schoolCode;
	}
	@Override
	public String toString() {
		return "Student [admNo=" + admNo + ", schoolCode=" + schoolCode + "]";
	}
	
}

public class StaticVariables {
	public static void main(String[] args) {
		Student s1 = new Student(100,3051);
		System.out.println(s1.toString());
		
		System.out.println();
		Student s2 = new Student(101,3052);
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		
		System.out.println();
		Student.schoolCode=3053;
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		
	}
}
