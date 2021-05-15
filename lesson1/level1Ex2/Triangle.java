package level1Ex2;

public class Triangle {
	private double a;
	private double b;
	private double c;
	double halfPer;

	/**
	 * @param a
	 * @param b
	 * @param c
	 */
	public Triangle(double a, double b, double c) {
		halfPer = (a + b + c) / 2;
		if (a <= 0 || b <= 0 || c <= 0 || a != halfPer || b != halfPer || c != halfPer) {
			System.out.println("Ошибка в полученных данных.");
			System.exit(0);
		this.a = a;
		this.b = b;
		this.c = c;
		}
	}

	public double square(double a, double b, double c) {
		System.out.println("halfPer = " + halfPer);
		System.out.println("halfPer - a = " + (halfPer - a));
		System.out.println("halfPer - b = " + (halfPer - b));
		System.out.println("halfPer - c = " + (halfPer - c));
		if ((halfPer - a) <= 0 || (halfPer - b) <= 0 || (halfPer - c) <= 0) {
			System.out.println("Ошибка в полученных данных!");
			System.exit(0);
		}
		double square = Math.sqrt(halfPer * (halfPer - a) * (halfPer - b) * (halfPer - c));
		return square;
	}
}
