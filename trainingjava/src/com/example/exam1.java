package com.example;

public class exam1 extends exam2 {
	String name = "スーパーヒーロー";
	boolean flying;
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった");
	}
	public void land() {
		this.flying = false;
		System.out.println("着地した");
	}
	public void run() {
		System.out.println(this.name + "は撤退した");
	}
}