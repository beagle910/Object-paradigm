package mypackage;

public class Cookie extends DessertItem {
	private int price;
	private int quantity;

	public Cookie(String n, int i, int p) {
		super(n);
		price = p;
		quantity = i;
	}

	@Override
	public int getCost() {
		return price * quantity;
	}

}
