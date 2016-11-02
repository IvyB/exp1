/**
 * Class CoffeeBrewer models a coffee brewer. It extends class Product.
 *
 * @author  佟骜
 * id：20154905
 * data：2016/10/11
 * @version  1.0.0
 */


class CoffeeBrewer extends Product{
	private String model;
	private String waterSupply;
	private int numberOfCups;

	/**
	 * Constructor that initializes the instance variables code, description, price, model, waterSupply, and numberOfCups.
	 *
	 * @param initialCode  the code.
	 * @param initialDescription  the Description.
	 * @param initialPrice  the Price.
	 * @param initialModel  the Model.
	 * @param initialWaterSupply  the WaterSupply 	.
	 * @param initialNumberOfCups  the NumberOfCups.
	 */
	public CoffeeBrewer(String initialCode,String initialDescription, double initialPrice,String initialModel,String initialWaterSupply,int initialNumberOfCups) {

		super(initialCode,initialDescription,initialPrice);
		model = initialModel;
		waterSupply = initialWaterSupply;
		numberOfCups = initialNumberOfCups;
	}

	/**
	 * @return the value of instance variable model
	 */
	public String getModel() {

		return model;
	}

	/**
	 * @return the value of instance variable waterSupply.
	 */
	public String getWaterSupply() {

		return waterSupply;
	}

	/**
	 * @return the value of instance variable numberOfCups.
	 */
	public int getNumberOfCups() {

		return numberOfCups;
	}

	/**
	 *  Overrides the method toString in the class Object.
	 *  @return the string representation of a CoffeeBrewer object.
	 *  The String returned has the following format:
	 *  code_description_price_model_waterSupply_numberOfCups

	 */
	public String toString(){
		return this.getCode() + "_" + this.getDescription() + "_" + this.getPrice() + "_"
				+ this.model + "_" + this.waterSupply + "_" + this.numberOfCups;
	}
}