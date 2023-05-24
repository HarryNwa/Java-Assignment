import java.util.Scanner;
public class Geometry{
	
	public static void main (String[] args){
	Scanner input = new Scanner (System.in);
	  
	    double x1 = 1.5;
	    double y1 = -3.4;
	    double x2 = 4.6;
	    int y2 = 5;
	    double x3 = 9.5;
	    double y3 = -3.4;
	    
	    double side1 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
	    double side2 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
	    double side3 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	    
	    double halfPerimeter = (side1 + side2 + side3) / 2;
	    
	    double triangleArea = Math.sqrt(halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3));
	  
	    System.out.printf("The area of %.lf%n is ", triangleArea);

	}

}
