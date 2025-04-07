package com.example;

public class Hero {
	String name;
	int hp;
	//public void attack() {
	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は眠ってHPを回復した");
}
	public void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name +"は、" + sec + "秒座った");
		System.out.println("HPが" + sec + "ポイント回復した");
	}
	public void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は、転んでしまった");
		System.out.println("5のダメージを受けた");
	}
	public void run() {
		System.out.println(this.name + "は、逃げ出した");
		System.out.println("GameOver");
		System.out.println("最終HPは" + this.hp + "に終わった");
	}
	}

