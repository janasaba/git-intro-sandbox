package Taschenrechner;

public class Taschenrechner {
	public double dividiere(double a, double b) {

		if (b == 0.0) {
			return (Double.MAX_VALUE);
		}

		double ergebnis = a / b;
		return ergebnis;
	}

	public double multipliziere(double a, double b) {
		return (a * b);
	}

	public double addiere(double a, double b) {
		return (a + b);
	}

	public double subtrahiere(double a, double b) {
		return (a - b);
	}
}
