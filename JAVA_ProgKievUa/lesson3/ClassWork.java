package com.ua.lesson3;

import java.util.Scanner;

public class ClassWork {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int day;
		day = sc.nextInt();
		if(day >= 1 && day <= 31) {
//			switch(day) {
//			case 1: day == 1 || 8 || 15 || 22 || 29;
//			System.out.println("Ïîíåäåëüíèê");
//			break;
//			case 2: day == 2 || 9 || day == 16 || day == 23 || day == 30;
//			System.out.println("Âòîğíèê");
//			break;
//			case 3: day == 3 || day == 10 || day == 17 || day == 24 || day == 31;
//			System.out.println("Ñğåäà");
//			break;
//			case 4: day == 4 || day == 11 || day == 18 || day == 25;
//			System.out.println("×åòâåğã");
//			break;
//			case 5: day == 5 || day == 12 || day == 19 || day == 26;
//			System.out.println("Ïÿòíèöà");
//			break;
//			case 6: day == 6 || day == 13 || day == 20 || day == 27;
//			System.out.println("Ñóááîòà");
//			break;
			default: System.out.println("Âîñêğåñåíüå");
			}
		} else {
			System.out.println("Îøèáêà ââîäà");
		}

		}
		
}
	