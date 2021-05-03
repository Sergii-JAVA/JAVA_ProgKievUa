/*
 * Ќаписать код дл€ зеркального переворота массива (7, 2, 9, 4) -> (4, 9, 2, 7).
 * ћассив может быть произвольной длинны.
 * ѕри выполнении задани€ использовать дополнительный массив нельз€.
 */

package com.ua.lesson5.hometask;

import java.util.Arrays;
import java.util.Scanner;

public class Level2Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите длину массива:");
		int a = sc.nextInt();

		/* —оздаем одномерный массив пользовательской длины */
		int[] array = new int[a];

		/* «аполним массив произвольными данными дл€ проверки результата */
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (10 * Math.random());
		}

		/* ѕосмотрим, что мы создали */
		System.out.println(Arrays.toString(array));

		/* ќтражаем массив */
		System.out.println();
		int n = array.length;

		for (int i = 0; i < n / 2; i++) {
			int temp = array[n - i - 1];
			array[n - i - 1] = array[i];
			array[i] = temp;
		}
		System.out.print(Arrays.toString(array));

	}

}
