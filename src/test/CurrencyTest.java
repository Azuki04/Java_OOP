package test;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import prog.currency.Currency;

class CurrencyTest {

	@Test
	void testCurrency() {
		Currency cur = new Currency("CHF", 1.00);
		Assertions.assertEquals("CHF", cur.getCurrency());
	}

	@Test
	void testGetCurrency() {
		Currency cur = new Currency("USD", 0.96);
		Assertions.assertEquals("USD", cur.getCurrency());
	}

	@Test
	void testGetRate() {
		Currency cur = new Currency("USD", 0.96);
		Assertions.assertEquals(0.96, cur.getRate());
	}

	@Test
	void testSetRate() {
		Currency cur = new Currency("USD", 0.96);
		cur.setRate(0.97);
		Assertions.assertEquals(0.97, cur.getRate());
	}

}
