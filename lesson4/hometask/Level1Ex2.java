/*
 * ��������� � ������� ����� ��������� ����� n, ���������� � ����������
 * (4<n<16)
 */
package com.ua.lesson4.hometask;

import java.util.Scanner;

public class Level1Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������� ����� ������������� ����� "
				+ "�� 4-x �� 16-�� ������������:");
		int num = sc.nextInt();
		int f = 1;
		
		if (num > 4 & num < 16) {
			for (int i = 0; i <= num - 1; i++) {
				f = f * (num - i);
			}
		} else {
			System.out.println("������! ��������� ����� �� ������������� ����������"
					+ " ���������!");
		}
		System.out.println("��������� ����� " + num + " ����� " + f);
	}
}