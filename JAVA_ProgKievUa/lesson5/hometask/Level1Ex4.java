/*
 * Введите строку текста с клавиатруры.
 * Реализуйте программу для возможности подсчета количества
 * символа 'b' в этой строке.
 * Результат вывести на экран
 */
package lesson5.hometask;

import java.util.Scanner;

public class Level1Ex4 {

	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите строку текста на английском языке:");
		String str = sc.nextLine();
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'b') {
				count ++;
			}
		}
		
		System.out.println();

		System.out.println("Символ " + "b" + " встречается в "
							+ "введенном тексте " +	count + " раз");
	}

}
