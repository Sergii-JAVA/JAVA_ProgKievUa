/*
 * Ввести с клавиатуры число до миллиарда, которое обозначает
 * количество долларов и центов пользователя.
 * Вывести это количество прописью.
 */
package com.ua.lesson5.hometask;

import java.util.Scanner;

import com.ibm.icu.text.RuleBasedNumberFormat;

import java.util.Locale;

public class Level2Ex3 {

	public static void main(String[] args) {
		double bal = 0;
		System.out.println("How much money do you have?");
		
		bal = new Scanner(System.in).nextDouble();
		
		/* Разделяем целую и дробную часть */
		int a = (int) bal;
		int b =(int) ((bal - a) * 100);

		RuleBasedNumberFormat nf = new RuleBasedNumberFormat(Locale.forLanguageTag("en"),
		        RuleBasedNumberFormat.SPELLOUT);
		System.out.println("You have " + nf.format(a) + " dollars and "
		        + nf.format(b) + " cents.");
	}
}