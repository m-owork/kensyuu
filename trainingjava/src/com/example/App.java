package com.example;

public class App {
    public static void main(String[] args) {
int[] moneyList = {121902, 8302, 55100};
for (int i = 0; i < moneyList.length; i++) {
	System.out.println(moneyList[i]);
}
for (int mL : moneyList) {
	System.out.println(mL);
}
    }
}