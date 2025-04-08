package com.example;

public class App extends exam2 {
	String isbn;
	public App(String name, int price, String color, String isbn) {
		super(name, price, color);
		this.isbn = isbn;
		}
	public String getIsbn() { return this.isbn; }
}