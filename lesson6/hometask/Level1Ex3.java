/*
 * Реализуйте метод, рисующий на экране прямоугольник из звездочек "*"
 * Его параметрами будут целые числа, которые описывают длину и ширину
 * такого прямоугольника
 */
package com.ua.lesson6.hometask;

import java.util.Scanner;

public class Level1Ex3 {

	public static void main(String[] args) {
		System.out.println("Введите ширину прямоугольника:");
		int a = new Scanner(System.in).nextInt();
		System.out.println("Введите высоту прямоугольника:");
		int b = new Scanner(System.in).nextInt();
		
		drawRectangle(a, b);
	}
	public static void drawRectangle(int x, int y) {
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
