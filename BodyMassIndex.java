import java.util.Scanner;

public class BodyMassIndex{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
	
	System.out.println("Enter weight in pounds ");
	double weight = input.nextDouble();
	
	System.out.println("Enter height in inches ");
	double height = input.nextDouble();
	
	double onePound = 0.45359237;
	double oneInch = 0.0254;
	
	weight = onePound * weight;
	height = oneInch * height;
	
	double BMI = weight / (height * height);
	
	System.out.printf("The BMI is %.4f%n", BMI);
	
	
	}

}
