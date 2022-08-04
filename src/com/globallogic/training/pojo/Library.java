package com.globallogic.training.pojo;

public class Library {
	public static void main(String[] args) {
		
		//Parameterized Constructor 
		Book poem = new Book("Hindi Poems","Mr.Xyz",89.99f,20,2004 );
		
		//Default Constructor and Setters
		Book essay = new Book();
		essay.setAuthor("Mr.Xyz");
		essay.setName("Essay");
		essay.setNoOfPages(120);
		essay.setPrice(149.99f);
		essay.setPublishedYear(2009);
//		Book essay = new Book("Essay","Mr.Xyz",149.99f,120,2009 );
		
		Book maths = new Book("Mathematics","Someone",300f,200,2002 );
		Book science = new Book("Science & History","Dr. APJ",150f,100,2001 );
		Book gk = new Book("General Knowledge","Someone Else",70f,5,2003 );
		System.out.println(maths.toString());
		System.out.println(essay.toString());
		System.out.println("Price of Poem Book: Rs."+poem.getPrice());
		
	}

}

class Book {
	private String name;
	private String author;
	private float price;
	private int noOfPages;
	private int publishedYear;
	public Book() {
		//default
	}
	public Book(String name, String author, float price, int noOfPages, int publishedYear) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.noOfPages = noOfPages;
		this.publishedYear = publishedYear;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getNoOfPages() {
		return noOfPages;
	}
	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}
	public int getPublishedYear() {
		return publishedYear;
	}
	public void setPublishedYear(int publishedYear) {
		this.publishedYear = publishedYear;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", price= Rs." + price + ", noOfPages=" + noOfPages
				+ ", publishedYear=" + publishedYear + "]";
	}
	
	
	
	
}