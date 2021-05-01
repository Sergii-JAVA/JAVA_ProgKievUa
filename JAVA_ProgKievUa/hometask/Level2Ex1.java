/*
 * "����������� ������". �.�. �������� ���������, ������� ��������
 * ������� ������ �� 90, 180 � 270 �������� �� ������� �������.
 * (��� ���������� ������� ������������ �������������� ������ - ���������)
 */
package lesson5.hometask;

import java.util.Scanner;

public class Level2Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		final String ANSI_RESET = "\u001B[0m";
//		final String ANSI_RED = "\u001B[31m";

		/* �������� �������� ������� */
		System.out.println("������� ���������� ����� ���������� �������:");
		int rows = sc.nextInt();
		System.out.println("������� ���������� �������� ���������� �������:");
		int columns = sc.nextInt();
		int[][] array = new int[rows][columns];

		/* ���������� ������� ���������� */
		int count = 1;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				array[i][j] = count;
			}
			count++;
		}

		/* ������� ������� ������ �� ����� */
		System.out.println("������� ������:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();

		}

		/* ��������� ������ �� 90 �������� �� ������ ������� */
		System.out.println();
		System.out.println("���������� �� 90 �������� �� ������� ������� ������:");
		for (int i = 0; i < rows; i++) {
			for (int j = columns; j > 0; j--) {
				System.out.print(j);
			}
			System.out.println();
		}

		/* ��������� ������� ������ �� 180 �������� �� ������� ������� */
		System.out.println();
		System.out.println("���������� �� 180 �������� �� ������� ������� ������:");
		for (int i = rows - 1; i >= 0; i--) {
			for (int j = 0; j < columns; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}

		/* ��������� ������� ������ �� 270 �������� �� ������� ������� */
		System.out.println();
		System.out.println("���������� �� 270 �������� �� ������� ������� ������:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				int temp = array[j][i];
				System.out.print(temp);
			}
			System.out.println();
		}
	}
}
