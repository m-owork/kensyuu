package com.example;

public class App {
    public static void main(String[] args) {
    	boolean doorClose = true;
    	while (doorClose == true) {
    		System.out.println("ノックする");
    		System.out.println("1分待つ");
    		if (doorClose != true) {
    			System.out.println("ドアを開ける");
    		}
    	}
    }
    	}
