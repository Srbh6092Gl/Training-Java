package com.globallogic.training.statickeyword;

public class StaticClass {
	
	
	public static void main(String[] args) {
		StaticClass.Book book = new Book("DS", 1199.99f);
		System.out.println(book.toString());
	}
	
	static class Book{
		private String name;
		private float price;
		public Book(String name, float price) {
			super();
			this.name = name;
			this.price = price;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public float getPrice() {
			return price;
		}
		public void setPrice(float price) {
			this.price = price;
		}
		@Override
		public String toString() {
			return "Book [name=" + name + ", price=" + price + "]";
		}
	}
	
}