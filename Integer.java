import java.util.Scanner;
public class Integer{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter any number from 0 to 1000:  ");
	int number = input.nextInt();
	
	int sumOfDigits = (number % 10) + ((number / 10) %10) + ((number / 100) % 10);
	
	System.out.printf("The sum of the digits is %d%n", sumOfDigits);
	
	
	}

}
