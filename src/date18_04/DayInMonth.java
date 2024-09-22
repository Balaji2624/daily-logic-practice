// Counting number of days in a given month of a year:

package date18_04;

import java.util.Scanner;

public class DayInMonth {
	public static boolean LeapYear(int year) {
		boolean isLeap = false;
		if (year % 4 == 0 || year % 100 == 0 || year % 400 == 0) {
			isLeap = true;
		} else {
			isLeap = false;
		}
		return isLeap;
	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Year : ");
		int year = scan.nextInt();
		System.out.println("Enter a Month from that year : ");
		int month = scan.nextInt();

		if (month < 0 || month > 12) {
			System.out.println("Enter a Valid Input between 1 to 12");
		} else {
			int daysInMonth;

			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				daysInMonth = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				daysInMonth = 30;
				break;
			case 2:
				if (LeapYear(year)) {
					daysInMonth = 29;
				} else {
					daysInMonth = 28;
				}

				System.out.println("Number of days in " + month + " of year " + year + " is : " + daysInMonth);
			}
		}
	}
}
