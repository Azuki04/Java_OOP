package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import prog.currency.CurrencyCalculater;


class CurrencyCalculaterTest {

	@Test
	void testGetInstance() {
		CurrencyCalculater calc1 = CurrencyCalculater.getInstance();
		CurrencyCalculater calc2 = CurrencyCalculater.getInstance();
		Assertions.assertEquals(calc1, calc2);
	}

	@Test
	void testGetCurrencyRate() {
		CurrencyCalculater calc = CurrencyCalculater.getInstance();
		Assertions.assertEquals(calc.getCurrencyRate("USD"), 1.01);
	}

	@Test
	void testSetCurrencyRate() {
		CurrencyCalculater calc = CurrencyCalculater.getInstance();
		calc.setCurrencyRate(1.5, "USD");
		Assertions.assertEquals(calc.getCurrencyRate("USD"), 1.5);
	}

	@Test
	void testCalculateRate() {
		CurrencyCalculater calc1 = CurrencyCalculater.getInstance();
		double result = calc1.calculateRate(500, "EUR");
		Assertions.assertEquals(result, 480.00);
	}

}
