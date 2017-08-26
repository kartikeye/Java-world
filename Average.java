import java.util.Scanner;
class Average
{
  public static void main(String args[])
  {
	  double x,y,z;
	  Scanner s = new Scanner(System.in);
	  System.out.print("Enter first number :");
	  x = s.nextDouble();
	  System.out.print("Eneter secound number :");
	  y = s.nextDouble();
	  System.out.print("Eneter third number :");
	  z = s.nextDouble();

	  System.out.println("Average of three number is :"+average(x,y,z));
  }
  public static double average(double a,double b,double c)
  {
	 double avg;
	 avg=(a+b+c)/3;
	 return avg;
  }
}