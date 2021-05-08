/*
 * ¬вести с консоли число в бинарном формате. ѕеревести его в
 * дес€тичный и вывести на экран (У10Ф -> 2).
 */
package com.ua.lesson7.hometask;

import java.util.Scanner;

public class Level1Ex3 {

	public static void main(String[] args) {
		System.out.println("¬ведите число в бинарном формате (не больше 32" + " знаков):");
		String binary = new Scanner(System.in).nextLine();

		int num = Integer.parseInt(binary, 2);

		System.out.println(num);
	}
}