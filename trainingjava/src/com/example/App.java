package com.example;

public class App {
    public static void main(String[] args) {
    	add(100, 20);
    	add(200, 90);
    }
    public static void add(int x, int y) {
    	int answer = x + y;
    	System.out.println(x + "+" + y + "=" + answer);
    }
    }