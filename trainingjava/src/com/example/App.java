package com.example;

public class App {
public static void printArray(int[] array) {
	for (int element : array) {
		System.out.println(element);
	}
}
public static void main(String[] args) {
	int[] array = {1, 2, 3};
	printArray(array);
	}
}