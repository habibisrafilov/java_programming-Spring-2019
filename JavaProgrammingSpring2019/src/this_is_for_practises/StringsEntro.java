package this_is_for_practises;

import java.util.Arrays;
import java.util.Scanner;

public class StringsEntro {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		timeConversion(scan.nextLine());
	}

	public static void timeConversion(String s) {
		/*
		 * Write your code here.
		 */
		String[] amArr = { "", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "00" };
		String[] pmArr = { "", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "12" };
		// String s1 = "12"+":05:45"+"AM";
		String s2 = s.substring(2, 8);
		String strAmPm = s.substring(8);// "PM"
		String hour = s.substring(0, 2); // "12"
		String newTime = "";
		int hourInt = Integer.parseInt(hour);

		if (strAmPm.equals("AM")) {
			newTime = amArr[hourInt] + s2;
		} else if (strAmPm.equals("PM")) {
			newTime = pmArr[hourInt] + s2;
		}
		System.out.println(newTime);

	}

}
