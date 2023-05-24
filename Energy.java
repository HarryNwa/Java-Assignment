import java.util.Scanner;

public class Energy{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter amount of water in kilograms:  ");
	double water = input.nextDouble();
	
	System.out.println("Enter initial temperature:  ");
	double initial = input.nextDouble();
	
	System.out.println("Enter final temperature:  ");
	double temperature = input.nextDouble();
	
	double last = temperature - initial;
	double weight = last * water;
	double joules = weight * 4184;
	
	System.out.printf("The energy needed is %.1f%n", joules);
	
	}
	
}
