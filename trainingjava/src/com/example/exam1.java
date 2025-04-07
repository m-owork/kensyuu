package com.example;
import java.util.Random;

public class exam1 {
	String name;
	int hp = 50;
	final int MAXHP = 50;
	int mp = 10;
	final int MAXMP = 10;
	
	public void heal() {
		System.out.println(this.name + "はヒールを唱えた");
		this.mp -= 5;
		this.hp = this.MAXHP;
		System.out.println(this.name + "のHPが最大まで回復した");
	}
		
	public void pray(int sec) {
		System.out.println(this.name + "は" + sec + "秒の間、天に祈りをささげた");
		int recover = new Random().nextInt(3) + sec;
		int recoverActual = Math.min(this.MAXMP - this.mp, recover);
		this.mp += recover;
		System.out.println(this.name + "のMPが" + recoverActual + "回復した");
		
}
}
