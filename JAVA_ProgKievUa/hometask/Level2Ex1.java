/*
 * "Перевернуть массив". Т.е. написать программу, которая повернет
 * базовый массив на 90, 180 и 270 градусов по часовой стрелке.
 * (При выполнении задания использовать дополнительный массив - запрещено)
 */
package lesson5.hometask;

import java.util.Scanner;

public class Level2Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		final String ANSI_RESET = "\u001B[0m";
//		final String ANSI_RED = "\u001B[31m";

		/* Создание базового массива */
		System.out.println("Введите количество строк двумерного массива:");
		int rows = sc.nextInt();
		System.out.println("Введите количество столбцов двумерного массива:");
		int columns = sc.nextInt();
		int[][] array = new int[rows][columns];

		/* Заполнение массива значениями */
		int count = 1;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				array[i][j] = count;
			}
			count++;
		}

		/* Вывести базовый массив на экран */
		System.out.println("Базовый массив:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();

		}

		/* Повернуть массив на 90 градусов по часовй стрелке */
		System.out.println();
		System.out.println("Повернутый на 90 градусов по часовой стрелке массив:");
		for (int i = 0; i < rows; i++) {
			for (int j = columns; j > 0; j--) {
				System.out.print(j);
			}
			System.out.println();
		}

		/* Повернуть базовый массив на 180 градусов по часовой стрелке */
		System.out.println();
		System.out.println("Повернутый на 180 градусов по часовой стрелке массив:");
		for (int i = rows - 1; i >= 0; i--) {
			for (int j = 0; j < columns; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}

		/* Повернуть базовый массив на 270 градусов по часовой стрелке */
		System.out.println();
		System.out.println("Повернутый на 270 градусов по часовой стрелке массив:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				int temp = array[j][i];
				System.out.print(temp);
			}
			System.out.println();
		}
	}
}
