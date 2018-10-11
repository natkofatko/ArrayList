package week6Inheritance;

import java.util.ArrayList;

public class Card {

	// data members

	protected int exptarionDate;
	protected static String holderName;
	protected String cardNumber;
	protected static int accountBalance;
	protected double spendingLimit;
	
 //protected ArrayList<String> cardType; 
	


public Card(int exptarionDate, String holderName, String cardNumber, int accountBalance, double spendingLimit) {
		super();
		this.exptarionDate = exptarionDate;
		this.holderName = holderName;
		this.cardNumber = cardNumber;
		this.accountBalance = accountBalance;
		this.spendingLimit = spendingLimit;
	}



	

	/**
	 * @return the exptarionDate
	 */
	public int getExptarionDate() {
		return exptarionDate;
	}

	/**
	 * @param exptarionDate the exptarionDate to set
	 */
	public void setExptarionDate(int exptarionDate) {
		this.exptarionDate = exptarionDate;
	}

	/**
	 * @return the holderName
	 */
	public String getHolderName() {
		return holderName;
	}

	/**
	 * @param holderName the holderName to set
	 */
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	/**
	 * @return the cardNumber
	 */
	public String getCardNumber() {
		return cardNumber;
	}

	/**
	 * @param cardNumber the cardNumber to set
	 */
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	/**
	 * @return the accountBalance
	 */
	public int getAccountBalance() {
		return accountBalance;
	}

	/**
	 * @param accountBalance the accountBalance to set
	 */
	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}

	/**
	 * @return the spendingLimit
	 */
	public double getSpendingLimit() {
		return spendingLimit;
	}

	/**
	 * @param spendingLimit the spendingLimit to set
	 */
	public void setSpendingLimit(double spendingLimit) {
		this.spendingLimit = spendingLimit;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Card [exptarionDate=" + exptarionDate + ", holderName=" + holderName + ", cardNumber=" + cardNumber
				+ ", accountBalance=" + accountBalance + ", spendingLimit=" + spendingLimit + 
	 "]";
	}
	
	
	
	
}
