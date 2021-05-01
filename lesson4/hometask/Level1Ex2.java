/*
 * Вычислить с помощью цикла факториал числа n, введенного с клавиатуры
 * (4<n<16)
 */
package com.ua.lesson4.hometask;

import java.util.Scanner;

public class Level1Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите целое положительное число "
				+ "от 4-x до 16-ти включительно:");
		int num = sc.nextInt();
		int f = 1;
		
		if (num > 4 & num < 16) {
			for (int i = 0; i <= num - 1; i++) {
				f = f * (num - i);
			}
		} else {
			System.out.println("ОШИБКА! Введенное число не соответствует требуемому"
					+ " диапазону!");
		}
		System.out.println("Факториал числа " + num + " равен " + f);
	}
}