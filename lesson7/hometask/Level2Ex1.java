/*
 * ������ � ������� ����. �������� �� � ������� ����� � �������.
 * ������� ������������ ����� (���, �����) �� �����.
 * 
 * ����� ���� �� ������� � �� Date, �� ��� ����� deprecated
 */
package com.ua.lesson7.hometask;

import java.util.Calendar;
import java.util.Scanner;

public class Level2Ex1 {

	public static void main(String[] args) {
		System.out.println("������� ���� � ������� DD:MM:YYYY"); // �� ������ ������ �� �� ���������
		Scanner sc = new Scanner(System.in);
		String inputDateLine = sc.nextLine();
		String[] arrInputStr = inputDateLine.split(":");
		int[] arrInputInt = new int[arrInputStr.length];

		for (int i = 0; i < arrInputInt.length; i++) {
			arrInputInt[i] = Integer.parseInt(arrInputStr[i]);
		}

		Calendar calInput = Calendar.getInstance();
		calInput.set(Calendar.DAY_OF_MONTH, arrInputInt[0]);
		calInput.set(Calendar.MONTH, arrInputInt[1] - 1);
		calInput.set(Calendar.YEAR, arrInputInt[2]);

		Calendar cal = Calendar.getInstance();

		boolean day = compareDate(calInput.get(Calendar.DAY_OF_MONTH), cal.get(Calendar.DAY_OF_MONTH));
		boolean month = compareMonth(calInput.get(Calendar.MONTH), cal.get(Calendar.MONTH));
		boolean year = compareYear(calInput.get(Calendar.YEAR), cal.get(Calendar.YEAR));

		if (day == month == year == true) {
			System.out.println("��������� � ������� ���� - ���������.");
		}
	}

	public static boolean compareDate(int x, int y) {
		boolean a;
		if (x != y) {
			a = false;
			System.out.println("��������� ����� �� ������������� ��������." + " ���������: " + x + ". �������: " + y);
		} else {
			a = true;
		}

		return a;
	}

	public static boolean compareMonth(int x, int y) {
		boolean a;
		if (x != y) {
			a = false;
			System.out.println("��������� ����� �� ������������� ��������." + " ���������: " + x + ". �������: " + y);
		} else {
			a = true;
		}

		return a;
	}

	public static boolean compareYear(int x, int y) {
		boolean a;
		if (x != y) {
			a = false;
			System.out.println("��������� ����� �� ������������� ��������." + " ���������: " + x + ". �������: " + y);
		} else {
			a = true;
		}

		return a;
	}
}
