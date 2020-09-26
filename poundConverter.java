package yabo;
import java.util.Scanner;
import static java.lang.System.out;

public class poundConverter {

	public static void main(String[] args) {
		int pounds = 1; 
		double dollars = 1.25; 
		int num;
		Scanner s = new Scanner(System.in);
			
		
		
		out.print("Pounds");
		out.print("\t \t");
		out.println("Dollars");
		 for(int times = 0; times < 1; times ++) {
			 
			 out.print(pounds);
			 out.print("\t \t");
			 out.println(dollars * pounds);
			 
			 for (pounds = 2; pounds <= 9; pounds++) {
				 out.print(pounds);
				 out.print("\t \t");
				 out.println(dollars * pounds);
				 
				 
			 }
			 
			 s.close();
			 
		 }
		 
	}

}
// a \t in java signifies a tab
