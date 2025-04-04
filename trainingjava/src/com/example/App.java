package com.example;

public class App {
public static void main(String[] args) {
	String title = "お問い合わせの件について";
	String address = "nantoka@kantoka.com";
	String text = "お問い合わせいただき誠にありがとうございます。";
	email(title, address, text);
	}
	public static void email(String title, String address, String text) {
		System.out.println("メールの宛先アドレスに以下のメールを送信しました");
		System.out.println("件名:" + title);
		System.out.println("本文:" + text);
		
	}
}
