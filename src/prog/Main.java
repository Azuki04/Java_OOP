package prog;

import java.util.*;

import prog.currency.CurrencyCalculater;

public class Main {

	public static void main(String[] args) {
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