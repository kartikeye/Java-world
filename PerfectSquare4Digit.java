import java.util.Scanner;
class PerfectSquare4Digit
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a four digit number :");
		int x = s.nextInt();
		int y= x/100;
		int z= x%100;
		int a= (int)Math.sqrt(y);
		int b= (int)Math.sqrt(z);
		if(a*a==y&&b*b==z)
		{
			System.out.println("Number is perfect square ");
		}
		else
		{
			System.out.println("Number is not perfect sqare ");
		}
	}
}