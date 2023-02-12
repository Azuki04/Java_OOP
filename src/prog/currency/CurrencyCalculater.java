package prog.currency;

public class CurrencyCalculater {
	private static final CurrencyCalculater instance = new CurrencyCalculater();
    
	private CurrencyLoader curLoader; 
    //private constructor to avoid client applications to use constructor
    private CurrencyCalculater(){
    	curLoader = new CurrencyLoader();
    }

    public static CurrencyCalculater getInstance(){
        return instance;
    }
    
    public double getCurrencyRate(String curName) {
 	Currency cur = curLoader.getCurrency(curName);
    	if (cur != null) {
    		return cur.getRate();
    	}
		return 0.00;    	
    }
    
    public void setCurrencyRate(double newRate, String currencyName ) {
    	Currency cur = curLoader.getCurrency(currencyName);
    	if (cur != null) {
    		cur.setRate(newRate);
    	}
    }
    
    public double calculateRate(double amount, String to) {
    	Currency cur = curLoader.getCurrency(to);
    	return this.calculate(amount, cur.getRate());
    }
    
    private double calculate( double inp, double multi) {
    	return inp * multi;
    }

	public void setCurrency( double rateNew, String curNew){
		this.curLoader.setCurrency(rateNew, curNew);	
	}
    
}
