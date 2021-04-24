/**
 * Есть девятиэтажных дом, в котором 4-ре подъезда. Номер подъезда начинается с
 * единицы. На одном этаже 4-ре квартиры. Наишите программу, которая получит
 * номер квартиры с клавиатуры и вернет номер этажа и номер подъезда. Если такой квартиры нет,
 * нужно сообщить об этом пользователю
 */
package com.ua.lesson3.hometask;

import java.util.Scanner;

public class Level1_ex2 {

	public static void main(String[] args) {
		int flatNumber;						//	Номер квартиры
		int amountFlatInEntrance = 144 / 4;
		int flatAmount = 4 * 9 * 4;		//	Количество квартир в доме
		int floorAmount = 9;			//	Количество этажей
		int amountFlatInFloor = 4;		//	Количество квартир на этаже	 
		int floorNumber;				//	Номер этажа

		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Введите номер квартиры:");
		flatNumber = sc.nextInt();	

		//	Определение номера подъезда
		if (flatNumber <= flatAmount & flatNumber != 0) {
			int entranceNumber = flatNumber / amountFlatInEntrance;
				
			if (flatNumber % amountFlatInEntrance != 0) {
				entranceNumber++;
			}
			
			//	Определение номера этажа
			if (flatNumber % amountFlatInEntrance == 0) {
				floorNumber = floorAmount;
			} else {
				floorNumber = (flatNumber%amountFlatInEntrance)/amountFlatInFloor;
				if (flatNumber % amountFlatInFloor != 0) {
					floorNumber++;
				}
			}
			System.out.println("Квартира № " + flatNumber + " находится в " 
					+ entranceNumber + " подъезде на " + floorNumber + " этаже.");
			
		} else {
			System.out.println("Такого номера квартиры нет в этом доме.");
		}
	}

}
