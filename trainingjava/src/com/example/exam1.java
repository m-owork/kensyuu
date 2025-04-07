package com.example;

public class exam1 extends exam2 {
	boolean flying;
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった");
	}
	public void land() {
		this.flying = false;
		System.out.println("着地した");
	}
}