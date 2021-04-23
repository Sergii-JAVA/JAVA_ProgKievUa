/*
 * ��� ����������� � ������������ ������ �(0,0), �(4,4) � �(6,1).
 * ������������ ������ � ���������� ���������� ����� � � �.
 * �������� ���������, ������� ����������, ����� �� ��� �����
 * ������ ������������ ��� ���.
 */
package com.ua.lesson3.hometask;

import java.util.Scanner;

public class Level2_ex2 {

	public static void main(String[] args) {
		double x;
		double y;

		Scanner sc = new Scanner(System.in);

		System.out.println("��������������� ������� ���������� ��� ��������.");
		System.out.println("������� ���������� �:");
		x = sc.nextDouble();
		System.out.println("������� ���������� y:");
		y = sc.nextDouble();

		// ������� ����� ������ ������� ������������
		double ab = Math.sqrt((4 * 4 - 0 * 0) + (4 * 4 - 0 * 0));
		double bc = Math.sqrt((1 * 1 - 4 * 4) + (6 * 6 - 4 * 4));
		double ca = Math.sqrt((1 * 1 - 0 * 0) + (6 * 6 - 0 * 0));

		// ������������ ������� �����������
		double p = 0.5 * (ab + bc + ca);
		// ������� ������� ������� ������������

		double sLet = Math.sqrt(p * (p - ab) * (p - bc) * (p - ca));
		// System.out.println("������� ������� ������������ ��������: " + sLet);

		// ������� ������� ���� �������������, ������������ ��������� ������ �
		// ����� ��������� ������� ������������
		// ������ �����������
		// �(0,0), �(4,4), X(x, y)
		double ab1 = Math.sqrt((4 * 4 - 0 * 0) + (4 * 4 - 0 * 0));
		double bc1 = Math.sqrt((y * y - 4 * 4) + (x * x - 4 * 4));
		double ca1 = Math.sqrt((y * y - 0 * 0) + (x * x - 0 * 0));

		// ������������ ������� �����������
		double p1 = 0.5 * (ab1 + bc1 + ca1);
		// ������� ������� ������� ������������

		double sLet1 = Math.sqrt(p1 * (p1 - ab1) * (p1 - bc1) * (p1 - ca1));

		// ������ �����������
		// X(x, y), �(4,4), �(6,1)
		double ab2 = Math.sqrt((4 * 4 - y * y) + (4 * 4 - y * y));
		double bc2 = Math.sqrt((1 * 1 - 4 * 4) + (6 * 6 - 4 * 4));
		double ca2 = Math.sqrt((y * y - 1 * 1) + (x * x - 6 * 6));

		// ������������ ������� �����������
		double p2 = 0.5 * (ab2 + bc2 + ca2);
		// ������� ������� ������� ������������

		double sLet2 = Math.sqrt(p2 * (p2 - ab2) * (p2 - bc2) * (p2 - ca2));

		// ������ �����������
		// �(0,0), X(x, y), �(6,1)
		double ab3 = Math.sqrt((y * y - 0 * 0) + (x * x - 0 * 0));
		double bc3 = Math.sqrt((1 * 1 - y * y) + (6 * 6 - x * x));
		double ca3 = Math.sqrt((0 * 0 - 1 * 1) + (0 * 0 - 6 * 6));

		// ������������ ������� �����������
		double p3 = 0.5 * (ab3 + bc3 + ca3);
		// ������� ������� ������� ������������

		double sLet3 = Math.sqrt(p3 * (p3 - ab3) * (p3 - bc3) * (p3 - ca3));

		// ����� ����� ������ ������ ������������, ���� ����� ����� �������
		// ������� ������������ � ����� �������� � ��������� ������
		if (sLet == (sLet1 + sLet2 + sLet3)) {
			System.out.println("��������� ����� ����� ������ ������������.");
		} else {
			System.out.println("��������� ����� �� ����� ������ ������������.");
		}
	}

}
