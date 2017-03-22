package comodidty_c;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class Comodity {
	private String name;
	private int weight;
	private int price;

	public Comodity() {
	}

	public Comodity(String name, int weight, int price) {
		super();
		this.name = name;
		this.weight = weight;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "{name=" + name + ", weight=" + weight + ", price=" + price
				+ "}";
	}

	public void addComodities(List<Comodity> com) {
		for (int i = 0; i <= 89; i++) {
			int weight = 100 + (int) (Math.random() * (999 - 100));
			int price = 1000 + (int) (Math.random() * (9999 - 1000));
			String name = "item"+ UUID.randomUUID().toString()
					.replaceAll("[^a-zA-Z]", "").toUpperCase().substring(0, 4);
			Comodity comodity = new Comodity(name, weight, price);
			com.add(comodity);
		}
	}

	public void showAllComodity(List<Comodity> com){
	    for (Comodity comm : com) {
		System.out.println(comm);
	    }
	}
	
	public void sortAscending(List<Comodity> com) {
		Collections.sort(com, new SortByPriceAscending());
		System.out.println("sorted price by ascending");
	}

	public void sortDescendingly(List<Comodity> com) {
		Collections.sort(com, new SortByPriceDescendingly());
		System.out.println("sorted price by descendingly");
		
	}

	public void showPage(List<Comodity> com, int page) {
		for (int i = 0; i < 3; i++) {
			System.out.printf("     %1$s   %2$s   %3$s%n", 
		    com.get(i),com.get(i + 3), com.get(i + 6));
		}
		System.out.print("                                               ");
		for (int i = 1; i <=10; i++) {
			if (i == page) {
			} else {
				System.out.print(" " + i + " ");
			}
			if (i == page) {
				System.out.print("{" + page + "}");
			}
		}
	        System.out.println();
	}
}
