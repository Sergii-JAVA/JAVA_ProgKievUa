/*
 * Проверить, является ли четырехзначное число счастливым билетом.
 * Дано четырехзначное число. Проверить, является ли оно "счастливым билетом".
 * Примечание: счастливым билетом называется число, в котором - при четном
 * количестве цифр в числе сумма цифр его левой половины равна сумме цифр его
 * правой половины.
 */
package com.ua.lesson3.hometask;

import java.util.Scanner;

public class Level2_ex3 {

	public static void main(String[] args) {
		int userNumber;

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите натуральное, положительное, четырехзначное число:");
		userNumber = sc.nextInt();

		if (userNumber > 999 && userNumber < 9999) {
			
			// Выделяем цифры поразрядно из введенного числа
			int a = userNumber % 10;
			int b = userNumber / 10 % 10;
			int c = userNumber / 100 % 10;
			int d = userNumber / 1000 % 10;
			
			if ((a + b) == (c + d)) {
				System.out.println("Введенное число - счастливое!");
			} else {
				System.out.println("Введенное число - несчастливое.");
			}
		} else {
			System.out.println("ОШИБКА! Введеное число выходит за предельные значения.");
		}
	}

}
