package com.example;

public class exam1 extends exam2 {
	String name = "スーパーヒーロー";
	boolean flying;
	public void fly() {
		this.flying = true;
		System.out.println(this.name + "は飛び上がった");
	}
	public void land() {
		this.flying = false;
		System.out.println(this.name + "は着地した");
	}
	public void run() {
		System.out.println(this.name + "は撤退した");
	}
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃");
		m.hp -= 5;
		System.out.println("5ポイントのダメージを与えた");
		if (this.flying) {
			System.out.println(this.name + "の飛翔攻撃");
			m.hp -= 5;
			System.out.println("更に5ポイントのダメージを与えた");
	}
	}
}