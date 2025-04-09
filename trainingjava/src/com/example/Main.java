package com.example;

public class Main {
	public static void main(String[] args) {
		exam2 h = new exam2();
		App a = new App();
		exam1 w = new exam1();
		
		a.heal(h);
		System.out.println(h.getName() + "はヒールを使った");
}
}
