import java.util.Scanner;
class NetPrice
{
  public static void main (String args[])
  {
	  double p,d;
	  Scanner s = new Scanner(System.in);
	  System.out.println("Enter price of the product :");
	  p=s.nextDouble();
	  System.out.println("Enter discount percent :");
	  d=s.nextDouble();
	  System.out.println("Net Price of the product is :"+netPrice(p,d));
  }
  public static double netPrice(double p,double d)
  {
	  double netPrice = p-(p*d/100);
	  return netPrice;
  }
}