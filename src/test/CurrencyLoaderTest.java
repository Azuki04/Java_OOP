package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import prog.currency.CurrencyLoader;

class CurrencyLoaderTest {

	@Test
	void testGetCurrency() {
		CurrencyLoader loader = new CurrencyLoader();
		Assertions.assertTrue(loader.getCurrency("CHF").getCurrency().equals("CHF"));
		Assertions.assertTrue(loader.getCurrency("EUR").getCurrency().equals("EUR"));
		Assertions.assertTrue(loader.getCurrency("USD").getCurrency().equals("USD"));
		Assertions.assertTrue(loader.getCurrency("CAD").getCurrency().equals("CAD"));
	}

}
