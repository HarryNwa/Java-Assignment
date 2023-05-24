import java.util.Scanner;
public class Acceleration{
 public static void main(String[] args){
 	Scanner input = new Scanner(System.in);
 	
 	System.out.println("Enter velocity1  ");
  	double velocity1 = input.nextDouble();
  
	System.out.println("Enter velocity0  ");
  	double velocity0 = input.nextDouble();
  	
  	System.out.println("Enter time  ");
  	double time = input.nextDouble();
  	
  	double result = (velocity0 - velocity1) / time;
  	
  	System.out.printf("The average acceleration is %.4f%n", result);
 
 	
 
 	}

}
