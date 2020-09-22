package yabo;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
public class okay {

	public static void main(String[] args) throws FileNotFoundException{
		PrintStream txt = new PrintStream(new File("approval.txt"));
		
		txt.print('O');
		txt.print('K');
		
		txt.close();

	}

}
