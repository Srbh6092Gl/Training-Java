package com.globallogic.training.pojo;

public class Hospital {
	public static void main(String[] args) {
		Doctor anand = new Doctor("Anand","Surgeon",1024,"B-201",12000000.50);
		System.out.println(anand.toString());
		Ambulance amb1 = new Ambulance("UP53 DZ 2083","Binod",9876543210L);
		System.out.println(amb1.toString());
		Patient vinod = new Patient("Vinod", 3, 297, "B-024",1024);
		Patient binod = new Patient("Vinod", 3, 297, "B-024",1024);
		System.out.println(vinod.hashCode()==binod.hashCode());
	}
}

class Ambulance{
	private String number;
	private String driver;
	private long driverContact;
	
	public Ambulance() {
	}
	public Ambulance(String number, String driver, long driverContact) {
		this.number = number;
		this.driver = driver;
		this.driverContact = driverContact;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public long getDriverContact() {
		return driverContact;
	}
	public void setDriverContact(long driverContact) {
		this.driverContact = driverContact;
	}
	@Override
	public String toString() {
		return "Ambulance [number=" + number + ", driver=" + driver + ", driverContact=" + driverContact + "]";
	}
	
	
	
}

class Doctor{
	private String name;
	private String specialization;
	private int id;
	private String roomNumber;
	private double salary;
	public Doctor() {	
	}
	public Doctor(String name, String specialization, int id, String roomNumber, double salary) {
		this.name = name;
		this.specialization = specialization;
		this.id = id;
		this.roomNumber = roomNumber;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Doctor [name=" + name + ", specialization=" + specialization + ", id=" + id + ", roomNumber="
				+ roomNumber + ", salary=" + salary + "]";
	}
	
}

class Patient{
	private String name;
	private int daysStayed;
	private int id;
	private String roomNumber;
	private int doctorId;
	
	public Patient() {
		
	}
	public Patient(String name, int daysStayed, int id, String roomNumber, int doctorId) {
		this.name = name;
		this.daysStayed = daysStayed;
		this.id = id;
		this.roomNumber = roomNumber;
		this.doctorId = doctorId;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDaysStayed() {
		return daysStayed;
	}
	public void setDaysStayed(int daysStayed) {
		this.daysStayed = daysStayed;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	@Override
	public String toString() {
		return "Patient [name=" + name + ", daysStayed=" + daysStayed + ", id=" + id + ", roomNumber=" + roomNumber
				+ ", doctorId=" + doctorId + "]";
	}
	
}