package com.example;

public class App {
public static void main(String[] args) {
Hero h = new Hero();
h.name = "ユーシャ";
h.hp = 100;

exam1 c = new exam1();
c.name = "クレリック";


Matango m1 = new Matango();
m1.hp = 50;
m1.suffix = 'A';

Matango m2 = new Matango();
m2.hp = 48;
m2.suffix = 'B';

System.out.println("お化けキノコAが現れた！お化けキノコBが現れた！");
h.slip();
m1.run();
m2.run();
c.heal();
c.pray(5);
h.run();
}
}