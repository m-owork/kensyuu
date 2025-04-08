package com.example;

public class exam1 extends exam2 {
	String makerName;
public exam1 (String name, int price, String color, String makerName) {
	super(name, price, color);
	this.makerName = makerName;
}
public String getMakerName() { return this.makerName; }
}