/*
 * Дан массив {0,5,2,4,7,1,3,19}. Написать программу для
 * подсчета нечетных цифр в нем
 */
package com.ua.lesson5.hometask;

public class Level1Ex1 {

	public static void main(String[] args) {
			int a[] = { 0, 5, 2, 4, 7, 1, 3, 19, 21 };
			int count = 0;

			for (int i = 0; i < a.length; i++) {
				if (a[i] % 2 != 0) {
					count++;
				}
			}
			System.out.println(count);

		}

	}