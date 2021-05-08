/*
 * Выведите на экран 10 строк со значением числа Пи. Причем в первой
 * строке должно быть 2 знака после запятой, во второй 3, в третьей 4 и т.д.
 */
package com.ua.lesson7.hometask;

public class Level1Ex4 {

	public static void main(String[] args) {
		double a = Math.PI;

		for (int i = 2; i < 11; i++) {
			System.out.printf("%." + i + "f\n", a);
		}

	}

}
