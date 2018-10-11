package Inheritance;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class creditCard extends Card{

	/**
	 * @param exptarionDate
	 * @param holderName
	 * @param cardNumber
	 * @param accountBalance
	 * @param spendingLimit
	 * @param cardType
	 * @param cVV
	 * @param hasChip
	 * @param hasPaymentDue
	 * @param aPR
	 */
	public creditCard(Date exptarionDate, String holderName, String cardNumber, double accountBalance,
			double spendingLimit, ArrayList<String> cardType, int cVV, boolean hasChip, boolean hasPaymentDue,
			double aPR) {
		super(exptarionDate, holderName, cardNumber, accountBalance, spendingLimit);
		this.cardType = cardType;
		CVV = cVV;
		this.hasChip = hasChip;
		this.hasPaymentDue = hasPaymentDue;
		APR = aPR;
	}
	private ArrayList<String> cardType;
	private int CVV;
	private boolean hasChip;
	private boolean hasPaymentDue;
	private double APR;
	
	
	
	/**
	 * @return the cardType
	 */
	public ArrayList<String> getCardType() {
		return cardType;
	}
	/**
	 * @param cardType the cardType to set
	 */
	public void setCardType(ArrayList<String> cardType) {
		this.cardType = cardType;
	}
	/**
	 * @return the cVV
	 */
	public int getCVV() {
		return CVV;
	}
	/**
	 * @param cVV the cVV to set
	 */
	public void setCVV(int cVV) {
		CVV = cVV;
	}
	/**
	 * @return the hasChip
	 */
	public boolean isHasChip() {
		return hasChip;
	}
	/**
	 * @param hasChip the hasChip to set
	 */
	public void setHasChip(boolean hasChip) {
		this.hasChip = hasChip;
	}
	/**
	 * @return the hasPaymentDue
	 */
	public boolean isHasPaymentDue() {
		return hasPaymentDue;
	}
	/**
	 * @param hasPaymentDue the hasPaymentDue to set
	 */
	public void setHasPaymentDue(boolean hasPaymentDue) {
		this.hasPaymentDue = hasPaymentDue;
	}
	/**
	 * @return the aPR
	 */
	public double getAPR() {
		return APR;
	}
	/**
	 * @param aPR the aPR to set
	 */
	public void setAPR(double aPR) {
		APR = aPR;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "creditCard [cardType=" + cardType + ", CVV=" + CVV + ", hasChip=" + hasChip + ", hasPaymentDue="
				+ hasPaymentDue + ", APR=" + APR + ", exptarionDate=" + exptarionDate + ", holderName=" + holderName
				+ ", cardNumber=" + cardNumber + ", accountBalance=" + accountBalance + ", spendingLimit="
				+ spendingLimit + "]";
	}
	
	@Override
	public void increaseMyLimit() {
		
		spendingLimit = spendingLimit+100; 
		
		
	}
	

}
