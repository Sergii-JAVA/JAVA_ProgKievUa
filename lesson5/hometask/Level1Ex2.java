/*
 * Написать код для возможности создания массива целых чисел
 * (размер вводится с клавиатуры) и возможности заполнения каждого
 * элемента вручную. Выведите этот массив на экран
 */
package lesson5.hometask;

import java.util.Scanner;

public class Level1Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Введите размер массива:");
		int i = sc.nextInt();
		
		int[] array = new int [i];
		
		for (int j = 0; j < array.length; j++) {
			System.out.println("Введите значение " + j + "-го элемента массива:");
			int a = sc.nextInt();
			array[j] = a;
		}
		System.out.println("Введенный массив:");
		System.out.print("{ ");
		for (int j = 0; j < array.length; j++) {
			System.out.print(array[j] + " ");
		}
		System.out.println("}");
	}

}
