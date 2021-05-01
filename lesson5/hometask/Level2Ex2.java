/*
 * Ќаписать код дл€ зеркального переворота массива (7, 2, 9, 4) -> (4, 9, 2, 7).
 * ћассив может быть произвольной длинны.
 * ѕри выполнении задани€ использовать дополнительный массив нельз€.
 */
package lesson5.hometask;

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

		/* ѕосмотрим, что получилось */
		System.out.println(Arrays.toString(array));

		/* ќтражаем массив */
		System.out.println();
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
	}
}