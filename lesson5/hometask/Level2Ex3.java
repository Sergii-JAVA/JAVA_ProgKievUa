/*
 * Ввести с клавиатуры число до миллиарда, которое обозначает
 * количество долларов и центов пользователя.
 * Вывести это количество прописью.
 */
package lesson5.hometask;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Scanner;

import com.ibm.icu.text.RuleBasedNumberFormat;

public class Level2Ex3 {

	public static void main(String[] args) {
		double bal = 0;
		System.out.println("How much money do you have?");
		
		bal = new Scanner(System.in).nextDouble();
		System.out.println(bal); 
		
		/* Разделяем целую и дробную часть */
		int a = (int) bal;
		double b =(int) bal - a;
		System.out.println(b);
		
//		System.out.println("You have: " + Charset.forName(bal));
		RuleBasedNumberFormat nf = new RuleBasedNumberFormat(Locale.forLanguageTag("en"),
		        RuleBasedNumberFormat.SPELLOUT);
//		System.out.println(nf.format(bal));
//		System.out.println(nf.format("You have " + nf.format(a)
//				+ " dollars and " + nf.format(b) + " cents."));

	}

}
