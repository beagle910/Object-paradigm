package mypackage;

public class Sundae extends IceCream {
	private String topping;
	private int price;
	private int toppingPrice;

	public Sundae(String n, int i, String topping, int price) {
		super(n, i);
		this.topping = topping;
		toppingPrice = price;
		this.price = i;
	}

	public int getCost() {
		return price + toppingPrice;
	}

}
