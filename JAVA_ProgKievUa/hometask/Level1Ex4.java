package com.ua.lesson4.hometask;

import java.util.Scanner;

public class Level1Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите высоту прямоугольника:");
		int h = sc.nextInt();
		System.out.println("Введите ширину прямоугольника:");
		int w = sc.nextInt();
		
		if (w != 0 | h != 0) {
			for (int i = 1; i <= h; i++) {
				for (int j = 1; j <= w; j++) {
					if (i == 1 | i == h) {
						System.out.print("*");
					} else if(j == 1 || j == w){
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		} else {
			System.out.println("ОШИБКА! Такого прямоугольника не существует!");
		}
	}

}
