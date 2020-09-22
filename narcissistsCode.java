package yabo;
import java.util.Scanner;

public class narcissistsCode {

	public static void main(String[] args) {
		int howMany, num;
		String name;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("What is your name?: ");
		name = s.nextLine(); 
		System.out.println("How many times?: ");
		howMany = s.nextInt();
		
		for (num = 0; num < howMany; num++) {
			System.out.println(name);
			s.hasNextLine();
		}
		

	}

}
