package Inheritance;

import java.util.ArrayList;
import java.util.Date;

public class debitCard  extends Card {
	
	
	private boolean hasChip;
	private int pinNumber; 
	private boolean hasPicture;
	/**
	 * @param exptarionDate
	 * @param holderName
	 * @param cardNumber
	 * @param accountBalance
	 * @param spendingLimit
	 * @param hasChip
	 * @param pinNumber
	 * @param hasPicture
	 */
	public debitCard(Date exptarionDate, String holderName, String cardNumber, double accountBalance, double spendingLimit,
			boolean hasChip, int pinNumber, boolean hasPicture) {
		super(exptarionDate, holderName, cardNumber, accountBalance, spendingLimit);
		this.hasChip = hasChip;
		this.pinNumber = pinNumber;
		this.hasPicture = hasPicture;
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
	 * @return the pinNumber
	 */
	public int getPinNumber() {
		return pinNumber;
	}
	/**
	 * @param pinNumber the pinNumber to set
	 */
	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}
	/**
	 * @return the hasPicture
	 */
	public boolean isHasPicture() {
		return hasPicture;
	}
	/**
	 * @param hasPicture the hasPicture to set
	 */
	public void setHasPicture(boolean hasPicture) {
		this.hasPicture = hasPicture;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "debitCard [hasChip=" + hasChip + ", pinNumber=" + pinNumber + ", hasPicture=" + hasPicture
				+ ", exptarionDate=" + exptarionDate + ", holderName=" + holderName + ", cardNumber=" + cardNumber
				+ ", accountBalance=" + accountBalance + ", spendingLimit=" + spendingLimit + "]";
	}
	

	/* (non-Javadoc)
	 * @see Inheritance.Card#increaseMyLimit()
	 */
	@Override
	public void increaseMyLimit() {
		spendingLimit = spendingLimit+20%spendingLimit; 
		
		
		
	}
	

}
