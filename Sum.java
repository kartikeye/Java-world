import java.util.Scanner;
import java.lang.*;
class Sum
{
	public static void main(String args[])
	{
		float x,y,sum;
		Scanner s = new Scanner(System.in);
		System.out.print("First number :");
		x = s.nextFloat();
		System.out.print("Second number :");
		y = s.nextFloat();
		sum=x+y;
		//System.out.println("The sum of " +x+" and "+y+" is "+sum);
		System.out.printf("\nthe sum of %.2f and %.2f is %.2f",x,y,sum);
	}
}