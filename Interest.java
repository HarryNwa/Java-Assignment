public class Interest{
	public static void main(String[] args){
	
	double interest = 3.5;
	double balance = 1000;
	double time = 12;
	
	double variable = interest / time;
	double monthlyBalance = variable * balance;
	double newInterestRate = monthlyBalance / 1200;
	
	double annualInterestRate = newInterestRate * time;
	
	System.out.printf("The annual interest rate is %.5f%n", annualInterestRate);
	
	
	
	}

}
