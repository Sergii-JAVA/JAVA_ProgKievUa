/**
 * ���� ������������� ���, � ������� 4-�� ��������. ����� �������� ���������� �
 * �������. �� ����� ����� 4-�� ��������. ������� ���������, ������� �������
 * ����� �������� � ���������� � ������ ����� ����� � ����� ��������. ���� ����� �������� ���,
 * ����� �������� �� ���� ������������
 */
package com.ua.lesson3.hometask;

import java.util.Scanner;

public class Level1_ex2 {

	public static void main(String[] args) {
		int flatNumber;						//	����� ��������
		int amountFlatInEntrance = 144 / 4;
		int flatAmount = 4 * 9 * 4;		//	���������� ������� � ����
		int floorAmount = 9;			//	���������� ������
		int amountFlatInFloor = 4;		//	���������� ������� �� �����	 
		int floorNumber;				//	����� �����

		Scanner sc = new Scanner(System.in); 
		
		System.out.println("������� ����� ��������:");
		flatNumber = sc.nextInt();	

		//	����������� ������ ��������
		if (flatNumber <= flatAmount & flatNumber != 0) {
			int entranceNumber = flatNumber / amountFlatInEntrance;
				
			if (flatNumber % amountFlatInEntrance != 0) {
				entranceNumber++;
			}
			
			//	����������� ������ �����
			if (flatNumber % amountFlatInEntrance == 0) {
				floorNumber = floorAmount;
			} else {
				floorNumber = (flatNumber%amountFlatInEntrance)/amountFlatInFloor;
				if (flatNumber % amountFlatInFloor != 0) {
					floorNumber++;
				}
			}
			System.out.println("�������� � " + flatNumber + " ��������� � " 
					+ entranceNumber + " �������� �� " + floorNumber + " �����.");
			
		} else {
			System.out.println("������ ������ �������� ��� � ���� ����.");
		}
	}

}
