package yabo;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class week {

	public static void main(String[] args) {
		Scanner s = new Scanner(in);
		int day = 0;
		out.println("Input number of day of the week");
		day = s.nextInt();
		
		switch (day) {
		
		case 1:
			out.println("Sunday");
		break;
		
		case 2:
			out.println("Monday");
		break;
		
		case 3:
			out.println("Tuesday");
		break;
		
		case 4:
			out.println("Wednesday");
		break;
		
		case 5:
			out.println("Thursday");
		break;
		
		case 6:
			out.println("Friday");
		break;
		
		case 7:
			out.println("Saturday");
		break;	
		
		default:
			out.println("Input a number between 1 and 7");
		
		}

	}

}
