package level1Ex2;

import java.util.Scanner;

public class Level1Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a;
		double b;
		double c;
		
		System.out.println("¬ведите первую сторону треугольника:");
		a = sc.nextDouble();
		System.out.println("¬ведите вторую сторону треугольника:");
		b = sc.nextDouble();
		System.out.println("¬ведите третью сторону треугольника:");
		c = sc.nextDouble();
		
		Triangle triangle1 = new Triangle(a, b, c);
		double s = triangle1.square(a, b, c);
		System.out.println("ѕлощадь треугольника равна: " + s);
	}
}