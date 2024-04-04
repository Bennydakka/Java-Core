package com.Learning.core.day1.session1;

public class Benny {
	public static Book CreateBooks(String book_title,Double price) {
          Book book1=new Book();
          book1.setBook_title(book_title);
          book1.setPrice(price);
          return book1;
}
	public static void showBooks(Book book) {
		System.out.println("Book Title: "+book.getbook_title()+"  "+"and price: "+book.getPrice());
		}
	public static void main(String[] args) {
		Book book2=CreateBooks("java programming",350.00);
		showBooks(book2);
	}
}
