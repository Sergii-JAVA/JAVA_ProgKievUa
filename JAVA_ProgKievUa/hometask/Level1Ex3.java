/*
 * Напечатать таблицу умножения на 5. Предпочтительно печатать
 * в следующем виде:
 *  1 х 5 = 5,
 *  2 х 5 = 10
 */
package com.ua.lesson4.hometask;

public class Level1Ex3 {

	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			System.out.println(i + " х 5" + " = " + (i * 5));
		}
	}
}