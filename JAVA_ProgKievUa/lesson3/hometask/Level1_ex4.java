/*
 * Треугольник существует только тогда, когда сумма любых двух его сторон больше третей.
 * Дано: a, b, c - стороны предполагаемого треугольника. Напишите программу, которая
 * укажет, существует такой треугольник или нет.
 */
package com.ua.lesson3.hometask;

import java.util.Scanner;

public class Level1_ex4 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;

		// В задании не сказано, что нужно что-то куда-то вводить и выводить.
		// Эти функции добавлены для корректной работы программы и проверки
		// результата.

		Scanner sc = new Scanner(System.in);

		System.out.println("Пользователю предлагается ввести" + "последовательно три стороны треугольника");
		System.out.println("Введите длину перввой стороны треугольника:");
		a = sc.nextDouble();
		System.out.println("Введите длину второй стороны треугольника:");
		b = sc.nextDouble();
		System.out.println("Введите длину третьей стороны треугольника:");
		c = sc.nextDouble();

		if (a > 0 || b > 0 || c > 0) {
			if ((a + b) > c || (a + c) > b || (b + c) > a) {
				System.out.println("Такой треугольник существует.");
			}
			System.out.println("Такого треугольника не существует.");
		} else {
			System.out.println("Введенное значение меньше нуля.");
		}
	}

}
