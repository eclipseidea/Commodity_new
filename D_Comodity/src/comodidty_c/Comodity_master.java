package comodidty_c;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Comodity_master {
	static Scanner scanner = new Scanner(System.in);

	public static void info() {
		System.out.println("Enter number from 1 to 5 to select menu option:");
	}

	public static void main(String[] args) {
		List<Comodity> com = new ArrayList<Comodity>();
		Comodity comodity = new Comodity();
		comodity.addComodities(com);
		boolean workMainMenu = true;
		boolean workSubMenu = true;
		int page;

		System.out.println("Enter 1    for sort by ascending");
		System.out.println("Enter 2    for sort by descendingly");
		System.out.println("Enter 3    for show all comodities");
		System.out.println("Enter 4    for show pages");
		System.out.println("Enter 5   for exit");

		while (workMainMenu) {
			String menuOption = scanner.nextLine().replaceAll("[^0-9]", "");
			if (menuOption.length() == 0) {
				Comodity_master.info();
			} else if (menuOption.length() > 0) {
				int intMenuOption = Integer.parseInt(menuOption);
				if (intMenuOption >= 1 && intMenuOption <= 5) {
					switch (intMenuOption) {
					case 1:
						comodity.sortAscending(com);
						break;
					case 2:
						comodity.sortDescendingly(com);
						break;
					case 3:
						comodity.showAllComodity(com);
						break;
					case 4:
						System.out.println("Enter 1 for input page");
						System.out.println("Enter 2 for exit");
						workMainMenu = false;
						workSubMenu = true;
						while (workSubMenu) {
							String subOption = scanner.nextLine().replaceAll(
									"[^0-9]", "");
							if (subOption.length() == 0) {
								System.out.println("input 1 or 2");
							} else if (subOption.length() > 0) {
								int intSubOption = Integer.parseInt(subOption);
								if (intSubOption >= 1 && intSubOption <= 2) {
									switch (intSubOption) {
									case 1:
										System.out.println("input page");
										page = Comodity_master.scanner
												.nextInt();
										if (page >= 1 && page <= 11) {
											int max = page * 9;
											int min = max - 9;
											comodity.showPage(
													com.subList(min, max), page);
										} else {
											System.out
													.println("from 1 to 11 only");
										}
										break;
									case 2:
										workSubMenu = false;
										workMainMenu = true;
										System.out
												.println("exit from sub menu");
									}
								} else if (intSubOption > 2) {
									System.out
											.println("choise range from 1 to 2");
								}
							}
						}
						break;
					case 5:
						System.exit(5);
						workMainMenu = false;
						break;
					}
				} else {
					Comodity_master.info();
				}
			}
		}
	}

}
