import java.util.Scanner;
class VowelChecker
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter an alphabet :");
		char ch = s.next().charAt(0);
		switch(ch)
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			System.out.println("vowel");
			break;
			default:
			System.out.println("consonent");

		}
	}
}