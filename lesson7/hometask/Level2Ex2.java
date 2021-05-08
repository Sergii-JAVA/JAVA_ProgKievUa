/*
 *  ���������� �������� ����� ����� ������ ������� - ��� �����
 *  �������, � ������� ���� �����������.
 *  ��� �������:
 *  117 = 0 1 1 1 0 1 0 1
 *   17 = 0 0 0 1 0 0 0 1
 *  -----------------------------------
 *    H = 0+1+1+0+0+1+0+0 = 3 - ���������� �������� ����� (117,17)
 *    ���� ��� ������������� ����� ����� (N, M) � ���������� ����. ���
 *    ���������� ���������� ���������� �������� ����� ����� �����
 *    �������.
 */
package com.ua.lesson7.hometask;

import java.util.Scanner;

public class Level2Ex2 {

	public static void main(String[] args) {
		System.out.println("������� ������ �����");
		int a = new Scanner(System.in).nextInt();
		System.out.println("������� ������ �����");
		int b = new Scanner(System.in).nextInt();

		String aStr = new String(intToBinary(a));
		String bStr = new String(intToBinary(b));

		System.out.println(aStr.charAt(2));

		System.out.println("������ ����� � �������� �������: " + intToBinary(a));
		System.out.println("������ ����� � �������� �������: " + intToBinary(b));

		System.out.println("���������� �������� ��������: " + HammingDigit(aStr, bStr));

	}

	public static String intToBinary(int x) {
		String s = new String(Integer.toBinaryString(x));
		String result = new String(String.format("%32s", s).replaceAll(" ", "0"));
		return result;
	}

	public static int HammingDigit(String a, String b) {
		int result = 0;
		char[] tempA = a.toCharArray();
		char[] tempB = b.toCharArray();

		for (int i = 0; i < 32; i++) {
			if (tempA[i] != tempB[i]) {
				result++;
			}
		}
		return result;
	}
}
