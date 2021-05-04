/*
 * Существует массив {1, 2, 3, 4, 5}. Размер массива может быть произвольным.
 * Напишите программу, которая выведет на экран все возможные комбинации из этих цифр.
 * Повторений быть не должно
 */
package com.ua.lesson6.hometask;

import java.util.Scanner;

public class Level2Ex3 {

	public static void main(String[] args) {
		
		System.out.println("Введите размер массива:");
		int a = new Scanner(System.in).nextInt();
		
		System.out.println("Число возможных перестановок: " + combinations(a));
	}
	
	public static long combinations(int x) {
		long result = 1;
		for (int i = 1; i <= x; i++) {
			result *= i;
			if(result < 0) {
				System.out.println("Переменная переполнена!");	//	Как тут сделать BigInteger 
				System.exit(x);
			}
		}
		return result;
	}
}