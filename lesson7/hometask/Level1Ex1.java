/*
 * Написать программу, которая вернет поличество миллисекунд
 * прошедших от такого же числа, но в прошлом месяце до текущей
 * даты. Например, если сегодня 3 августа, то необходимо узнать
 * сколько миллисекунд прошло с 3-го июля.
 */
package com.ua.lesson7.hometask;

import java.util.Calendar;
import java.util.Date;

public class Level1Ex1 {

	@SuppressWarnings("deprecation") // Можно было бы использовать
										// другую коллекцию, но решил
										// посмотреть, как работает эта
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println("Текущая дата: \t\t\t" + calendar.getTime());

		if (calendar.getTime().getDay() == 31) {
			System.out.println("В предыдущем месяце нет 31-го числа!");
		} else if (calendar.getTime().getMonth() == Calendar.MARCH) {
			System.out.println("В предыдущем месяце (феврале) числа 30-е и 31-е - отсутствуют!");
		} else {
			int n = -1;
			Calendar calendar1 = Calendar.getInstance();
			calendar1.add(Calendar.MONTH, n);
			System.out.println("Это же число в прошлом месяце: \t" + calendar1.getTime());
			int result = (int) (calendar1.getTimeInMillis() - calendar.getTimeInMillis());
			System.out.println("Разница между текущей датой и этой же датой в " + "прошлом месяце, составит: " + result
					+ " миллисекунд.");
		}
	}
}
