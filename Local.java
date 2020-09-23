package yabo;
import java.text.NumberFormat;
import java.util.Scanner;
import java.util.Locale;

public class Local {

	public static void main(String[] args) {
		java.util.Scanner keyboard = new Scanner(System.in);
		keyboard.useLocale(Locale.UK);
		
		double unitPrice;
		int quantity;
		boolean taxable;
		
		NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.UK);
		
		System.out.print("Unit price: ");
	    unitPrice = keyboard.nextDouble();
	    System.out.print("Quantity: ");
	    quantity = keyboard.nextInt();
	    System.out.print("Taxable? (true/false) ");
	    taxable = keyboard.nextBoolean();
	 
	    double total = unitPrice * quantity;
	    if (taxable) {
	    	total *= 1.05;
	    }
		
	    String niceTotal = currency.format(total);
	    
	    System.out.print("Total: ");
	    System.out.println(niceTotal);
	 
	    keyboard.close();
		

	}

}
