import java.util.Scanner;
class LeapYear
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter year :");
		int n = s.nextInt();
		if(n%400==0||n%4==0&&n%100!=0)
		System.out.println("Leap year :");
		else
		System.out.println("Not a leap year :");
	}
}