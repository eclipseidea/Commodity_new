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
		System.out.println("Enter 4    for show page 1");
		System.out.println("Enter 5    for show page 2");
		System.out.println("Enter 6    for show page 3");
		System.out.println("Enter 7    for show page 4");
		System.out.println("Enter 8    for show page 5");
		System.out.println("Enter 9    for show page 6");
		System.out.println("Enter 10   for show page 7");
		System.out.println("Enter 11   for show page 8");
		System.out.println("Enter 12   for show page 9");
		System.out.println("Enter 13   for show page 10");
		System.out.println("Enter 14   for exit");

		while (workMainMenu) {
			if (scanner.hasNext()) {
				String menuOption = scanner.nextLine().replaceAll("[^0-9]", "");
				if (menuOption.length() == 0) {
					System.out
							.println("Enter number from 1 to 14 to select menu option:");
				} else if(menuOption.length()> 0) {
					int intMenuOption = Integer.parseInt(menuOption);
					if (intMenuOption >= 1 && intMenuOption <= 14) {
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
							page = 1;
							comodity.showPage(com.subList(0, 9), page);
							break;
						case "5":
							page = 2;
							comodity.showPage(com.subList(9, 18), page);
							break;
						case "6":
							page = 3;
							comodity.showPage(com.subList(18, 27), page);
							break;
						case "7":
							page = 4;
							comodity.showPage(com.subList(27, 36), page);
							break;
						case "8":
							page = 5;
							comodity.showPage(com.subList(36, 45), page);
							break;
						case "9":
							page = 6;
							comodity.showPage(com.subList(45, 54), page);
							break;
						case "10":
							page = 7;
							comodity.showPage(com.subList(54, 63), page);
							break;
						case "11":
							page = 8;
							comodity.showPage(com.subList(63, 72), page);
							break;
						case "12":
							page = 9;
							comodity.showPage(com.subList(72, 81), page);
							break;
						case "13":
							page = 10;
							comodity.showPage(com.subList(81, 90), page);
							break;
						case "14":
							System.exit(0);
							workMainMenu = false;
							break;
						}
					} else {
						System.out
								.println("Enter number from 1 to 14 to select menu option:");
					}
				}
			}
		}
	}

}
