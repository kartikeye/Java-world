import java.util.Scanner;
class CaseConverter
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter an alphabet :");
	    char ch = s.next().charAt(0);
	    if(ch>=97&&ch<=122)
	    {
			ch = (char)(ch-32);
			System.out.println("Upper Case :"+ch);
		}
		else if(ch>='A'&&ch<='Z')
		{
			ch = (char)(ch+32);
			System.out.println("Lower case :"+ch);
		}
		else
		{
			System.out.println("Not an alphabet");
		}
	}
}