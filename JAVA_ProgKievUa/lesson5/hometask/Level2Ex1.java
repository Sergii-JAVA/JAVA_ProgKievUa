/*
 * "ѕеревернуть массив". “.е. написать программу, котора€ повернет
 * базовый массив на 90, 180 и 270 градусов по часовой стрелке.
 * (ѕри выполнении задани€ использовать дополнительный массив - запрещено)
 */
package src.com.ua.lesson5.hometask;

import java.util.Scanner;

public class Level2Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/* —оздание базового массива */
		System.out.println("ѕрограмма работает только с квадратными массивами.");
		System.out.println("¬ведите размер двумерного массива:");
		int rows = sc.nextInt();
		int columns = rows;
		int[][] array = new int[rows][columns];

		/* «аполнение массива значени€ми */
		int count = 1;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				array[i][j] = count;
			}
			count++;
		}

		/* ¬ывести базовый массив на экран */
		System.out.println("Ѕазовый массив:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();

		}

		/* ѕовернуть массив на 90 градусов по часовй стрелке */
		System.out.println();
		System.out.println("ѕовернутый на 90 градусов по часовой стрелке массив:");
		for (int i = 0; i < rows; i++) {
			for (int j = columns; j > 0; j--) {
				System.out.print(j);
			}
			System.out.println();
		}

		/* ѕовернуть базовый массив на 180 градусов по часовой стрелке */
		System.out.println();
		System.out.println("ѕовернутый на 180 градусов по часовой стрелке массив:");
		for (int i = rows - 1; i >= 0; i--) {
			for (int j = 0; j < columns; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}

		/* ѕовернуть базовый массив на 270 градусов по часовой стрелке */
		System.out.println();
		System.out.println("ѕовернутый на 270 градусов по часовой стрелке массив:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				int temp = array[j][i];
				System.out.print(temp);
			}
			System.out.println();
		}
	}
}
