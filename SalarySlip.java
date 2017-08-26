import java.util.Scanner;
class SalarySlip
{
   public static void main(String args[])
   {
	   double bs,da,ta,hra,ts,tax,ns;
	   Scanner s = new Scanner(System.in);
	   System.out.println("Eneter basic salary :");
	   bs = s.nextDouble();
	   dotLine();
	   da = (bs*50)/100;
	   hra = (bs*20)/100;
	   ta = (bs*10)/100;
	   ts = bs+da+ta+hra;
	   System.out.println("DA :"+da);
	   System.out.println("TA :"+ta);
	   System.out.println("HRA :"+hra);
	   dotLine();
	   System.out.println("Total Salary :"+ts);
	   tax = (ts*8)/100;
	   System.out.println("Tax :"+tax);
	   dotLine();
	   ns = ts-tax;
	   System.out.println("Net Salary :"+ns);


   }
   public static void dotLine()
   {
	   System.out.println(".................................");
   }
}