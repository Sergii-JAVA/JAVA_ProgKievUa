/*
 * �������� ��� ��� ����������� ���������� ������� (7, 2, 9, 4) -> (4, 9, 2, 7).
 * ������ ����� ���� ������������ ������.
 * ��� ���������� ������� ������������ �������������� ������ ������.
 */

package com.ua.lesson5.hometask;

import java.util.Arrays;
import java.util.Scanner;

public class Level2Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ����� �������:");
		int a = sc.nextInt();

		/* ������� ���������� ������ ���������������� ����� */
		int[] array = new int[a];

		/* �������� ������ ������������� ������� ��� �������� ���������� */
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (10 * Math.random());
		}

		/* ���������, ��� �� ������� */
		System.out.println(Arrays.toString(array));

		/* �������� ������ */
		System.out.println();
		int n = array.length;

		for (int i = 0; i < n / 2; i++) {
			int temp = array[n - i - 1];
			array[n - i - 1] = array[i];
			array[i] = temp;
		}
		System.out.print(Arrays.toString(array));

	}

}
