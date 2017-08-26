import java.util.Scanner;
class Shapes
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of sides from 3 to 10 :");
		int side = s.nextInt();
		switch (side)
		{
			case 3:
			System.out.println("Triangle");
			break;
			case 4:
						System.out.println("Quadrileter");
			break;
			case 5:
						System.out.println("pentagon");
			break;
			case 6:
						System.out.println("hexagon");
			break;
			case 7:
						System.out.println("heptagon");
			break;
			case 8:
						System.out.println("octagon");
			break;
			case 9:
						System.out.println("nanogon");
			break;
			case 10:
						System.out.println("decagon");
			break;
			default:
									System.out.println("Invalid number");

		}

	}
}