package yabo;
import java.util.Scanner;
public class scatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		char c1, c2, c3;
		
		c1 = s.findWithinHorizon(".", 0).charAt(0);
		c2 = s.findWithinHorizon(".", 0).charAt(0);
		c3 = s.findWithinHorizon(".", 0).charAt(0);
		
		System.out.print(c1);
		System.out.print(c2);
		System.out.print(c3);
		System.out.println();
		
		System.out.print(c1);
		System.out.print(c3);
		System.out.print(c2);
		System.out.println();
		
		System.out.print(c3);
		System.out.print(c1);
		System.out.print(c2);
		System.out.println();
		
		System.out.print(c3);
		System.out.print(c2);
		System.out.print(c1);
		System.out.println();
		
		System.out.print(c2);
		System.out.print(c1);
		System.out.print(c3);
		System.out.println();
		
		System.out.print(c2);
		System.out.print(c3);
		System.out.print(c1);
		System.out.println();
		
		
	}

}
