package yabo;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadStars {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner s = new Scanner(new File("stars.txt"));
		char symbol;

		while(s.hasNext()) {
			symbol = s.findWithinHorizon(".", 0).charAt(0);
			
			while(symbol == '*') {
				
				System.out.print(symbol);
				symbol = s.findWithinHorizon(".", 0).charAt(0);
			}
		
			System.out.println();
		
		}
		
		s.close(); 
	}

}
 
