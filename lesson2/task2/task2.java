package com.ua.lesson2.task2;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите длину 1-ой стороны треугольника (см):");
		double a = sc.nextDouble();
		System.out.println("¬ведите длину 2-ой стороны треугольника (см):");
		double b = sc.nextDouble();
		System.out.println("¬ведите длину 3-ей стороны треугольника (см):");
		double c = sc.nextDouble();
		
		double p = a + b + c;
		
		double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		
		System.out.println("ѕлощадь треугольника равна: " + p);
	}

}
