package yabo;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class smilo {

	public static void main(String[] args) {
		char response;
		boolean isSmile;
		Scanner s = new Scanner(in);
		Scanner s1 = new Scanner(in);
		out.println("Do you wanna see a smiley face?: ");
		
		response = s.findWithinHorizon(".", 0).charAt(0);
		isSmile = s1.nextBoolean();
		response = isSmile ? 'Y' : 'N';
			if (isSmile) {
				out.print(":-");
			}
			
			if(!isSmile) {
				out.print(":-(");
			}
		if (response == '?') {
			out.println(":-|");
		}
		
s.close();
	}

}
