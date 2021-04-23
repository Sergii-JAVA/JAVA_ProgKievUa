/*
 * ����������� ���������� ������ �����, ����� ����� ����� ���� ��� ������ ������ ������.
 * ����: a, b, c - ������� ��������������� ������������. �������� ���������, �������
 * ������, ���������� ����� ����������� ��� ���.
 */
package com.ua.lesson3.hometask;

import java.util.Scanner;

public class Level1_ex4 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;

		// � ������� �� �������, ��� ����� ���-�� ����-�� ������� � ��������.
		// ��� ������� ��������� ��� ���������� ������ ��������� � ��������
		// ����������.

		Scanner sc = new Scanner(System.in);

		System.out.println("������������ ������������ ������" + "��������������� ��� ������� ������������");
		System.out.println("������� ����� ������� ������� ������������:");
		a = sc.nextDouble();
		System.out.println("������� ����� ������ ������� ������������:");
		b = sc.nextDouble();
		System.out.println("������� ����� ������� ������� ������������:");
		c = sc.nextDouble();

		if (a > 0 || b > 0 || c > 0) {
			if ((a + b) > c || (a + c) > b || (b + c) > a) {
				System.out.println("����� ����������� ����������.");
			}
			System.out.println("������ ������������ �� ����������.");
		} else {
			System.out.println("��������� �������� ������ ����.");
		}
	}

}
