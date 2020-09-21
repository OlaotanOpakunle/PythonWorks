package yabo;
import java.util.Scanner;
import java.util.Random;
import static java.lang.System.in;
import static java.lang.System.out;


public class rando {

	public static void main(String[] args) {
		int number;
		out.println("Input a number: ");
		Scanner s = new Scanner(in);
		Random myRandom = new Random();
		number = s.nextInt(10) + 1;
        
        
		
		if (number == 6) 
		{
			out.println("You win!");
		}
		
		else {
			
			
			out.println("You lose");
		
		
		}
	}

}
