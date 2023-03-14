package prog;

import java.util.*;

import prog.account.Account;
import prog.currency.CurrencyCalculater;
import prog.currency.CurrencyLoader;

public class Main {

	public static void main(String[] args) {

		ArrayList<Account> clientList = new ArrayList<Account>();
		clientList.add(new Account("2012dE2eea02", "Mike", "Dao", 2302, 233.5));


//---------------------------------------------------//
		Integer [] zahlen = {5,2,8,4,1};
		Integer [] result = new Integer[5];
		for (Integer  zahl : zahlen) {
			System.out.print(zahl);
		}

		for (int zahl = 0; zahl < zahlen.length; zahl++) {
			for (int zahl2 = 0; zahl2 < zahlen.length ; zahl2++) {
				if( zahlen[zahl] < zahlen[zahl2]){
					int temp = zahlen[zahl];
					zahlen[zahl] = zahlen[zahl2];
					zahlen[zahl2] = temp;
				}
			}
		}

		for (Integer  zahl : zahlen) {
			System.out.print(zahl  + ", ");
		}
//------------------------------//
		System.out.println(clientList);
		CurrencyLoader test = new CurrencyLoader();
		System.out.println(test.currArray);
//-------------------------------------//
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Bearbeiter 1, Bitte Wechselwaehrung angeben: ");
			String curTo = sc.nextLine();
			System.out.println("Bearbeiter 1, Wieviel CHF m�chten Sie umwandeln?");
			double amount = sc.nextDouble();
			
			CurrencyCalculater calculator = CurrencyCalculater.getInstance();
			System.out.println("Bearbeiter 1, Sie erhalten " + calculator.calculateRate(amount, curTo) + " " + curTo);
			System.out.println("Bearbeiter 1, Was ist der Wechselkurs f�r USD?");
			System.out.println("Bearbeiter 1, Der aktuelle kurs ist " + calculator.getCurrencyRate("USD") );			
			
			System.out.println("Bearbeiter 2, Startet sein Programm ");
			CurrencyCalculater calculator2 = CurrencyCalculater.getInstance();
			System.out.println("Bearbeiter 2, Gibt den neuen Wechselkurs f�r USD ein:");
			double newRateUsd = sc.nextDouble();
			calculator2.setCurrencyRate(newRateUsd, "USD"); 
			
			System.out.println("Bearbeiter 1, Wieviel CHF m�chten Sie in USD wechseln?");
			double amountNewUsd = sc.nextDouble();
			System.out.println("Bearbeiter 1, Sie erhalten " + calculator.calculateRate(amountNewUsd, "USD") + " " + "USD");
			System.out.println("Bearbeiter 1, Bitte neue Währung eingeben?");
			String curNew = sc.next();
			System.out.println("Bearbeiter 1, Bitte neue Rate?");
			double rateNew = sc.nextDouble();
			calculator.setCurrency(rateNew, curNew);
			System.out.println("Bearbeiter 1, Sie erhalten " + calculator.calculateRate(100, curNew));

			
		} catch (Exception e) {
			System.out.println("error: " +e);
			System.out.println("Fehler");
		}


}
}