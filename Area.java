import java.util.Scanner;
class Area
{
  public static void main(String args[])
  {
	  double r,d,peri,area;
	  Scanner s = new Scanner(System.in);
	  System.out.println("Enter radius of the circle :");
	  r = s.nextDouble();
	  d=2*r;
	  System.out.println("Diameter of the circle :"+d);
	  peri=2*3.14*r;
	  System.out.println("Perimeter of the circle :"+peri);
	  area=3.14*r*r;
	  System.out.println("Area of the circle :"+area);
  }
}