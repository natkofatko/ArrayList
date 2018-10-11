package Inheritance;

import java.util.Date;



public class Card {
	protected Date exptarionDate;
	protected String holderName;
	protected String cardNumber;     //change it to String
	protected double accountBalance;  
	protected double spendingLimit;  
	/**
	 * @param exptarionDate
	 * @param holderName
	 * @param cardNumber
	 * @param accountBalance
	 * @param spendingLimit
	 */
	public Card(Date exptarionDate, String holderName, String cardNumber, double accountBalance, double spendingLimit) {
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
	public Date getExptarionDate() {
		return exptarionDate;
	}
	/**
	 * @param exptarionDate the exptarionDate to set
	 */
	public void setExptarionDate(Date exptarionDate) {
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
	public double getAccountBalance() {
		return accountBalance;
	}
	/**
	 * @param accountBalance the accountBalance to set
	 */
	public void setAccountBalance(double accountBalance) {
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
		return "Card [exptarionDate=" + exptarionDate + ", olderName=" + holderName + ", cardNumber=" + cardNumber
				+ ", accountBalance= $" + accountBalance + ", spendingLimit= $" + spendingLimit + "]";
	}
	
	
	public void increaseMyLimit()
	{
		System.out.println("Available for a debit and credit card ");
	}
	

}
