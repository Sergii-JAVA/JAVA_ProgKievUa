package com.ua.lesson6;

public class ClassWork {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4 };
		
		System.out.println(sum(arr));
	}

	public static int sum(int[] array) {
		int result = 0;
		for (int i = 0; i < array.length; i++) {
			result = result + array[i];
		}
		return result;
	}
}