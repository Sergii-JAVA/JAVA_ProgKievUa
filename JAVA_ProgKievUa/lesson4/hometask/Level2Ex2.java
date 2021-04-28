package com.ua.lesson4.hometask;

public class Level2Ex2 {

	public static void main(String[] args) {
		int num;
		boolean isPrime = true;
		
		for(num = 1; num <= 100; num ++) {
			if(num < 1) {
				isPrime = false;
			} else {
				isPrime = true;
			}
			
			for (int i = 2; i <= num / i; i++) {
				if ((num % i) == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				System.out.println(num + " - простое число.");
			}
		}
	}
}