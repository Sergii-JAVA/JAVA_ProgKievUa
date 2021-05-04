/*
 * ���������� ����� ������������������ �����:
 * 0, 2, 4, 6, 8, 10, 12
 * 1, 4, 7, 10, 13
 * 1, 2, 4, 8, 16, 32
 * 1, 3, 9, 27
 * 1, 4, 9, 16, 25
 * 1, 8, 27, 64, 125
 * 
 * ���������� ���������, ������� ������� ��������� ���� ����
 * ������������������ (���� �������� ��). ��������: ������������
 * ������ ������ 0, 2, 4, 6, 8, 10, 12, � ������� ������ ���� ����� 14.
 */
package com.ua.lesson6.hometask;

import java.util.Scanner;

public class Level2Ex1 {

	public static void main(String[] args) {
		System.out.println("������� ������������������ ����� ����� ������� ��� ��������:"); // ��� ��������,
																	// ����������� - ","
		String str = new Scanner(System.in).nextLine();		//	��������� ������

		String[] t = str.split("[,]");						//	��������� ������ �� ������ String �� �������. ��.*.csv
		int[] numbers = new int[t.length];					//	������� ����� ������ ����� �� �����
		for (int i = 0; i < t.length; i++) {
			numbers[i] = Integer.parseInt(t[i]);			//	��������� ������ ���������������� � int ���������� ������� t
															//	� �������� ����� ���� �� �������� � wrapper-��. �� ��. � ��� ���������� ���������
		}

		int count = 0;
		for (int i = 0; i < numbers.length - 1; i++) {		//	�������� �� �����������
			if (numbers[i + 1] > numbers[i]) {				//	���� ��������� ������� ������� ������, ��� ����������
				count++;
			} else {
				System.out.println("��������� �������� ��� - ��������������.");
			}
		}

		if (count == numbers.length - 1) {					//	����� - 1, ������ ��� count �� ��������� 0 � ������. �������
															//	count �� ��������� ������ ������� �������
			String result = /*plus(numbers) + multiplication(numbers) + */degree(numbers);
			
			if(result != null) {							//	�������� �� ������������� � ���� ����������� �����
				System.out.println("��������� ����� � ����: " + result);
			}
		}
	}

	public static String plus(int[] arr) {
		String result = "";
		int count = 0;
		int[] step = new int[arr.length - 1];				//	������� ������������� ������
		for (int i = 0; i < step.length; i++) {				//	��������� ������������� ������ ���������� �������� ���������
			step[i] = arr[i + 1] - arr[i];
		}
		for (int i = 0; i < step.length - 1; i++) {			//	��������� �� ��������� �������� ��������
			if (step[i] == step[i + 1]) {
				count++;									//	���� �����, �������� �������
			}
		}
		if (count == step.length - 1) {						//	��������� ��� �� �������� �����. ���� ���, �� ��� ������������� ������������������
			int a = arr[arr.length - 1] + step[0];			//	� result ������ ��������� ������� + ����� �������� �� ������� step
			result = Integer.toString(a);												//	������� - ������� ���������� � String
		} else {
			System.out.println("����������� �������� ��� - �� ������.");
			System.exit(count);
		}
		return result;
	}

	public static String multiplication(int[] arr) {
		String result = "";
		int count = 0;
		double[] step = new double[arr.length - 1];			//	������� ������������� ������. double, ����� ������ ������� �������			
		int x;												//	��������� ��������� ����������. ���� ������ �������=0, 
		if (arr[0] == 0) {									//	����� ������ �� ��������
			x = 1;
			System.out.println("����������� �������� ��� - �� ������.");
			System.exit(x);
		} else {
			x = 0;
		}
		for (int i = x; i < step.length; i++) {				//	��������� ������������� ������ �������� �� ������� �������� ���������
			step[i] = (double) arr[i + 1] / arr[i];
		}
		for (int i = 0; i < step.length - 1; i++) {			//	���������� �������, ���� ����� �������� �������
			if (step[i] == step[i + 1]) {
				count++;
			}
		}
		if (count == step.length - 1) {						//	���������� ������� � ����������� �������. ���� ��, �� ������� ��������� �������
			double d = arr[arr.length - 1] * step[0];
			result = Double.toString(d);
		}
		return result;
	}

	public static String degree(int[] arr) {
		String result = "";
		int count = 0;
		double[] step = new double[arr.length - 1];			//	������� ������������� ������ double.
		int x;
		if (arr[0] == 0) {									//	�������� �� ��������� ���� ������� ��������
			x = 1;
			System.out.println("����������� �������� ��� - �� ������.");
			System.exit(x);
		} else {
			x = 0;
		}
		for (int i = 2; i < 20; i++) {									//	���������� ���������� �������. ����� � ��.0=1, ��.1 = �����. ������� � 2-�
			for (int j = x; j < arr.length - 1; j++) {					//	���������� �������� � ���������� �������
				double a = Math.pow(arr[j + 1], (double) 1 / i) - Math.pow(arr[j], (double) 1 / i);		//	j=0 -> sqrt(8) - sqrt(1)
				if (a >= 0.9999 && a <= 1.0001) {						//	� ������� ������ n-�� ������� ���� ���������������� ��� ���������
					step[i] = i;										//	��������� ������� ���������� � ������������� ������
					count++;
				}
			}
		}

		if (count == step.length) {										//	���� count ����� ����� �������, �� ��� �������� ������������������ ������ ���������� ��������
			double a = Math.pow(arr[arr.length - 1], 1 / step[0]);		//	���, ��� � ������� �������, ��������� ��������� �������
			double d = Math.round(Math.pow((a + 1), step[0]));
			result = Double.toString(d);
		}
		return result;
	}
}