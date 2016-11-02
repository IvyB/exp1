/**
 * The class Coffee models a coffee product. It extends class Product.
 *
 * @author  佟骜
 * id：20154905
 * data：2016/10/11
 * @version  1.0.0
 */

class Coffee extends Product {
	private String origin;
	private String roast;
	private String flavor;
	private String aroma;
	private String acidity;
	private String body;

	/**
	 * Constructor that initializes the instance variables code, description, price, origin, roast, flavor, aroma, acidity, and body.
	 *
	 * @param initialCode  the code.
	 * @param initialDescription  the Description.
	 * @param initialPrice  the Price.
	 * @param initialOrigin  the Origin.
	 * @param initialRoast  the Roast.
	 * @param initialFlavor  the Flavor.
	 * @param initialAroma  the Aroma.
	 * @param initialAcidity  the Acidity.
	 * @param initialBody  the Body.
	 */
	public Coffee(String initialCode,String initialDescription,double initialPrice,String initialOrigin,String initialRoast,String initialFlavor,String initialAroma,String initialAcidity,String initialBody) {

		super(initialCode,initialDescription,initialPrice);
		origin = initialOrigin;
		roast = initialRoast;
		flavor = initialFlavor;
		aroma = initialAroma;
		acidity = initialAcidity;
		body = initialBody;
	}

	/**
	 * @return the value of instance variable origin.
	 */
	public String getOrigin() {

		return  origin;
	}

	/**
	 * @return the value of instance variable roast.
	 */
	public String getRoast() {

		return roast;
	}

	/**
	 * @return the value of instance variable flavor.
	 */
	public String getFlavor() {

		return flavor;
	}

	/**
	 * @return the value of instance variable aroma.
	 */
	public String getAroma() {

		return aroma;
	}

	/**
	 * @return the value of instance variable acidity.
	 */
	public String getAcidity() {
		return acidity;
	}

	/**
	 * @return the value of instance variable body.
	 */
	public String getBody() {

		return body;
	}

	/**
	 * Overrides the method toString in the class Object.
	 * @return the string representation of a Coffee object.
	 * The String returned has the following format:
	 * code_description_price_origin_roast_flavor_aroma_acidity_body
	 */
	public String toString() {

		return this.getCode() + "_" + this.getDescription() + "_" + this.getPrice() + "_" + this.origin
				+ "_" + this.roast + "_" + this.flavor + "_" + this.aroma + "_"
				+ this.acidity + "_" + this.body;
	}
}