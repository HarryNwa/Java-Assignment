import java.util.Scanner;

public class DrivingCost{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter driving distance:  ");
	double distance = input.nextDouble();
	
	System.out.println("Enter miles in gallon:  ");
	double miles = input.nextDouble();
	
	System.out.println("Enter price per gallon:  ");
	double price = input.nextDouble();
	
	double carFuel = distance / miles;
	double totalFuel = carFuel * price;
	
	System.out.printf("The cost of driving is $%.2f%n", totalFuel);
	
	}

}
