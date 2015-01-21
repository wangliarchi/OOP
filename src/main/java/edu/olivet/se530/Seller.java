/**
 * 
 */
package edu.olivet.se530;

/**
 * @author <a href = "mailto:wangliarchi@gmail.com">Liya WangJan 20, 20159:33:05 PM
 *
 */
public class Seller {
	private String name;
	private String uuid;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the uuid
	 */
	public String getUuid() {
		return uuid;
	}
	/**
	 * @param uuid the uuid to set
	 */
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	/**
	 * @return the shipping
	 */
	public String getShipping() {
		return shipping;
	}
	/**
	 * @param shipping the shipping to set
	 */
	public void setShipping(String shipping) {
		this.shipping = shipping;
	}
	/**
	 * @return the shippingCountry
	 */
	public String getShippingCountry() {
		return shippingCountry;
	}
	/**
	 * @param shippingCountry the shippingCountry to set
	 */
	public void setShippingCountry(String shippingCountry) {
		this.shippingCountry = shippingCountry;
	}
	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}
	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}
	/**
	 * @return the ratingCount
	 */
	public int getRatingCount() {
		return ratingCount;
	}
	/**
	 * @param ratingCount the ratingCount to set
	 */
	public void setRatingCount(int ratingCount) {
		this.ratingCount = ratingCount;
	}
	/**
	 * @return the expeditedShippingAvailable
	 */
	public boolean isExpeditedShippingAvailable() {
		return expeditedShippingAvailable;
	}
	/**
	 * @param expeditedShippingAvailable the expeditedShippingAvailable to set
	 */
	public void setExpeditedShippingAvailable(boolean expeditedShippingAvailable) {
		this.expeditedShippingAvailable = expeditedShippingAvailable;
	}
	/**
	 * @return the expeditedAvailable
	 */
	public boolean isExpeditedAvailable() {
		return expeditedAvailable;
	}
	/**
	 * @param expeditedAvailable the expeditedAvailable to set
	 */
	public void setExpeditedAvailable(boolean expeditedAvailable) {
		this.expeditedAvailable = expeditedAvailable;
	}
	private String shipping;
	private String shippingCountry;
	private int rating;
	private int ratingCount;
	private boolean expeditedShippingAvailable;
	private boolean expeditedAvailable;
	
	
	
	
}
