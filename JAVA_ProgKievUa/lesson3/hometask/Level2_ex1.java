/*
 * ���� ���� � ������� � ������ ��������� � �������� 4.
 * ������������ ������ � ���������� ����� � � �.
 * �������� ���������, ������� ��������� ����� �� ��� �����
 * ������ ����� ��� ���.
 */
package com.ua.lesson3.hometask;

import java.util.Scanner;

public class Level2_ex1 {

	public static void main(String[] args) {
		double x;
		double y;
		double r = 4;
		double h;	//	���������� ������������ � ������� � ������ ���������,
					//	� ������ � ��������� �����
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��������������� ������� ���������� ��� ��������.");
		System.out.println("������� ���������� �:");
		x = sc.nextDouble();
		System.out.println("������� ���������� y:");
		y = sc.nextDouble();
		
		h = Math.sqrt(x*x + y*y);
		
		if (h <= r) {
			System.out.println("��������� ����� ����������� �����.");
		} else {
			System.out.println("��������� ����� �� ����������� �����.");
		}
	}

}
