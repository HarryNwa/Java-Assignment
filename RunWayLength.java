import java.util.Scanner;
public class RunWayLength{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.println("Velocity in meter per second:  ");
	int velocity = input.nextInt();
	
	System.out.println("Acceleration in meter per second square:  ");
	double acceleration = input.nextDouble();
	
	int square = velocity * velocity;
	double acer = 2 * acceleration;
	
	double length = square / acer;
	
	System.out.printf("The minimum runway length for this airplane is %.3f%n", length);
	
	
	
	}

}
