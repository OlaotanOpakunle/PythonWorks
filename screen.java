package yabo;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
public class screen {

	public static void main(String[] args)throws FileNotFoundException {
		
		Scanner s = new Scanner(new File("myData.txt"));
		PrintStream s2 = new PrintStream("myOutput.txt");
		
		double unitPrice, total;
		int quantity;
		
		unitPrice = s.nextDouble();
		quantity =s.nextInt();
		
		total = unitPrice * quantity;
		
		s2.println(total);
		
		s.close();
		s2.close();

	} 

}
