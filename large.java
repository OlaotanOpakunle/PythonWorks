package yabo;
import java.util.Scanner;
import java.util.Random;
import static java.lang.System.in;
import static java.lang.System.out;

public class large {

	public static void main(String[] args) {
		Scanner s = new Scanner(in);
		int num = 0;
		
		out.print("input number: ");
		
		while (num < 100) {
			num = s.nextInt();
			out.println(num);
		}
	}

}
