package com.example;

public class App {
public static void main(String[] args) {
Hero h = new Hero();
h.name = "ユーシャ";
h.hp = 100;
System.out.println("新たな勇者" + h.name + "が誕生しました");
h.sit(5);
h.slip();
h.sit(25);
h.run();
}
}