/*
 * ���������, �������� �� �������������� ����� ���������� �������.
 * ���� �������������� �����. ���������, �������� �� ��� "���������� �������".
 * ����������: ���������� ������� ���������� �����, � ������� - ��� ������
 * ���������� ���� � ����� ����� ���� ��� ����� �������� ����� ����� ���� ���
 * ������ ��������.
 */
package com.ua.lesson3.hometask;

import java.util.Scanner;

public class Level2_ex3 {

	public static void main(String[] args) {
		int userNumber;

		Scanner sc = new Scanner(System.in);

		System.out.println("������� �����������, �������������, �������������� �����:");
		userNumber = sc.nextInt();

		if (userNumber > 999 && userNumber < 9999) {
			
			// �������� ����� ���������� �� ���������� �����
			int a = userNumber % 10;
			int b = userNumber / 10 % 10;
			int c = userNumber / 100 % 10;
			int d = userNumber / 1000 % 10;
			
			if ((a + b) == (c + d)) {
				System.out.println("��������� ����� - ����������!");
			} else {
				System.out.println("��������� ����� - ������������.");
			}
		} else {
			System.out.println("������! �������� ����� ������� �� ���������� ��������.");
		}
	}

}
