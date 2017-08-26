import java.util.Scanner;
class Symmetric
{
	public static void main(String args[])
	{
		int y;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a 4 digit number :");
		int n = s.nextInt();
		if(n%100==n/100)
		{
			System.out.println("Number is symmetric ");
		}
		else
		{
			System.out.println("Number is not symmetric");
		}
	}
}