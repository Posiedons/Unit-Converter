package main;

import java.util.Scanner;

public class Converter {
	public static void main(String[] args) {
		int menuSelection = -1;
		
		Scanner scanner = new Scanner(System.in);
		mainloop:
		while (menuSelection != 4) {
			
			System.out.println("Main Menu." + "\r\n");
			System.out.println("1. Volume conversions");
			System.out.println("2. Distance conversions ");
			System.out.println("3. Quit" + "\r\n");
			String Selection = scanner.nextLine();
			
			switch (Selection) {
				case "1":
					System.out.println("Volume conversion in progress");
					scanner.close();
					break mainloop;
				case "2":
					System.out.println("Distance conversion in Progress");
					scanner.close();
					break mainloop;
				case "3":
					System.out.println("Operation Cancelled");
					scanner.close();
					break mainloop;
				default:
					System.out.println("\r\n" + "Please select number from 1-3." + "\r\n");
					break;
			}
	}
	}
}
