
/*
 *  program which accepts the date in format (date month year) and print in
 *   format yyyy-mm-dd 
 */
//import Scanner to input date
import java.util.Scanner;

//defining the class
public class StringToDateExa {
	// main function
	public static void main(String[] args) {
		// format specific input
		System.out.println("enter the in format dd/mm/yyyy  \n or dd,mm,yyyy");
		// taking input
		System.out.println("enter the date ");
		Scanner obj = new Scanner(System.in);
		String date = obj.nextLine();
		// condition whether date contain ,
		if (date.indexOf(",") >= 0) {
			String[] c = date.split(",");
			// printing the format

			System.out.print("Format of the date which  is updated \n" + c[2] + "-" + c[1] + "-" + c[0]);
		}
		// else if date contain /
		if (date.indexOf("/") >= 0) {
			// split from /
			String[] b = date.split("/");
			// print the format
			System.out.print("Format of the date which  is updated \n" + b[2] + "-" + b[1] + "-" + b[0]);
		}
	}

}
