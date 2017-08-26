import java.util.Scanner;
class PerfectSquare
{
	public static void main(String args[])
	{
		int y;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = s.nextInt();
		if(y==Math.sqrt(n))
		{
			System.out.println("Number is perfect square");
		}
		else
		{
			System.out.println("Not a perfect square");
		}

	}
}