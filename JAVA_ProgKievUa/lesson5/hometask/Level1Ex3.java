/*
 * C������ ������ ��������� ����� (�������� 15 ���������).
 * C������� ������ ������ � ��� ���� ������, ������ 15 ���������
 * ������ ���� ����� ��������� ������� �������, � ���������
 * �������� ��������� ���������� ��������� ���������
 */
package src.com.ua.lesson5.hometask;

import java.util.Arrays;

public class Level1Ex3 {

	public static void main(String[] args) {
		int[] array = new int[15];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (10 * Math.random());
		}

		int[] array1 = new int[30];
		for (int i = 0; i < array.length; i++) {
			array1[i] = array[i];
		}
		for (int i = array.length + 1; i < array1.length; i++) {
			int temp = array[i - (array.length)];	//	������ �� ��� �������� +1, �������� �������
													//	����������
			array1[i] = temp;
		}
		array1[array.length] = array[0];
		System.out.println("array = " + Arrays.toString(array));
		System.out.println("array1 = " + Arrays.toString(array1));

	}

}
