/*
 * Определить количество дней в году, который вводит пользователь. В высокосном году - 366 дней,
 * тогда как в обычном - 365.
 * Высокосный год определяется по следующему правилу:
 * Год является высокосным, если он делится на 4 без остатка, но если он делится на 100
 * без остатка, то это не высокосный год. Однако, если он делится без остатка на 400 - 
 * то это высокосный год
 */
package com.ua.lesson3.hometask;

import java.util.Scanner;

public class Level1_ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Введите год:");
		int yearNumber = sc.nextInt();
		
		if (yearNumber % 4 == 0 && (yearNumber % 400 == 0 || yearNumber % 100 != 0) ) {
			System.out.println("В введенном году 366 дней. Он высокосный.");
		} else {
			System.out.println("В веденном году 365 дней. Он не высокосный");
		}
	}

}
