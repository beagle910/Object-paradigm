package mypackage;

public class Candy extends DessertItem {
	private String name;
	private int price;
	private double pound;

	public Candy(String n, double pound, int price) {
		super(n);
		this.price = price;
		this.pound = pound;
	}

	@Override
	public int getCost() {
		return (int) (price * pound);
	}

}
