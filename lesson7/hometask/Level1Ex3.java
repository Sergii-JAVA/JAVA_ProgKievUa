/*
 * ������ � ������� ����� � �������� �������. ��������� ��� �
 * ���������� � ������� �� ����� (�10� -> 2).
 */
package com.ua.lesson7.hometask;

import java.util.Scanner;

public class Level1Ex3 {

	public static void main(String[] args) {
		System.out.println("������� ����� � �������� ������� (�� ������ 32" + " ������):");
		String binary = new Scanner(System.in).nextLine();

		int num = Integer.parseInt(binary, 2);

		System.out.println(num);
	}
}