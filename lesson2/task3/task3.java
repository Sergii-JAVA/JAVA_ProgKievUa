package com.ua.lesson2.task3;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		 Scanner in =new Scanner(System.in);

	        System.out.println("Введите радиус окружности: ");
	        double R =in.nextDouble();

	        R=2*Math.PI*R;
	        System.out.println(R);
	}

}
