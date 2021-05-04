/*
 * ���������� ������ {1, 2, 3, 4, 5}. ������ ������� ����� ���� ������������.
 * �������� ���������, ������� ������� �� ����� ��� ��������� ���������� �� ���� ����.
 * ���������� ���� �� ������
 */
package com.ua.lesson6.hometask;

import java.util.Scanner;

public class Level2Ex3 {

	public static void main(String[] args) {
		
		System.out.println("������� ������ �������:");
		int a = new Scanner(System.in).nextInt();
		
		System.out.println("����� ��������� ������������: " + combinations(a));
	}
	
	public static long combinations(int x) {
		long result = 1;
		for (int i = 1; i <= x; i++) {
			result *= i;
			if(result < 0) {
				System.out.println("���������� �����������!");	//	��� ��� ������� BigInteger 
				System.exit(x);
			}
		}
		return result;
	}
}