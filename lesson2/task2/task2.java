package com.ua.lesson2.task2;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ����� 1-�� ������� ������������ (��):");
		double a = sc.nextDouble();
		System.out.println("������� ����� 2-�� ������� ������������ (��):");
		double b = sc.nextDouble();
		System.out.println("������� ����� 3-�� ������� ������������ (��):");
		double c = sc.nextDouble();
		
		double p = a + b + c;
		
		double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		
		System.out.println("������� ������������ �����: " + p);
	}

}
