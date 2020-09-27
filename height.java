package yabo;
import java.util.Scanner;

public class height {

	public static void main(String[] args) {
		double heightFoot = 0;
		double heightInches;
        double heightInch;
        double newInch;
        System.out.print("Input your height in feet followed by inches: ");
	    Scanner s = new Scanner(System.in);
	    
	     
	    
	    heightFoot = s.nextDouble();
	    
	    Scanner s1 = new Scanner(System.in);
	    
	    heightInch = s1.nextDouble();
	    newInch = heightInch/10;
	    
	    
	    double total;
	    total = (heightFoot + newInch) * 12;
        
	    
	    
	    System.out.println("Height in inches");
	    System.out.println(total);
	   
	
	
	
	
	}

}
