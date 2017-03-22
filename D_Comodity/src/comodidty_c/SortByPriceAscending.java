package comodidty_c;

import java.util.Comparator;

public class SortByPriceAscending implements Comparator<Comodity> {

	@Override
	public int compare(Comodity o1, Comodity o2) {
		return o1.getPrice() - o2.getPrice();
	}

}
