import java.util.Scanner;
class TempCponverter
{
   public static void main(String args[])
   {
	   float c,f;
	   Scanner s = new Scanner(System.in);
	   System.out.println("Enter Temperature in celcius :");
	   c = s.nextFloat();
	   f=(9*c/5)+32;
	   System.out.println("Temperature in faranheight is :"+f);
   }
}