package Inheritance;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

import week6Inheritance.DebitCard;

public class TestDriverCard {
	/**
	 * 
	 * @param args
	 * @throws ParseException
	 */
	public static void main(String[] args) throws ParseException {

		// Create date format
		DateFormat df = new SimpleDateFormat("MM-dd-yyyy");
		Date d1 = df.parse("12-10-2022");
		Date d2 = df.parse("02-28-2025");
		Date d3 = df.parse("09-12-2033");
		
		//list of credit cards
		ArrayList<String> type = new ArrayList<String>();
		type.add("Visa");
		type.add("Discover");
		type.add("Master Card");

		// instantiate objects of classes
		Card card = new Card(d1, "natalia", "282 323 421 123", 2500, 1000);
		creditCard credit = new creditCard(d2, "John Smith", "234 565 123 567", 100000, 2500, type, 999, true, true, 6);
		debitCard debit = new debitCard(d3, "Jonathan Bond", "122 123 456 234", 442342, 123454, true, 2342, false);

		// list of objects
		ArrayList<Card> list = new ArrayList<Card>();
		list.add(card);
		list.add(credit);
		list.add(debit);

		// loop through the list of objects
		for (Card newList : list)
			System.out.println(newList);

		// loop for override method
		for (int i = 0; i < list.size(); i++) {
			list.get(i).increaseMyLimit();

		}
		
		

		// Example of polymorphism
		Card regularCard = new debitCard(d1, "Kate", "555 555 444 444 123", 44444, 250, true, 1212, true);
		regularCard.increaseMyLimit();
		credit.increaseMyLimit();
		System.out.println(credit.getSpendingLimit());
		card.increaseMyLimit();
		System.out.println(card.spendingLimit);
	}
}
