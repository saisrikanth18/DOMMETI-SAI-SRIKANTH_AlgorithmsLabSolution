package com.DSA.LAB2.paymoney.transactions;

import java.util.Scanner;

public class PayMoneyTransactionUI {

	private int[] transactions;
	private Scanner input;
	
	public PayMoneyTransactionUI() {
		
		input = new Scanner(System.in);
	}
	
	public void init() {
		
		gatherInputsAndProcess();
	}
	
	private void gatherInputsAndProcess() {
		
		System.out.println("Enter the size of the transaction array :");	
		int transactionArraySize = input.nextInt();	
		transactions = new int[transactionArraySize];
		

		System.out.println("Enter the transaction array element(s):");	
		for (int index = 0; index < transactionArraySize; index ++) {

			transactions[index] = input.nextInt();
			input.nextLine();
		}				
		
		System.out.print("Enter the number of transaction (instances) to be achieved:");
		int transactionsInstanceSize = input.nextInt();
		
		input.nextLine();
		
		for (int index = 1; index <= transactionsInstanceSize; index ++) {

			System.out.println();
			System.out.print("Enter the transaction / target value :");
			int dailyTarget = input.nextInt();

			input.nextLine();

			System.out.println("Processing transaction with value -> " + dailyTarget);
		
			TargetAchievmentCalculator calculator = new TargetAchievmentCalculator(transactions, dailyTarget);
			
			calculator.calculate();
			
			calculator.printOutcome();
		}
		
	}
}
