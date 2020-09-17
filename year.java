package yabo;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;
public class year {

	public static void main(String[] args) {
		Scanner s = new Scanner(in);
		int month, numberOfDays = 0;
		
		out.println("Which month?: ");
		month = s.nextInt();
		boolean isLeapYear;
		
		
		switch (month) {
		
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			
			numberOfDays = 31;
			break;
			
		case 4:
		case 6:
		case 9:
		case 11:
			
			numberOfDays = 30;
			break;
			
		case 2:
			out.println("Leap Year, true/false");
			isLeapYear = s.nextBoolean();
			if(isLeapYear) {
				numberOfDays = 29;
				}
				else if (!isLeapYear){
					numberOfDays = 28;
				
				}
			
			}
		out.println("Number of days: ");	
		out.print(numberOfDays);
		s.close();
		}

	}


