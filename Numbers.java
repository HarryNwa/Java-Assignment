import java.util.Scanner;

public class Numbers{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter price;  ");
	int price = input.nextInt();
	
	System.out.println("Enter change: ");
	int change = input.nextInt();
	
	int sum = price + change;
	
	System.out.printf("The sum of the even and odd integers is %d%n", sum);
	
	
	}

}
