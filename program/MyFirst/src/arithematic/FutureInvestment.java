package arithematic;

import java.util.Scanner;

public class FutureInvestment {

	public static void main(String[] args) {

			Scanner input = new Scanner(System.in);
			//final int Number_of_Years = 3;
			
			System.out.println("Enter the Amount Invested");
			double amount = input.nextDouble();
			
			System.out.println("Enter The Annual Interest Rate:");
			double annualInterestRate = input.nextDouble();
			
			System.out.println("Enter the number of Years:");
			double Number_of_Years = input.nextDouble();
			
			//to get the monthly interest
			
			double monthlyInterestRate = annualInterestRate/1200;
			
			//to print a table
			
			System.out.println("Years   Future Value");
			
			for (int years =1; years <= Number_of_Years; years++) {
				System.out.printf("%d",years);
				System.out.printf("%11.2f\n",futureInvestmentValue(amount,monthlyInterestRate,years*12));
			}
			
		}
		public static double futureInvestmentValue(double investmentAmount,
				double monthlyInterestRate,int years) {
			
			return investmentAmount*Math.pow(1+monthlyInterestRate/12, years*12);
			
		}
}
