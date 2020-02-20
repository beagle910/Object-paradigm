package mypackage;

import java.util.ArrayList;

public class Checkout {

	private ArrayList<DessertItem> list;
	int sumCost;
	int Tax;

	public Checkout() {
		list = new ArrayList<DessertItem>();
	}

	public void enterItem(DessertItem d) {
		list.add(d);
	}

	public int numberOfItems() {
		return list.size();
	}

	public int totalCost() {
		sumCost = 0;
		for (int i = 0; i < list.size(); i++) {
			sumCost += list.get(i).getCost();
		}
		return sumCost;
	}

	public void clear() {
		list.clear();
	}

	public int totalTax() {
		Tax = 0;
		double t = sumCost * DessertShoppe.TAX_RATE * 0.01;
		return (int) Math.rint(t);
	}

	public String toString() {
		String res = "";
		res += "Number of items:" + "	" + this.numberOfItems() + '\n';
		for (int i = 0; i < list.size(); i++) {
			res += list.get(i).getName() + "		" + list.get(i).getCost() + '\n';
		}
		res += "TotalCost(Before tax)" + "	" + this.totalCost() + '\n';
		res += "TotalTax" + "		" + this.totalTax() + '\n';
		res += "Total(after tax): " + "	" + (this.totalCost() + this.totalTax());
		return res;
	}

}
