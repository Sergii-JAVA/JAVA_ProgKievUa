/*
 * Напишите метод, который вернет количество слов
 * в строке текста
 */
package com.ua.lesson6.hometask;

import java.util.Scanner;

public class Level1Ex5 {

	public static void main(String[] args) {
		System.out.println("Введите строку:");
		String a = new Scanner(System.in).nextLine();

		System.out.println("В полученной строке: " + words(a) + " слов.");
	}

	public static int words(String text) {
		int count = 1;
		if (text.endsWith(" ")) {
			text = text.substring(0, text.length() - 1);
		}
		System.out.println(text);
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == ' ') {
				count++;
			}

		}
		return count;
	}
}
