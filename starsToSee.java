package yabo;
import java.util.Scanner;

public class starsToSee {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char response;
		int num;
		int show;
		
		
			
			
		System.out.print("Would you like to see a row of stars?: ");
	
		response = s.findWithinHorizon(".", 0).charAt(0);
		System.out.print("How many stars do you want to see?: ");
		num = s.nextInt();
		
		while(response == 'Y' || response == 'y' && response != 'N' || response != 'n' ) {
		
		
		show = 0;
		while(show < num) {
			
			System.out.print("*");
			show++;
			
			s.nextLine();

		
			
		}
		
		System.out.println();
		
			

			
			
		}
		s.close();
			}
			
		}
	
 

