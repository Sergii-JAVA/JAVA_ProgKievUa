/*
 * �������� ���������, ������� ������� 4 ����� � ���������� � ������� �� ����� �����
 * �� ���
 */
package com.ua.lesson3.hometask;

import java.util.Scanner;

public class Level1_ex1 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = 1;
		int b = 0;
		int c = 0;
		int d = 0;
		int max = 0;
		
		System.out.println("� ������ ��������� ������������ ������������ ������ ������"
				+ "��������� ����� � ��������� ������� ������������ �� ���������");
		System.out.println();
		
		//	�� ����, ��� ���������� �������� ��� ������ ��������. �� ������� �����������
		//	���-�� ���� "�������� ���������������..."
		System.out.println("������� ������ ����� ����� � ��������� �� -2147483648 �� 2147483647:");
		if(sc.hasNextInt()) {
			a = sc.nextInt();
		} else {
			System.out.println("������� ����� ������.");
			System.exit(1);
		}
		System.out.println("������� ������ ����� ����� � ��������� �� -2147483648 �� 2147483647::");
		if(sc.hasNextInt()) {
			b= sc.nextInt();
		} else {
			System.out.println("������� ����� ������.");
			System.exit(1);
		}
		System.out.println("������� ������ ����� ����� � ��������� �� -2147483648 �� 2147483647::");
		if(sc.hasNextInt()) {
			c = sc.nextInt();
		} else {
			System.out.println("������� ����� ������.");
			System.exit(1);
		}
		System.out.println("������� ��������� ����� ����� � ��������� �� -2147483648 �� 2147483647::");
		if(sc.hasNextInt()) {
			d = sc.nextInt();
		} else {
			System.out.println("������� ����� ������.");
			System.exit(1);
		}
		
		//	�������� �� ���������
		if(a == b || a == c || a == d || b == c || b == d || c == d) {
			System.out.println("���������� ���������� ��������� ���������� ��-�� ��������� ��������");
			System.exit(1);
		}
		
		// ����� ������� ����� ��������� �������� - �� ���������� ������-��
		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		if (max > c) {
			max = c;
		} else {
			max = d;
		}
		
		
		
		System.out.println("���������� ����� �����, ����� ��������� " + max);
	}

}
