/**
 * The class Product models a generic product in the store.
 *
 * @author  佟骜
 * id：20154905
 * data：2016/10/11
 * @version  1.0.0
 */


class Product {
	private String code;
	private String description;
	private double price;

	/**
	 * The class Product models a generic product in the store.
	 * @param initialCode  the code.
	 * @param initialDescription  the test Description.
	 * @param initialPrice  the test Price.
	 */
	public Product(String initialCode,String initialDescription,double initialPrice) {

		code = initialCode;
		description = initialDescription;
		price = initialPrice;
	}

	/**
	 * @return the value of instance variable code.
	 */
	public String getCode() {

		return code;
	}

	/**
	 * @return the value of instance variable description.
	 */
	public String getDescription() {

		return description;
	}

	/**
	 * @return the value of instance variable price.
	 */
	public double getPrice() {

		return price;
	}

	/**
	 * Overrides the method equals in the class Object.
	 * Two Product objects are equal if their codes are equal.
	 */
	public boolean equals(Object object) {

		if(object instanceof Product){

			Product one = (Product)object;
			return this.code.equals(one.code);
		}
		else{

			return false;
		}
	}

	/**
	 * Overrides the method toString in the class Object. Returns the string representation of a Product object.
	 * The String returned has the following format:
	 * code_description_price
	 */
	public String toString() {

		return this.code+"_"+this.description+"_"+this.price;
	}
}