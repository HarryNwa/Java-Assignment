import java.util.Scanner;

public class Pounds2Kilo{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter figure in pounds:  ");
	double pounds = input.nextDouble();
	
	double onePound = 0.454;
	double figure = onePound * pounds;
	
	double result = pounds;
	
	System.out.printf("%.1f pounds is %.3f kilograms%n", result, figure);
	
	}
	
}
