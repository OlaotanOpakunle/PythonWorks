package yabo;
import java.io.File;
import java.io.FileNotFoundException;
import static java.lang.System.out;
import java.util.Scanner;

public class newHotelData {

	public static void main(String[] args) throws FileNotFoundException{
		Scanner s = new Scanner(new File("dataForHotel"));
		 for (int floor = 1; floor <+ 9; floor++) {
			 out.print("Floor ");
			 out.print(floor);
			 out.print(": ");
			 
			 for (int roomNum = 1; roomNum <= 20; roomNum++ ) {
				 
				 out.print(s.nextInt());
				 out.print(' ');
				 
			 }
			out.println();
			
		 }
		 	s.close();
	}

}
