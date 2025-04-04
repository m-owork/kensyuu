package com.example;

public class App {
public static int add (int x, int y) {
	return x + y;
}
public static double add(double x, double y) {
	return x + y;
}
public static String add(String x, String y) {
	return x + y;
}
public static void main(String[] args) {
	System.out.println(add(10, 30));
	System.out.println(add(5.8, 4.2));
	System.out.println(add("こんにちは", "いいお天気ですね"));
	
}
}