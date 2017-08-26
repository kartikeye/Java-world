import java.util.Scanner;
class AreaVol
{
  	public static void main(String args[])
  	{
		double r,h;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter radius of the cyclinder :");
		r=s.nextDouble();
		System.out.print("Enetr height of the cyclinder :");
		h=s.nextDouble();
		System.out.println("Area of the cyclinder is :"+area(r,h));
		System.out.println("voluem of the cyclinder is :"+vol(r,h));
	}
	public static double area(double r,double h)
	{
		double area=2*3.14*r*h;
		return area;
	}
	public static double vol(double r,double h)
	{
		double vol=3.14*r*r*h;
		return vol;
	}
}