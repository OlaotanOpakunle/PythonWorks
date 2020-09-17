package MyFirstProject;
import java.util.Scanner;


public class snit {

	public static void main(String[] args) {
		double price;

		System.out.print("Input your price: ");
		
		Scanner s = new Scanner(System.in);
		price = s.nextDouble();
		
		
		price = price + 10;
		
		System.out.print("We will charge you $");
		System.out.println(price);

		
		
	}

}
