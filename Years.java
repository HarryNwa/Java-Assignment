import java.util.Scanner;
public class Years{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter number of minutes:  ");
	int minutes = input.nextInt();
	
	long year = minutes / (60 * 24 * 365);
	int days = minutes / (60 * 24) % 365;
	
	
	System.out.printf("%d minutes is approximately %d years and %d days%n", minutes, year, days);
	
	
	
	}

}
