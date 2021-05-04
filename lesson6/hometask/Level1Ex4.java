/*
 * �������� �����, ������� ��������� �������� �����
 * �������� � ������� ����� �����. ���� ����� �������
 * � ������� ����, �� ������� ��� ������, ���� ���,
 * ������� -1.
 */
package com.ua.lesson6.hometask;

import java.util.ArrayList;

public class Level1Ex4 {		//	��� �� ��� ����� ���������� ������
								//	� ��. �������� ����������� �� ��������, ���� �� ������������

	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 100, 50, 6, 82, 19 };
		ArrayList<Integer> sequence = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			sequence.add(array[i]);
		}
		int element = 6;
		
		System.out.println(linearSearch(sequence, element));
		
		System.out.println(sequence);
	}

	public static int linearSearch(ArrayList<Integer> sequence, int element) {
		sequence.add(element);
		int lastIndex = sequence.size() - 1;
		int i = 0;
		for (; sequence.get(i) != element;) {
			i++;
		}
		sequence.remove(lastIndex);
		if (i != lastIndex) {
			return i;
		}
		return -1;
	}
}