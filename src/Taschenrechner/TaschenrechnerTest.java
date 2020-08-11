package Taschenrechner;

import org.junit.Assert;
import org.junit.Test;

public class TaschenrechnerTest {
	@Test
	public void groessterInteger() {
		System.out.println(Integer.MAX_VALUE);
	}

	@Test
	public void maxIntegerPlusEins() {
		int maxIntegerPlusEins1 = Integer.MAX_VALUE + 1;
		System.out.println(maxIntegerPlusEins1);
	
	

	}

	Taschenrechner taschenrechner = new Taschenrechner();
	double ergebnis = taschenrechner.dividiere(10, 5);

	public void multiplikation() {

// Test vorbereiten

		Taschenrechner taschenrechner = new Taschenrechner();
		double aArray[] = { -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5 };
		double bArray[] = { -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5 };

		double ergebnisArray[] = new double[aArray.length * bArray.length];
		int index = 0;

		double erwartungsWertArray[] = { 25, 20, 15, 10, 5, 0, -5, -10, -15, -20, -25, 20, 16, 12, 8, 4, 0, -4, -8, -12,
				-16, -20 };
//logik ausführen
		for (double aWert : aArray) {
			System.out.println("==>" + aWert);

			for (double bWert : bArray) {
				System.out.println("==> " + aWert + "*" + bWert);
				ergebnisArray[index] = taschenrechner.multipliziere(aWert, bWert);
				index = index + 1;

				System.out.println(ergebnisArray);
			}

//erwartungswerte überprüfen
			Assert.assertArrayEquals(erwartungsWertArray, ergebnisArray, 0.01);
		}
	}
}