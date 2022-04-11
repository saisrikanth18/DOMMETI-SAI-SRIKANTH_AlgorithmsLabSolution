package com.DSA.LAB2.traveller.currencyspend;

import java.util.Scanner;

public class TravellerCurrencySpendUI {

	private int[] denominations;
	private Scanner input;
	
	public TravellerCurrencySpendUI() {
		
		input = new Scanner(System.in);
	}
	
	public void init() {
		
		gatherInputsAndProcess();
	}
	
	private void gatherInputsAndProcess() {
		
		System.out.println("Enter the size of the currency denominations:");	
		int denominationsArraySize = input.nextInt();	
		denominations = new int[denominationsArraySize];
		

		System.out.println("Enter the currency denomination value(s):");	
		for (int index = 0; index < denominationsArraySize; index ++) {

			denominations[index] = input.nextInt();
			input.nextLine();
		}		
		
		System.out.println("Enter the pay amount:");	
		int payAmount = input.nextInt();	

		CurrencyDenominationsDeterminator determinator = new CurrencyDenominationsDeterminator(denominations, payAmount);
		determinator.determine();

	}
}

