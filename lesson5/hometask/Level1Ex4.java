/*
 * ������� ������ ������ � �����������.
 * ���������� ��������� ��� ����������� �������� ����������
 * ������� 'b' � ���� ������.
 * ��������� ������� �� �����
 */
package com.ua.lesson5.hometask;

import java.util.Scanner;

public class Level1Ex4 {

	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������� ������ ������ �� ���������� �����:");
		String str = sc.nextLine();
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'b') {
				count ++;
			}
		}
		
		System.out.println();

		System.out.println("������ " + "b" + " ����������� � "
							+ "��������� ������ " +	count + " ���");

	}

}
