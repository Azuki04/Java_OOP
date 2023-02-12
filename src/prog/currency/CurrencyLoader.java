package prog.currency;

import java.util.ArrayList;

public class CurrencyLoader {
	private ArrayList<Currency> currArray = new ArrayList<Currency>();
	
	public CurrencyLoader() {
		this.initCurrency();
	}
	
	private void initCurrency() {
		currArray.add(new Currency("CHF", 1.00));
		currArray.add(new Currency("EUR", 0.96));
		currArray.add(new Currency("USD", 1.01));
		currArray.add(new Currency("GBP", 0.82));
		currArray.add(new Currency("CAD", 1.29));	
	}
	
	public Currency getCurrency(String cur) {
		for (int i = 0; i < currArray.size(); i++) {
			if (currArray.get(i).getCurrency() == cur) {
				return currArray.get(i);
			}
		}
		return null;
	}

	public void setCurrency( double rateNew, String curNew){
		currArray.add(new Currency(curNew, rateNew));	
	}

}


	

