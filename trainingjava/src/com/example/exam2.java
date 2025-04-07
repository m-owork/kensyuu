package com.example;

public class exam2 {
	String name = "ヒーロー";
	int hp = 100;
	
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃");
		m.hp -= 5;
		System.out.println("5ポイントのダメージを与えた");
	}
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}
}