/**
 * 
 */
package edu.olivet.se530;

/**
 * @author <a href = "mailto:wangliarchi@gmail.com">Liya WangJan 20, 20159:40:01 PM
 *
 */
public class Condition implements Comparable<Condition>{
	/**
	 * @return the primary
	 */
	public String getPrimary() {
		return primary;
	}

	/**
	 * @param primary the primary to set
	 */
	public void setPrimary(String primary) {
		this.primary = primary;
	}

	/**
	 * @return the secondary
	 */
	public String getSecondary() {
		return secondary;
	}

	/**
	 * @param secondary the secondary to set
	 */
	public void setSecondary(String secondary) {
		this.secondary = secondary;
	}

	/**
	 * @return the primaryValue
	 */
	public int getPrimaryValue() {
		return primaryValue;
	}

	/**
	 * @param primaryValue the primaryValue to set
	 */
	public void setPrimaryValue(int primaryValue) {
		this.primaryValue = primaryValue;
	}

	/**
	 * @return the secondaryValue
	 */
	public int getSecondaryValue() {
		return secondaryValue;
	}

	/**
	 * @param secondaryValue the secondaryValue to set
	 */
	public void setSecondaryValue(int secondaryValue) {
		this.secondaryValue = secondaryValue;
	}

	private String primary;
	private String secondary;
	
	public static final int NEW = 100;
	
	public static final int USED = 50;
	public static final int LIKE_NEW = 10;
	public static final int VERY_GOOD = 5;
	public static final int GOOD = 5;
	public static final int ACCEPTABLE = 0;
	
	
	private int primaryValue;
	private int secondaryValue;
	
	
	public int compareTo(Condition o)
	{
		int rc = -Integer.compare(this.getPrimaryValue(), o.getPrimaryValue());
		if (rc == 0)
		{
			return -Integer.compare(this.getSecondaryValue(), o.getSecondaryValue());
		}
		return rc;
	}
}
