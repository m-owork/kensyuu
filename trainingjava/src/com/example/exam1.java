package com.example;

public class exam1 {
	private String name;
	private double power;
	
public String getWandName() {
	return this.name;
}
public void setWandName(String name) {
	if (name == null || name.length() <3) {
		throw new IllegalArgumentException("杖に設定されようとしている名前が異常です");
	}
	this.name = name;
	}
public double getPower() {
	return this.power;
}
public void setPower(double power) {
	if(power < 0.5 || power > 100) {
		throw new IllegalArgumentException("杖に設定されようとしている魔力が異常です");
	}
	this.power = power;
}
}