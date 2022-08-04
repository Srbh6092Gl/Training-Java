package com.globallogic.training.statickeyword;

class Patient{
	private String name;
	static String hospitalName;

	public Patient(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	static String getHospitalName() {
		return hospitalName;
	}
	
	@Override
	public String toString() {
		return "Patient [name=" + name+", Hospital=" + hospitalName + "]";
	}

	
}

public class StaticMethod {
	public static void main(String[] args) {
		Patient patient = new Patient("Aman");
		System.out.println(patient.toString());
		System.out.println();
		Patient.hospitalName = "City Hospital";
		System.out.println("Hospital: "+Patient.getHospitalName());
		System.out.println(patient.toString());
	}
}
