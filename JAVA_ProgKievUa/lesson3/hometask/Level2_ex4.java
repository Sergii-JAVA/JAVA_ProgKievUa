/*
 * � ���������� �������� ������������ �����.
 * ���������, �������� �� ��� �����������.
 */
package com.ua.lesson3.hometask;

import java.util.Scanner;

public class Level2_ex4 {

	public static void main(String[] args) {
		System.out.println("������� ������������ ������������� ����� �����:");
		int x = new Scanner(System.in).nextInt();
		
		if (x < 999999 && x > 100000) {
			//	�������� ����� ���������� �� ���������� �����
			int a = x % 10;
			System.out.println("a = " + a);
			int b = x / 10 % 10;
			System.out.println("b = " + b);
			int c = x / 100 % 10;
			System.out.println("c = " + c);
			int d = x / 1000 % 10;
			System.out.println("d = " + d);
			int e = x / 10000 % 10;
			System.out.println("e = " + e);
			int f = x / 100000 % 10;
			System.out.println("f = " + f);
			
			if (a == f & b == e & c == d) {
				System.out.println("��������� ����� - ���������.");
			} else {
				System.out.println("��������� ����� - �� ���������.");
			}

		} else {
			System.out.println("������! ��������� ����� �� ������������� �������");
		}
	}

}
