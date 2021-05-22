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
						System.out.println("\r\n");
						
						switch (VConv) {
							case "1":
								//Convert Teaspoons to Tablespoons
								System.out.println("Specify Quanitity of Unit." + "\r\n");
								double unit1 = scanner.nextDouble();
								Conversions Cteat = new Conversions();
								Cteat.Tea = unit1;
								Cteat.teatot();
								menuSelection = 0;
								break;
							case "2":
								//Convert Tablespoons to Teaspoons
								System.out.println("Specify Quanitity of Unit." + "\r\n");
								double unit2 = scanner.nextDouble();
								Conversions Ctablet = new Conversions();
								Ctablet.Table = unit2;
								Ctablet.tabletot();
								menuSelection = 0;
								break;
							case "3":
								//Convert Teaspoons to Cups
								System.out.println("Specify Quanitity of Unit." + "\r\n");
								double unit3 = scanner.nextDouble();
								Conversions Cteac = new Conversions();
								Cteac.Tea = unit3;
								Cteac.teatoC();
								menuSelection = 0;
								break;
							case "4":
								//Convert Cups to Teaspoons
								System.out.println("Specify Quanitity of Unit." + "\r\n");
								double unit4 = scanner.nextDouble();
								Conversions Ccupt = new Conversions();
								Ccupt.Cup = unit4;
								Ccupt.Cuptotea();
								menuSelection = 0;
								break;
							case "5":
								// Convert Tablespoons to Cups
								System.out.println("Specify Quanitity of Unit." + "\r\n");
								double unit5 = scanner.nextDouble();
								Conversions Ctablec = new Conversions();
								Ctablec.Table = unit5;
								Ctablec.tabletoC();
								menuSelection = 0;
								break;
							case "6":
								//Convert Cups to Tablespoons
								System.out.println("Specify Quanitity of Unit." + "\r\n");
								double unit6 = scanner.nextDouble();
								Conversions CcupT = new Conversions();
								CcupT.Cup = unit6;
								CcupT.Cuptotable();
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
					while (menuSelection != 0) {
						
						System.out.println("\r\n" + "Choose Desired Conversion." + "\r\n");
						System.out.println("1. Feet to Meters");
						System.out.println("2. Meters to Feet");
						System.out.println("3. Miles to Kilometers");
						System.out.println("4. Kilometers to Miles");
						System.out.println("5. Feet to Miles");
						System.out.println("6. Miles to Feet");
						System.out.println("7. Quit" + "\r\n");
						String DConv = scanner.nextLine();
						System.out.println("\r\n");
						switch (DConv) {
						case "1":
							//Convert Feet to Meters
							System.out.println("Specify Quanitity of Unit." + "\r\n");
							double unit1 = scanner.nextDouble();
							Conversions CfeettoM = new Conversions();
							CfeettoM.Feet = unit1;
							CfeettoM.FeettoM();
							menuSelection = 0;
							break;
						case "2":
							//Convert Meters to Feet
							System.out.println("Specify Quanitity of Unit." + "\r\n");
							double unit2 = scanner.nextDouble();
							Conversions CMetertoF = new Conversions();
							CMetertoF.Meter = unit2;
							CMetertoF.MetertoF();
							menuSelection = 0;
							break;
						case "3":
							//Convert Miles to Kilometers
							System.out.println("Specify Quanitity of Unit." + "\r\n");
							double unit3 = scanner.nextDouble();
							Conversions CmilestoK = new Conversions();
							CmilestoK.Mile = unit3;
							CmilestoK.Milestokilo();
							menuSelection = 0;
							break;
						case "4":
							//Convert Kilometers to Miles
							System.out.println("Specify Quanitity of Unit." + "\r\n");
							double unit4 = scanner.nextDouble();
							Conversions KilotoM = new Conversions();
							KilotoM.Kilometer = unit4;
							KilotoM.KilotoM();
							menuSelection = 0;
							break;
						case "5":
							// Convert Feet to Miles
							System.out.println("Specify Quanitity of Unit." + "\r\n");
							double unit5 = scanner.nextDouble();
							Conversions CFeettoM = new Conversions();
							CFeettoM.Feet = unit5;
							CFeettoM.FeettoMile();
							menuSelection = 0;
							break;
						case "6":
							//Convert Miles to Feet
							System.out.println("Specify Quanitity of Unit." + "\r\n");
							double unit6 = scanner.nextDouble();
							Conversions CMiletoF = new Conversions();
							CMiletoF.Mile = unit6;
							CMiletoF.MiletoFeet();
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
				case "3":
					System.out.println("Operation Cancelled");
					scanner.close();
					menuSelection = 0;
					break;
				default:
					System.out.println("\r\n" + "Please select number from 1-3." + "\r\n");
					scanner.close();
					break;
			}
	}
		System.out.println("\r\n" + "Program Complete.");
	}
}
