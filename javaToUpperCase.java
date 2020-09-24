package yabo;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class javaToUpperCase {

	public static void main(String[] args) throws FileNotFoundException{
		char symbol;
		Scanner s = new Scanner(new File("input.txt"));
		PrintStream s2 = new PrintStream("Capital.txt");
		 
		
			while(s.hasNext()) { 
				symbol = s.findWithinHorizon(".", 0).charAt(0);
				
				s2.print(Character.toUpperCase(symbol));
				System.out.print(Character.toUpperCase(symbol));
			}
		
s.close();
	}

}
