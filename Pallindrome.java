import java.util.Scanner;
class Pallindrome
{
	public static void main(String args[])
	{
		int a,b,c,d,e,f;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a 4 digit number :");
		int x = s.nextInt();
		a=x%10;
		b=x%100;
		c=b/10;
		d=x%1000;
		e=d/100;
		f=x/1000;
		if(a==f&&c==e)
		{
			System.out.println("Number is pallindrome");
		}
		else
		{
			System.out.println("Number is not pallindrome");
		}
	}
}