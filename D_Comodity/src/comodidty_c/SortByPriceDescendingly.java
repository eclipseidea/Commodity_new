package comodidty_c;

import java.util.Comparator;

public class SortByPriceDescendingly implements Comparator<Comodity> {

	@Override
	public int compare(Comodity o1, Comodity o2) {
		return o2.getPrice()-o1.getPrice();
	}
}
