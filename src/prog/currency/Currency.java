package prog.currency;

public class Currency {
	private String currencyName = "";
	private double currencyRate = 1.00;

	public Currency(String cur, double rate) {
		this.currencyName = cur;
		this.currencyRate = rate;
	}
	
	public String getCurrency() {
		return this.currencyName;
	}
	
	public double getRate() {
		return this.currencyRate;
	}
	
	public void setRate(double rate) {
		this.currencyRate = rate;
	}

	public void setCurrency(String name) {
		this.currencyName = name;
	}

	@Override
	public String toString() {
		return "Account: [currencyRate= " + currencyRate + ", currencyName= " + currencyName  + " ]";
	}
	
}
