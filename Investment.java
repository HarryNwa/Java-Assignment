import java.util.Scanner;
import java.lang.Math;

	public class Investment{
		public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the investment amount: ");
		double investmentAmount = input.nextDouble();
		
		System.out.print("Enter the annualRate: ");
		double annualRate = input.nextDouble();
		
		System.out.print("Enter the number of years: ");
		double years = input.nextDouble();
		
		double monthlyInterestRate = annualRate / 1200;
		double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
		System.out.printf("Accumulated value is $%.2f%n", futureInvestmentValue);
		
		
		}
		
	}
