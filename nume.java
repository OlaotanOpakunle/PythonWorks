package yabo;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;
public class nume {

	public static void main(String[] args) {
		Scanner s = new Scanner(in);
		int num = 0;
		int total = 0;
		out.println("num\ttotal");
		while (num >= 0) {
			num = s.nextInt();
			total += num;

			out.print(num);
			out.print("\t");
			out.println(total);
			
			
		}
         if (num < 0) {
        	  
        	out.println(total - num);
        	 
         }
	}

}
