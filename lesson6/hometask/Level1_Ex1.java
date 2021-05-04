/*
 * Напишите метод, который вернет максимальное число из
 * массива целых чисел
 */
package com.ua.lesson6.hometask;

public class Level1_Ex1 {

	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 150, 658, 65, 10, 15 };
		System.out.println("Максимальное число в массиве: " + max(array));
	}

	public static int max(int[] arr) {
		int a = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > a) {
				a = arr[i];
			} 
		}
		return a;
	}
}
