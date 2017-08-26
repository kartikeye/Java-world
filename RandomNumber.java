import java.util.concurrent.ThreadLocalRandom;

class RandomNumber
{
    public static void main(String args[])
    {
		int min = 10,max = 20;
		//int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
		//int randomNum = min + (int)(Math.random() * ((max - min) + 1));
		int randomNum = min + (int)(Math.random()*10);
		System.out.println("Random number between 10 and 20 is :"+randomNum);
	}
}