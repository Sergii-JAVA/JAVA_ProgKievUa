/*
 * ���������� �����, ����������� �������� �������� - ����� �����,
 * ������������ ����� � ������. ���������� �� ������������ ������
 * � ������ ������������� � ������ �����
 */
package com.ua.lesson6.hometask;

import java.util.Scanner;

public class Level1Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner str = new Scanner(System.in);
		
		System.out.println("������� ����� �����:");
		int intDigit = sc.nextInt();
		System.out.println("������� ������������ �����:");
		double doubleDigit = sc.nextDouble();
		System.out.println("������� ������:");
		String Line = str.nextLine();
		
		System.out.println();
		System.out.println(concat(intDigit, doubleDigit, Line));
	}

	public static String concat(int x, double y, String s) {
		double b = x + y;
		String c = Double.toString(b);
		String a = s + " " + c;
		return a;
	}
}
