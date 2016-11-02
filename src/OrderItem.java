/**
 * Class OrderItem models an item in an order.
 *
 * @author  TongAo
 * id：20154905
 * data：2016/10/11
 * @version  1.0.1
 */
class OrderItem{
	private int quantity;
	private Product product;

	/**
	 * Constructor that initializes the instance variables product and quantity.
	 * @param initialProduct  the Product.
	 * @param initialQuantity  the test Quantity.
	 */
	public OrderItem(Product initialProduct,int initialQuantity) {

		product = initialProduct;
		quantity = initialQuantity;
	}

	/**
	 * @return  the value of the instance variable product, a reference to a Product object.
	 */
	public Product getProduct() {

		return product;
	}

	/**
	 * @return   the value of the instance variable quantity.
	 */
	public int getQuantity() {

		return quantity;
	}

	/**
	 * @return  Returns the product of quantity and price.
	 */
	public double getValue() {

		return quantity*product.getPrice();
	}

	/**
	 * Sets the instance variable quantity to the value of parameter newQuantity.
	 */

	public void setQuantity(int newQuantity) {

		quantity = newQuantity;
	}
}
