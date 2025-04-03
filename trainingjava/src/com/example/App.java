package com.example;

public class App {
    public static void main(String[] args) {
    	System.out.println("運勢を占おう");
int fortune = new java.util.Random().nextInt(8);
switch (fortune) {
case 8:
	System.out.println("大変良い");
	break;
case 7:
	System.out.println("良い");
	break;
case 6:
	System.out.println("ほどほど良い");
	break;
	default:
		System.out.println("普通");
    }
    }
}