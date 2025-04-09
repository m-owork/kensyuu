package com.example;

public class App {
	private int hp;
	private int mp;
	private String name;
	private exam1 wand;
	public void heal(exam2 h) {
		int basePoint = 10;
		int recovPoint = (int)(basePoint * this.getWand().getPower());
		h.setHp(h.getHp() + recovPoint);
		System.out.println(h.getName() + "のHPを" + "ポイント回復した");
	}
	public int getHP() { return this.hp; 
	}
	public void setHp(int hp) {
	if (hp < 0) {
		this.hp = 0;
	} else {
		this.hp = hp;
	}
	}
	public int  getMp() { return this.mp;
	}
	public void setMp(int mp) { this.mp = mp;
		if (mp < 0) {
			throw new IllegalArgumentException("設定されようとしているMPが異常です");
		}
		this.mp = mp;
	}
	public String getName(String name) {return this.name;
	}
	public void setName(String name) { this.name = name;
		if (name == null || name.length() < 3) {
			throw new IllegalArgumentException("魔法使いに設定されようとしている名前が異常です");
		}
		this.name = name;
	}
	public exam1 getWand() { return this.wand;
	}
	public void setWand(exam1 wand) { this.wand = wand;
	if (wand == null) {
		throw new IllegalArgumentException("設定されようとしている杖がありません");
	}
	this.wand = wand;
	}
}