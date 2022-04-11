package com.DSA.LAB2.paymoney.transactions;

public class TargetAchievmentCalculator {

	private int[] transactions;
	private int dailyTarget;
	private boolean dailyTargetAchieved;
	private int transactionCounter;
	
	public TargetAchievmentCalculator(
		int[] transactions, int dailyTarget) {
		
		this.transactions = transactions;
		this.dailyTarget = dailyTarget;	
		this.dailyTargetAchieved = false;
		this.transactionCounter = 0;
	}
	
	public void calculate() {
		
		int tempCounter = 0;
	
		for (int index = 0; index < transactions.length; index ++) {
			
			int targetValue = transactions[index];
			tempCounter = tempCounter + targetValue;
			
			transactionCounter ++;
			if (tempCounter >= dailyTarget) {
				dailyTargetAchieved = true;
				break;
			}
		}
	}
	
	public void printOutcome() {
		
		if (dailyTargetAchieved) {
			System.out.println("Daily target of [" 
					+ dailyTarget + "] achieved after [" 
						+ transactionCounter + "] transaction(s)");
		}else {
			System.out.println("Daily target of [" 
				+ dailyTarget 
					+ "] is yet to be achieved...");			
		}		
	}
	
	public static void main(String[] args) {
		
		test(new int[] {75, 54, 23, 34, 14 }, 175);
		test(new int[] {20, 12, 31}, 21);
		test(new int[] {20, 12, 31}, 19);
		test(new int[] {100}, 101);
	}
	
	private static void test(int[] transactions, int dailyTarget) {
		
		System.out.println("--------------------------");

	
		TargetAchievmentCalculator calculator 
			= new TargetAchievmentCalculator(transactions, dailyTarget);
		calculator.calculate();
		calculator.printOutcome();
	}
	
}

