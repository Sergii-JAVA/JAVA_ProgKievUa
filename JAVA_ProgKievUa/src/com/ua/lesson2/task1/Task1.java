package com.ua.lesson2.task1;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите 5-ти значное число: ");
		int x = sc.nextInt();
		int a = x / 10000;
		int b = x % 10000 /1000;
		int c = x % 1000 / 100;
		int g = x % 100 / 10;
		int h = x % 10 / 1;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(g);
		System.out.println(h);
	}

}
