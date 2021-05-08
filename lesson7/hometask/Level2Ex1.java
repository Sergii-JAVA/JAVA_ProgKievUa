/*
 * Ввести с консоли дату. Сравнить ее с текущей датой в системе.
 * Вывести отличающиеся части (год, месяц) на экран.
 * 
 * Можно было бы сделать и из Date, но там много deprecated
 */
package com.ua.lesson7.hometask;

import java.util.Calendar;
import java.util.Scanner;

public class Level2Ex1 {

	public static void main(String[] args) {
		System.out.println("Введите дату в формате DD:MM:YYYY"); // По строке почему то не разбивает
		Scanner sc = new Scanner(System.in);
		String inputDateLine = sc.nextLine();
		String[] arrInputStr = inputDateLine.split(":");
		int[] arrInputInt = new int[arrInputStr.length];

		for (int i = 0; i < arrInputInt.length; i++) {
			arrInputInt[i] = Integer.parseInt(arrInputStr[i]);
		}

		Calendar calInput = Calendar.getInstance();
		calInput.set(Calendar.DAY_OF_MONTH, arrInputInt[0]);
		calInput.set(Calendar.MONTH, arrInputInt[1] - 1);
		calInput.set(Calendar.YEAR, arrInputInt[2]);

		Calendar cal = Calendar.getInstance();

		boolean day = compareDate(calInput.get(Calendar.DAY_OF_MONTH), cal.get(Calendar.DAY_OF_MONTH));
		boolean month = compareMonth(calInput.get(Calendar.MONTH), cal.get(Calendar.MONTH));
		boolean year = compareYear(calInput.get(Calendar.YEAR), cal.get(Calendar.YEAR));

		if (day == month == year == true) {
			System.out.println("Введенная и текущая даты - совпадают.");
		}
	}

	public static boolean compareDate(int x, int y) {
		boolean a;
		if (x != y) {
			a = false;
			System.out.println("Введенное число не соответствует текущему." + " Введенное: " + x + ". Текущее: " + y);
		} else {
			a = true;
		}

		return a;
	}

	public static boolean compareMonth(int x, int y) {
		boolean a;
		if (x != y) {
			a = false;
			System.out.println("Введенный месяц не соответствует текущему." + " Введенный: " + x + ". Текущее: " + y);
		} else {
			a = true;
		}

		return a;
	}

	public static boolean compareYear(int x, int y) {
		boolean a;
		if (x != y) {
			a = false;
			System.out.println("Введенная число не соответствует текущему." + " Введенное: " + x + ". Текущее: " + y);
		} else {
			a = true;
		}

		return a;
	}
}
