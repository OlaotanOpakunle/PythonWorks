package yabo;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class usernames {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner s = new Scanner(new File("email.txt"));
		PrintStream s2 = new PrintStream("usernames.txt");
		
		char symbol;
		
		while (s.hasNext()) {
			symbol = s.findWithinHorizon(".", 0).charAt(0);
			
			while (symbol != '@') {
				s2.print(symbol);
				symbol = s.findWithinHorizon(".", 0).charAt(0);
				
				
			}
			s.nextLine();
			s2.println();
			
		}
		
s.close();
s2.close();
	}

}
