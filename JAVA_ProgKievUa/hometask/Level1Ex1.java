/*
 * � ������� ������ ���������� "����". ������ ���������� ����� ������ ��������� � ����������.
 * � ������� 7 �����.
 * ***+++***+++***+++***
 * ***+++***+++***+++***
 * ***+++***+++***+++***
 * ***+++***+++***+++***
 * ***+++***+++***+++***
 * ***+++***+++***+++***
 * ***+++***+++***+++***
 * ***+++***+++***+++***
 */
package com.ua.lesson4.hometask;

import java.util.Scanner;

public class Level1Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("������� ���������� �����:");
		int num = sc.nextInt();

		for (int i = 0; i < 5; i++) {

			for (int j = 1; j <= num; j++) {
				if (j % 2 == 0) {
					System.out.print("+++");
				} else {
					System.out.print("***");
				}
			}
			System.out.println("");
		}

	}

}
