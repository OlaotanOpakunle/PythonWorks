package yabo;

import java.util.Scanner;

public class moregums {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		Scanner s1 = new Scanner(System.in);
		
		int gumBalls;
		int numberOfKids;
		int gumBallPerKid;
		
		
		System.out.println("How many gumballs are there? ");
		
				gumBalls = s.nextInt();
		
		System.out.print("How many kids? ");
				numberOfKids = s.nextInt();

				gumBallPerKid = gumBalls / numberOfKids;
				
				System.out.print("Each kid gets ");
				System.out.print(gumBallPerKid);
				System.out.print(" gumballs");
	}

}
