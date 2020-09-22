package yabo;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class numbe {

	public static void main(String[] args) {
		int num;
		out.print("Input number: ");
		Scanner s = new Scanner(in);
		num = s.nextInt();
		
		if (num == 0) {
			out.println("Zero");
		}
		
		if (num > 0) {
			out.println("Positive Integer");
		}
		
		if (num < 0) {
			out.println("Negative Integer");
		}
		s.close();

	}

}
