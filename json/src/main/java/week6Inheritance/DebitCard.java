/**
 * 
 */
package week6Inheritance;

import java.util.ArrayList;

/**
 * @author natal
 *
 */
public class DebitCard  extends Card 
{

	public DebitCard(int exptarionDate, String holderName, String cardNumber, int accountBalance, double spendingLimit,
			ArrayList<String> cardType, int lastThreeDigits, boolean hasChip,
			int pinNumber, boolean hasPicture) 
	{
		super(exptarionDate, holderName, cardNumber, accountBalance, spendingLimit);
		this.lastThreeDigits = lastThreeDigits;
		this.hasChip = hasChip;
		this.pinNumber = pinNumber;
		this.hasPicture = hasPicture;
	}

	private int lastThreeDigits;
	private boolean hasChip;
	private ArrayList<String> cardType;
	private int pinNumber; 
	private boolean hasPicture;
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DebitCard [list = " + cardType.toString() + "lastThreeDigits=" + lastThreeDigits + ", hasChip=" + hasChip + ", cardType=" + cardType
				+ ", pinNumber=" + pinNumber + ", hasPicture=" + hasPicture + "]";
	}
	

	public DebitCard(int exptarionDate, String holderName, String cardNumber, int accountBalance, double spendingLimit,
			int lastThreeDigits, boolean hasChip, ArrayList<String> Type, int pinNumber, boolean hasPicture) {
		super(exptarionDate, holderName, cardNumber, accountBalance, spendingLimit);
		
		this.lastThreeDigits = lastThreeDigits;
		this.hasChip = hasChip;
		this.cardType = Type;
		this.pinNumber = pinNumber;
		this.hasPicture = hasPicture;
	}


	/**
	 * @return the lastThreeDigits
	 */
	public int getLastThreeDigits() {
		return lastThreeDigits;
	}
	/**
	 * @param lastThreeDigits the lastThreeDigits to set
	 */
	public void setLastThreeDigits(int lastThreeDigits) {
		this.lastThreeDigits = lastThreeDigits;
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
	
	
}
