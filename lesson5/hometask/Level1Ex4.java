/*
 * ¬ведите строку текста с клавиатруры.
 * –еализуйте программу дл€ возможности подсчета количества
 * символа 'b' в этой строке.
 * –езультат вывести на экран
 */
package com.ua.lesson5.hometask;

import java.util.Scanner;

public class Level1Ex4 {

	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¬ведите строку текста на английском языке:");
		String str = sc.nextLine();
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'b') {
				count ++;
			}
		}
		
		System.out.println();

		System.out.println("—имвол " + "b" + " встречаетс€ в "
							+ "введенном тексте " +	count + " раз");

	}

}
