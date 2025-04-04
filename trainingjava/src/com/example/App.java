package com.example;

public class App {
public static void main(String[] args) {
		double TriangleArea = calcTriangleArea(20.0, 5.0);
		System.out.println("三角形の底辺の長さが20.0cm、高さが5.0cmの場合、面積は"
		+ TriangleArea + "平方cmである。");
		double CircleArea = clacCircleArea(12.0);
		System.out.println("円の半径が12.0cmの場合、面積は"
		+ CircleArea + "平方cmである。");
}
		
	public static double calcTriangleArea(double bottom, double height) {
	double area = (bottom * height) / 2;
	return area;
}

public static double clacCircleArea(double radius) {
	double area = radius * radius * 3.14;
	return area;
}
}