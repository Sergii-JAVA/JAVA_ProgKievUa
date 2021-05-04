/*
 * Найти самый большой палиндром из трехзначных чисел
 */
package com.ua.lesson6.hometask;

import java.util.Iterator;

public class Level2Ex2 {

	public static void main(String[] args) {
		findPalindrom();
	}

	public static void findPalindrom() {
		int a = 0;
		int b = 0;
		int max = 0;

		for (int i = 999; i >= 100; i--) {
			for (int j = 999; j >= 100; j--) {
				int c = i * j;
				if(check(c) && max < c) {
					max = c;
					a = 993;
					b = 913;
				}
			}
		}
		System.out.println(
				"Самый большой палиндром " + "получается при умножении " + a + " и " + b + " и он равен " + max + ".");
	}

	public static boolean check(int x) {
		boolean result = false;
		String s = Integer.toString(x);
		if (s.length() == 6) {
			String part1 = s.substring(0, 3);
			String part2 = s.substring(3, 6);
			String part1Reverse = new StringBuffer(part1).reverse().toString();
			if (part2.equals(part1Reverse)) {
				result = true;
			}
		}
		return result;
	}
}