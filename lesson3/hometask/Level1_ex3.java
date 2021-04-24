/*
 * ���������� ���������� ���� � ����, ������� ������ ������������. � ���������� ���� - 366 ����,
 * ����� ��� � ������� - 365.
 * ���������� ��� ������������ �� ���������� �������:
 * ��� �������� ����������, ���� �� ������� �� 4 ��� �������, �� ���� �� ������� �� 100
 * ��� �������, �� ��� �� ���������� ���. ������, ���� �� ������� ��� ������� �� 400 - 
 * �� ��� ���������� ���
 */
package com.ua.lesson3.hometask;

import java.util.Scanner;

public class Level1_ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("������� ���:");
		int yearNumber = sc.nextInt();
		
		if (yearNumber % 4 == 0 && (yearNumber % 400 == 0 || yearNumber % 100 != 0) ) {
			System.out.println("� ��������� ���� 366 ����. �� ����������.");
		} else {
			System.out.println("� �������� ���� 365 ����. �� �� ����������");
		}
	}

}
