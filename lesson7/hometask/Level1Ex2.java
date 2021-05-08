/*
 * �������� ���� ������� ������ Array.toString() ��� int[]
 */
package com.ua.lesson7.hometask;

import java.util.Arrays;
import java.util.Scanner;

public class Level1Ex2 {

	public static void main(String[] args) {
		// ������� ������
		System.out.println("������� ����� �������:");
		int a = new Scanner(System.in).nextInt();
		int[] array = new int[a];

		int i = 0;
		while (i < array.length) { // ������ ������ �����������
			array[i] = i;
			i++;
		}
		System.out.println("���������� ������:" + Arrays.toString(array));

		System.out.println("���������� ������, ����������� � ������:");
		System.out.println(toString(array));
	}

	public static String toString(int array[]) {
		String s = "";
		for (int i = 0; i < array.length; i++) {
			s = s + Integer.toString(array[i]) + " ";
		}
		return s;
	}

}
