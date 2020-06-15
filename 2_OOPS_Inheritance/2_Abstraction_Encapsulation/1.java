/*Create a class Author with the following information.
Member variables : name (String), email (String), and gender (char)
Parameterized Constructor: To initialize the variables
Create a class Book with the following information.
Member variables : name (String), author (of the class Author you have just created), price (double), and qtyInStock (int)
[Assumption: Each book will be written by exactly one Author]
Parameterized Constructor: To initialize the variables
Getters and Setters for all the member variables

In the main method, create a book object and print all details of the book (including the author details)

Solution:
*/
import java.io.*;
import java.util.*;

class Author {
	 String name;
	 String email;
	 char gender;
	Author(String name,String email,char gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
	}

}	

	
class Book {
	private String name;
	private Author author;
	private double price;
	private int qtyInStock;
	Book(String name,Author author,double price,int qtyInStock){
		this.name=name;
		this.author=author;
		this.price=price;
		this.qtyInStock=qtyInStock;
	}	

	String getName() {
		return name;
	}

	void setName(){
		this.name=name;
	}

	double getPrice() {
		return price;
	}

	void setPrice(double price) {
		this.price = price;
	}

	int getQtyInStock() {
		return qtyInStock;
	}

	void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}

	

	String getAuthor() {
		return " Author Name: "+author.name+"\n Email: "+author.email+"\n Gender: "+author.gender;
	}

	String getAlldetails() {
		return " Book name: " + name + "\n price: "+ price + "\n" + getAuthor() + "\n qtyInStock: " + qtyInStock ;
	}
	}

class Books{
	public static void main (String[] args) {
	    
		Author author = new Author("AH","geekyauthor@gmail.com",'M');
		Book book = new Book("java",author,174,334);
		System.out.println(book.getAlldetails());
	}
}
