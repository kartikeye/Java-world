import java.util.Scanner;
class Numberoperater
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two Number :");
		double a = s.nextDouble();
		double b = s.nextDouble();
		System.out.println("Enter an operater");
		char op = s.next().charAt(0);
		switch(op)
		{
			case '+':
			double z=a+b;
			System.out.println("addition of two numbers is :"+z);
			break;
			case '-':
						double c=a-b;
						System.out.println("subtraction of two numbers is :"+c);
			break;
			case '/':
						double d=a/b;
						System.out.println("division of two numbers is :"+d);
			break;
			case '*':
						double e=a*b;
						System.out.println("product of two numbers is :"+e);
			break;
			case '%':
						double f=a%b;
						System.out.println("modulus of two numbers is :"+f);
			break;
			default:
									System.out.println("invalid operater is entered");

		}
	}
}