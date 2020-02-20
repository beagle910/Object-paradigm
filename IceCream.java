package mypackage;

public class IceCream extends DessertItem {
	private String icecreamName;
	private int price;

	public IceCream(String n, int price) {
		super(n);
		this.price = price;
	}

	@Override
	public int getCost() {
		return price;
	}

}
