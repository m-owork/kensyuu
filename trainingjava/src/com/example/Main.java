package com.example;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("なまえ");
		names.add("なまえ2");
		names.add("なまえ3");
		Iterator<String> it = names.iterator();
		while (it.hasNext()) {
			String e = it.next();
			System.out.println(e);
		}
	}
}