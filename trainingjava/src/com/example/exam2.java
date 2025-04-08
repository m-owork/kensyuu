package com.example;

public abstract class exam2 {
	String name;
	int price;
	String color;
	
	public exam2(String name, int price, String color) {
		this.name = name;
		this.price = price;
		this.color = color;
	}
	public String getName() { return this.name; }
	public int getPrice() { return this.price; }
	public String getColor() { return this.color; }
	}