/*
 * Написать программу, которая считает 4 числа с клавиатуры и выведет на экран самое
 * из них
 */
package com.ua.lesson3.hometask;

import java.util.Scanner;

public class Level1_ex1 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = 1;
		int b = 0;
		int c = 0;
		int d = 0;
		int max = 0;
		
		System.out.println("В данной программе пользователю предлагается ввести четыре"
				+ "различных числа и программа выведет максимальное из введенных");
		System.out.println();
		
		//	Не знаю, как объединить проверки при разных вопросах. Не хочется запрашивать
		//	что-то типа "Ввведите последовательно..."
		System.out.println("Введите первое целое число в интервале от -2147483648 до 2147483647:");
		if(sc.hasNextInt()) {
			a = sc.nextInt();
		} else {
			System.out.println("Ошиибка ввода данных.");
			System.exit(1);
		}
		System.out.println("Введите второе целое число в интервале от -2147483648 до 2147483647::");
		if(sc.hasNextInt()) {
			b= sc.nextInt();
		} else {
			System.out.println("Ошиибка ввода данных.");
			System.exit(1);
		}
		System.out.println("Введите третье целое число в интервале от -2147483648 до 2147483647::");
		if(sc.hasNextInt()) {
			c = sc.nextInt();
		} else {
			System.out.println("Ошиибка ввода данных.");
			System.exit(1);
		}
		System.out.println("Введите четвертое целое число в интервале от -2147483648 до 2147483647::");
		if(sc.hasNextInt()) {
			d = sc.nextInt();
		} else {
			System.out.println("Ошиибка ввода данных.");
			System.exit(1);
		}
		
		//	Проверка на равенство
		if(a == b || a == c || a == d || b == c || b == d || c == d) {
			System.out.println("Дальнейшее выполнение программы невозможно из-за равенства значений");
			System.exit(1);
		}
		
		// Хотел сделать через тернарный оператор - не получилось почему-то
		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		if (max > c) {
			max = c;
		} else {
			max = d;
		}
		
		
		
		System.out.println("Наибольшее целое число, среди введенных " + max);
	}

}
