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
			int b = x / 10 % 10;
			int c = x / 100 % 10;
			int d = x / 1000 % 10;
			int e = x / 10000 % 10;
			int f = x / 100000 % 10;
				
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
