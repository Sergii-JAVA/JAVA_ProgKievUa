package com.ua.lesson4;

import java.util.Scanner;

public class Classwork {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������� x: ");
		int x = sc.nextInt();	// ����� ������
//		System.out.println("������� y: ");
//		int y = sc.nextInt();	//	����� �������
		
		for(int i = 1; i <= x ; i++) {
			for(int j = 1; j <= x + 1; j++) {
				if(j <= x - i) {
					System.out.print(" ");
				} else {						//	� ����� ��� ���
					System.out.print("*");
	
				}
			}
			System.out.println();
		}
		
		
		
		
//		int sum = 0;
//		int sum3 = 0;
//		if (y > x) {
//			for(int i = x; x <= y; x++) {
//				System.out.println(x);
//				sum = sum + x;
//				
//				if(x%3 == 0) {
//					sum3 =+ sum3;
//					
//				}
//			}
//		} else {
//			System.out.println("������������������ �� ������.");
//		}
//		System.out.println(sum);
		
	}
}
