/*
 * �������� ���������, ������� ������ ���������� �����������
 * ��������� �� ������ �� �����, �� � ������� ������ �� �������
 * ����. ��������, ���� ������� 3 �������, �� ���������� ������
 * ������� ����������� ������ � 3-�� ����.
 */
package com.ua.lesson7.hometask;

import java.util.Calendar;
import java.util.Date;

public class Level1Ex1 {

	@SuppressWarnings("deprecation") // ����� ���� �� ������������
										// ������ ���������, �� �����
										// ����������, ��� �������� ���
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println("������� ����: \t\t\t" + calendar.getTime());

		if (calendar.getTime().getDay() == 31) {
			System.out.println("� ���������� ������ ��� 31-�� �����!");
		} else if (calendar.getTime().getMonth() == Calendar.MARCH) {
			System.out.println("� ���������� ������ (�������) ����� 30-� � 31-� - �����������!");
		} else {
			int n = -1;
			Calendar calendar1 = Calendar.getInstance();
			calendar1.add(Calendar.MONTH, n);
			System.out.println("��� �� ����� � ������� ������: \t" + calendar1.getTime());
			int result = (int) (calendar1.getTimeInMillis() - calendar.getTimeInMillis());
			System.out.println("������� ����� ������� ����� � ���� �� ����� � " + "������� ������, ��������: " + result
					+ " �����������.");
		}
	}
}
