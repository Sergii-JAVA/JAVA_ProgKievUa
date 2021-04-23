/*
 * Есть круг с центром в начале координат и радиусом 4.
 * Пользователь вводит с клавиатуры точки х и у.
 * Написать программу, которая определит лежит ли эта точка
 * внутри круга или нет.
 */
package com.ua.lesson3.hometask;

import java.util.Scanner;

public class Level2_ex1 {

	public static void main(String[] args) {
		double x;
		double y;
		double r = 4;
		double h;	//	Гипотенуза треугольника с началом в начале координат,
					//	а концом в введенной точке
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Последовательно введите координаты для проверки.");
		System.out.println("Введите координату х:");
		x = sc.nextDouble();
		System.out.println("Введите координату y:");
		y = sc.nextDouble();
		
		h = Math.sqrt(x*x + y*y);
		
		if (h <= r) {
			System.out.println("Введенная точка принадлежит кругу.");
		} else {
			System.out.println("Введенная точка не принадлежит кругу.");
		}
	}

}
