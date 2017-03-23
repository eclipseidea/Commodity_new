package comodidty_c;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Comodity_master {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		List<Comodity> com = new ArrayList<Comodity>();
		Comodity comodity = new Comodity();
		comodity.addComodities(com);
		boolean workMainMenu = true;
		int page;

		System.out.println("Enter 1    for sort by ascending");
		System.out.println("Enter 2    for sort by descendingly");
		System.out.println("Enter 3    for show all comodities");
		System.out.println("Enter 4    for show pages");
		System.out.println("Enter 5   for exit");

		while (workMainMenu) {
			String menuOption = scanner.nextLine().replaceAll("[^0-9]", "");
			if (menuOption.length() == 0) {
				System.out
						.println("Enter number from 1 to 5 to select menu option:");
			} else if (menuOption.length() > 0) {
				int intMenuOption = Integer.parseInt(menuOption);
				if (intMenuOption >= 1 && intMenuOption <= 5) {
					switch (menuOption) {
					case "1":
						comodity.sortAscending(com);
						break;
					case "2":
						comodity.sortDescendingly(com);
						break;
					case "3":
						comodity.showAllComodity(com);
						break;
					case "4":
						System.out.println("input comodity");
					    page = Comodity_master.scanner.nextInt();
						int max = page * 9;
						int min = 9 * page - 9;
						comodity.showPage(com.subList(min, max), page);
						break;
					case "5":
						System.exit(5);
						workMainMenu = false;
						break;
					}
				} else {
					System.out
							.println("Enter number from 1 to 5 to select menu option:");
				}
			}
		}
	}

}
