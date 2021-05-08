/*
 * Вовочка сидя на уроке писал подряд одинаковые числа.
 * Когда Марья Ивановна забрала у него тетрадь,
 * там было несколько рядов чисел.
 * Напишите программу которая определит минимальное число,
 * которое писал Вовочка например:
 * 11111111=>1
 * 12121212=>12
 * 121121121=>121
 */
package com.ua.lesson7.hometask;

import java.util.Scanner;

public class Level2Ex3 {

	public static void main(String[] args) {
		System.out.println("Input number: ");
		String line = new Scanner(System.in).nextLine();
		// String line = "111112";
		String result = String.valueOf(line.charAt(0));

		for (int i = 1, stop = 0; i < line.length(); i++) {

			if (stop != 0) {
				break;
			}

			try {
				for (int j = 0; j < line.length(); j += result.length()) {
					String tmp = line.substring(j, i + j);

					if (!(result.equals(tmp))) {
						result += String.valueOf(line.charAt(i));

						if (0 != line.length() % result.length() && result.length() > line.length() / 2) {
							result += line.substring(result.length(), line.length());
							stop++;
						}
						break;
					}

					double a = line.length() % tmp.length();
					int b = line.length() - j;
					if (a == 0 && b == tmp.length()) {
						stop++;
						break;
					}
				}
			} finally {
				System.out.println("Вы вышли за пределы массива. Последовательность - нерегулярная.");
				System.exit(stop);
			}
		}
		System.out.println(result);
	}
}
