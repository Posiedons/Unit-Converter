package main;

import java.util.Scanner;

public class Converter {
	public static void main(String[] args) {
		int menuSelection = 1;
		
		Scanner scanner = new Scanner(System.in);
		while (menuSelection != 0) {
			
			System.out.println("Main Menu." + "\r\n");
			System.out.println("1. Volume conversions");
			System.out.println("2. Distance conversions ");
			System.out.println("3. Quit" + "\r\n");
			String Selection = scanner.nextLine();
			
			switch (Selection) {
				case "1":
					while (menuSelection != 0) {
						
						System.out.println("\r\n" + "Choose Desired Conversion." + "\r\n");
						System.out.println("1. Teaspoons to Tablespoons");
						System.out.println("2. Tablespoons to Teaspoons");
						System.out.println("3. Teaspoons to Cups");
						System.out.println("4. Cups to Teaspoons");
						System.out.println("5. Tablespoons to Cups");
						System.out.println("6. Cups to Tablespoons");
						System.out.println("7. Quit" + "\r\n");
						String VConv = scanner.nextLine();
						
						switch (VConv) {
							case "1":
								System.out.println("Op 1");
								menuSelection = 0;
								break;
							case "2":
								System.out.println("Op 2");
								menuSelection = 0;
								break;
							case "3":
								System.out.println("Op 3");
								menuSelection = 0;
								break;
							case "4":
								System.out.println("Op 4");
								menuSelection = 0;
								break;
							case "5":
								System.out.println("Op 5");
								menuSelection = 0;
								break;
							case "6":
								System.out.println("Op 6");
								menuSelection = 0;
								break;
							case "7":
								System.out.println("Operation Cancelled");
								menuSelection = 0;
								break;
							default:
								System.out.println("\r\n" + "Please select number from 1-7." + "\r\n");
								break;
						}
				}
					scanner.close();
					break;
				case "2":
					System.out.println("Distance conversion in Progress");
					scanner.close();
					menuSelection = 0;
					break;
				case "3":
					System.out.println("Operation Cancelled");
					scanner.close();
					menuSelection = 0;
					break;
				default:
					System.out.println("\r\n" + "Please select number from 1-3." + "\r\n");
					break;
			}
	}
	}
}
