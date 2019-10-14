package com.promineotech.finalProjectApi.util;

public enum SustainabilityProceeds {


	AutoGiveback(.10);
	
	private double proceed;
	
	SustainabilityProceeds(double proceeds, double proceed) {
		this.proceed = proceed;
	}
	
	public double getProceed() {
		return proceed;
	}
	
	int choice = 0;
	while (choice != 4) {
		showMenu();
		choice = getUserChoice();
		if (choice == 1) {
			showChoices();
		} else if (choice == 2) {
			addAdditional10();
		} else if (choice == 3) {
			addAdditional20();
		} else if (choice == 4) {
			System.out.println("Goodbye!");
		} else {
			System.out.println("Please select a valid option!");
		}
	}
	public static void showMenu() {
	System.out.println("1) Show choices");
	System.out.println("2) Add additional 10 percent");
	System.out.println("3) Add additional 20 percent");
	System.out.println("4) Exit");
}
	public static void addAdditionalProceed() {
		System.out.println("We automatically donate 10 percent of your purchase to the Rainforrest Alliance." +
	"If you would like to add any additional proceeds please enter 1 to see option, or enter 4: ");
		String proceed = scanner.next();
		proceeds.add(proceed);
	
		System.out.println("Proceeds added: " +  proceed);

	}
}