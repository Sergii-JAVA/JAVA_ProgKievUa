/*
 * Существуют такие последовательности чисел:
 * 0, 2, 4, 6, 8, 10, 12
 * 1, 4, 7, 10, 13
 * 1, 2, 4, 8, 16, 32
 * 1, 3, 9, 27
 * 1, 4, 9, 16, 25
 * 1, 8, 27, 64, 125
 * 
 * Реализуйте программу, которая выведет следующий член этой
 * последовательности (либо подобной им). Например: пользователь
 * вводит строку 0, 2, 4, 6, 8, 10, 12, а ответом должно быть число 14.
 */
package com.ua.lesson6.hometask;

import java.util.Scanner;

public class Level2Ex1 {

	public static void main(String[] args) {
		System.out.println("Введите последовательность чисел через запятую без пробелов:"); // Без пробелов,
																	// разделитель - ","
		String str = new Scanner(System.in).nextLine();		//	Считываем строку

		String[] t = str.split("[,]");						//	Разбиваем строку на массив String по запятым. см.*.csv
		int[] numbers = new int[t.length];					//	Создаем новый массив такой же длины
		for (int i = 0; i < t.length; i++) {
			numbers[i] = Integer.parseInt(t[i]);			//	Заполняем массив преобразованными в int значениями массива t
															//	В принципе можно было бы обойтись и wrapper-ом. Но хз. Я уже библиотеку подключил
		}

		int count = 0;
		for (int i = 0; i < numbers.length - 1; i++) {		//	Проверка на возрастание
			if (numbers[i + 1] > numbers[i]) {				//	Если следующий элемент массива больше, чем предыдущий
				count++;
			} else {
				System.out.println("Введенный числовой ряд - невозрастающий.");
			}
		}

		if (count == numbers.length - 1) {					//	Длина - 1, потому что count мы присвоили 0 в начале. Поэтому
															//	count не учитывает первый элемент массива
			String result = /*plus(numbers) + multiplication(numbers) + */degree(numbers);
			
			if(result != null) {							//	Проверка на существование в базе аналогичных рядов
				System.out.println("Следующее число в ряду: " + result);
			}
		}
	}

	public static String plus(int[] arr) {
		String result = "";
		int count = 0;
		int[] step = new int[arr.length - 1];				//	Создаем промежуточный массив
		for (int i = 0; i < step.length; i++) {				//	Заполняем промежуточный массив разностями соседних элементов
			step[i] = arr[i + 1] - arr[i];
		}
		for (int i = 0; i < step.length - 1; i++) {			//	Проверяем на равенство соседние элементы
			if (step[i] == step[i + 1]) {
				count++;									//	Если равны, повышаем счетчик
			}
		}
		if (count == step.length - 1) {						//	Проверяем все ли разности равны. Если нет, то это неравномерная последовательность
			int a = arr[arr.length - 1] + step[0];			//	В result кладем последний элемент + любую разность из массива step
			result = Integer.toString(a);												//	Кавычки - неявное приведение к String
		} else {
			System.out.println("Аналогичный числовой ряд - не найден.");
			System.exit(count);
		}
		return result;
	}

	public static String multiplication(int[] arr) {
		String result = "";
		int count = 0;
		double[] step = new double[arr.length - 1];			//	Создаем промежуточный массив. double, чтобы видеть дробный остаток			
		int x;												//	Объявляем временную переменную. Если первый элемент=0, 
		if (arr[0] == 0) {									//	можно дальше не умножать
			x = 1;
			System.out.println("Аналогичный числовой ряд - не найден.");
			System.exit(x);
		} else {
			x = 0;
		}
		for (int i = x; i < step.length; i++) {				//	Заполняем промежуточный массив частными от деления соседних элементов
			step[i] = (double) arr[i + 1] / arr[i];
		}
		for (int i = 0; i < step.length - 1; i++) {			//	Сравниваем частные, если равны повышаем счетчик
			if (step[i] == step[i + 1]) {
				count++;
			}
		}
		if (count == step.length - 1) {						//	Сравниваем счетчик с количеством частных. Если Ок, то считаем следующих элемент
			double d = arr[arr.length - 1] * step[0];
			result = Double.toString(d);
		}
		return result;
	}

	public static String degree(int[] arr) {
		String result = "";
		int count = 0;
		double[] step = new double[arr.length - 1];			//	Создаем промежуточный массив double.
		int x;
		if (arr[0] == 0) {									//	Проверка на равенство нулю первого элемента
			x = 1;
			System.out.println("Аналогичный числовой ряд - не найден.");
			System.exit(x);
		} else {
			x = 0;
		}
		for (int i = 2; i < 20; i++) {									//	Перебираем показатели степени. Число в ст.0=1, ст.1 = число. Поэтому с 2-х
			for (int j = x; j < arr.length - 1; j++) {					//	Перебираем элементы в полученном массиве
				double a = Math.pow(arr[j + 1], (double) 1 / i) - Math.pow(arr[j], (double) 1 / i);		//	j=0 -> sqrt(8) - sqrt(1)
				if (a >= 0.9999 && a <= 1.0001) {						//	С помощью корней n-ой степени ищем последовательный ряд оснований
					step[i] = i;										//	Найденный элемент записываем в промежуточный массив
					count++;
				}
			}
		}

		if (count == step.length) {										//	Если count равна длине массива, то все элементы последовательности прошли предыдущую проверку
			double a = Math.pow(arr[arr.length - 1], 1 / step[0]);		//	Тут, как в прошлых методах, вычисляем следующий элемент
			double d = Math.round(Math.pow((a + 1), step[0]));
			result = Double.toString(d);
		}
		return result;
	}
}