package PalindromeProject;

import java.util.Scanner;

public class PalindromicDate {
	private static int dayOfMonth; 
	// method to get String representation of a month number
	public static String getMonthStr(int m) {

		if (m < 10)
			return "0" + m;
		else
			return "" + m;
	}

	// method to get String representation of a day number
	public static String getDayStr(int day) {
		if (day < 10)
			return "0" + day;
		else
			return "" + day;
	}

	// method to get number of days in month
	public static int getNumDays(int m, int year) {
		switch (m) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 2:
			if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
				return dayOfMonth= 29;
			else
				return dayOfMonth=28;
		default:
			return dayOfMonth=30;
		}
	}

	// function to get month name
	public static String getMonthName(int month) {
		String monthStr = "";
		switch (month) {
		case 1:
			monthStr = "January";
			break;
		case 2:
			monthStr = "February";
			break;
		case 3:
			monthStr = "March";
			break;
		case 4:
			monthStr = "April";
			break;
		case 5:
			monthStr = "May";
			break;
		case 6:
			monthStr = "June";
			break;
		case 7:
			monthStr = "July";
			break;
		case 8:
			monthStr = "August";
			break;
		case 9:
			monthStr = "September";
			break;
		case 10:
			monthStr = "October";
			break;
		case 11:
			monthStr = "November";
			break;
		case 12:
			monthStr = "December";
			break;
		default:
			monthStr = "";
		}
		return monthStr;
	}

	// function to check whether a string is palindrome or not
	public static boolean isPalindrome(String str) {
		int len = str.length();

		for (int i = 0, j = len - 1; i < j; i++, j--)
			if (str.charAt(i) != str.charAt(j))
				return false;
		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("Enter a year: ");
			int year = sc.nextInt();

			for (int month = 1; month <= 12; month++) {

				String monthStr = getMonthStr(month);

				for (int day = 1; day <= getNumDays(month, year); day++) {
					String daeStr = monthStr + getDayStr(day) + year;

					if (isPalindrome(daeStr)) {
						System.out.println("   " + getMonthName(month) + " " + day + ", " + year);
					}
				}
			}
			System.out.print("Do you want to test more year(yes/no)? ");
			String op = sc.next();

			if (!"yes".equalsIgnoreCase(op))
				break;
		}

	}
}
